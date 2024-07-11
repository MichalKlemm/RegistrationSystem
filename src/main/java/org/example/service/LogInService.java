package org.example.service;

import org.example.LogIn;
import org.example.repository.LogInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LogInService {

    @Autowired
    private LogInRepository logInRepository;

    public LogIn createUser(LogIn logIn) {
        logIn.setUuid(UUID.randomUUID().toString());
        return logInRepository.save(logIn);
    }

    public LogIn getUserById(Long id) {
        return logInRepository.findById(id).orElse(null);
    }

    public List<LogIn> getAllUsers() {
        return logInRepository.findAll();
    }

    public LogIn updateUser(LogIn logIn) {
        Optional<LogIn> existingLogIn = logInRepository.findById(logIn.getId());
        if (existingLogIn.isPresent()) {
            LogIn updatedLogIn = existingLogIn.get();
            updatedLogIn.setName(logIn.getName());
            updatedLogIn.setSurname(logIn.getSurname());
            return logInRepository.save(updatedLogIn);
        }
        return null;
    }

    public void deleteUser(Long id) {
        logInRepository.deleteById(id);
    }
}

