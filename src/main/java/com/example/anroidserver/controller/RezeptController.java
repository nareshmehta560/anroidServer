package com.example.anroidserver.controller;

import com.example.anroidserver.model.rezept.Rezept;
import com.example.anroidserver.model.rezept.RezeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class RezeptController {
    @Autowired
    private RezeptDao rezeptDao;


    @PostMapping("/rezept/save")
    public Rezept saveMethod(@RequestBody Rezept rezept) {
        return rezeptDao.saveRezept(rezept);
    }



    @GetMapping("/rezept/get")
    public List<Rezept> getMehod() {
        return rezeptDao.getAllRezept();
    }
    @DeleteMapping("/rezept/{rezeptid}")
    public void deleteRezept(@PathVariable("rezeptid") int id){
        rezeptDao.delete(id);
    }

}
