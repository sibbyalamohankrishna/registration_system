package com.example.registration.service;

import com.example.registration.model.Registration;
import com.example.registration.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    private final RegistrationRepository repository;

    public RegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    public Registration saveRegistration(Registration registration) {
        return repository.save(registration);
    }

    public List<Registration> getAllRegistrations() {
        return repository.findAll();
    }

    public Registration updateRegistration(int id, Registration updatedData) {
        return repository.findById(id).map(registration -> {
            registration.setName(updatedData.getName());
            registration.setEmail(updatedData.getEmail());
            registration.setDateOfBirth(updatedData.getDateOfBirth());
            registration.setPhoneNumber(updatedData.getPhoneNumber());
            return repository.save(registration);
        }).orElseThrow(() -> new RuntimeException("Registration not found"));
    }

    public void deleteRegistration(int id) {
        repository.deleteById(id);
    }
}