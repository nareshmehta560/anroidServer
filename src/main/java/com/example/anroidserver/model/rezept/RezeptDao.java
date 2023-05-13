package com.example.anroidserver.model.rezept;

import com.example.anroidserver.repositories.RezeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RezeptDao {
    @Autowired
    private RezeptRepository rezeptRepository;

    public Rezept saveRezept(Rezept rezept) {
         return rezeptRepository.save(rezept);
    }

    public List<Rezept> getAllRezept() {
        List<Rezept> rezepts = new ArrayList<>();
        Streamable.of(rezeptRepository.findAll())
                .forEach(rezepts::add);
        return rezepts;
    }
    public void delete(int rezeptid) {
        rezeptRepository.deleteById(rezeptid);
    }
}
