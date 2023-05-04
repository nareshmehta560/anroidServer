package com.example.anroidserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TestController {

    @Autowired
    private BusinessLogik businessLogik;

    @PostMapping("/saveStudent")

    public Student testMethod(@RequestBody Student student){
        return businessLogik.saveStudent(student);
    }
}
