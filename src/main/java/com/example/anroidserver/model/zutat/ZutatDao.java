package com.example.anroidserver.model.zutat;

import com.example.anroidserver.repositories.ZutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZutatDao {
    @Autowired
    private ZutatRepository zutatRepository;

    public Zutat saveZutat(Zutat zutat) {
        return zutatRepository.save(zutat);
    }

    public List<Zutat> getAllZutat() {
        List<Zutat> zutats = new ArrayList<>();
        Streamable.of(zutatRepository.findAll())
                .forEach(zutats::add);
        return zutats;
    }
    public void deleteZutat(int zutatid) {
        zutatRepository.deleteById(zutatid);
    }

}
