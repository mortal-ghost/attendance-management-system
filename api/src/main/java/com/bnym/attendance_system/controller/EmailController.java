package com.bnym.attendance_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnym.attendance_system.models.EmailDetails;
import com.bnym.attendance_system.service.EmailService;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody EmailDetails emailDetails) throws MessagingException {
        emailService.sendEmail(emailDetails);
        return "Email sent successfully";
    }

    @PostMapping("/testEmailService")
    public String testEmailService() {
        EmailDetails emailDetails = new EmailDetails("anmoldeepsingh148@gmail.com", "Test email", "Test email", null);
        
        System.out.println(emailDetails);
        try {
            emailService.sendEmail(emailDetails);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Email sending failed";
        }

        return "Email sent successfully";
    }
}
