document.getElementById('registrationForm').addEventListener('submit', async function (event) {
    event.preventDefault();
    const registration = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        dateOfBirth: document.getElementById('dob').value,
        phoneNumber: document.getElementById('phone').value,
    };

    await fetch('http://localhost:8080/api/registrations', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(registration),
    });

    loadRegistrations();
});

async function loadRegistrations() {
    const response = await fetch('http://localhost:8080/api/registrations');
    const registrations = await response.json();
    const list = document.getElementById('registrationList');
    list.innerHTML = registrations.map(reg => `<li>${reg.name} - ${reg.email}</li>`).join('');
}

loadRegistrations();
