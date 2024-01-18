package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserService userService;
    @Autowired
    private DataProcessingService dataProcessingService;
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
    public void processRegistration(String name, int age, String email) {
        User user = userService.createUser(name,age,email);
   }
}
