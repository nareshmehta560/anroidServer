package com.example.anroidserver.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service

interface StudentRepo extends JpaRepository<Student, Long>{
}


