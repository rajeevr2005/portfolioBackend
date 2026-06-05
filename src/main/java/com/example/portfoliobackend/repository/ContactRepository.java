package com.example.portfoliobackend.repository;

import com.example.portfoliobackend.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}