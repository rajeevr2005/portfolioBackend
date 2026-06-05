package com.example.portfoliobackend.controller;

import com.example.portfoliobackend.entity.Contact;
import com.example.portfoliobackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public String test() {
        return "Backend Running";
    }

    @PostMapping
    public ResponseEntity<?> saveContact(@RequestBody Contact contact) {

        contactRepository.save(contact);

        return ResponseEntity.ok(
                Map.of("message", "Data Saved Successfully")
        );
    }
}