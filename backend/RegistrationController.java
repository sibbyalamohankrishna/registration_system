package com.example.registration.controller;

import com.example.registration.model.Registration;
import com.example.registration.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {
    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @PostMapping
    public Registration createRegistration(@RequestBody Registration registration) {
        return service.saveRegistration(registration);
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return service.getAllRegistrations();
    }

    @PutMapping("/{id}")
    public Registration updateRegistration(@PathVariable int id, @RequestBody Registration updatedData) {
        return service.updateRegistration(id, updatedData);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable int id) {
        service.deleteRegistration(id);
    }
}
