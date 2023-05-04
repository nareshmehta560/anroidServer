package com.example.anroidserver.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
class BusinessLogik {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student){
        Student toSaveStudent = new Student();
        toSaveStudent.setName(student.getName());
      return  studentRepo.save(toSaveStudent);
    }
}
