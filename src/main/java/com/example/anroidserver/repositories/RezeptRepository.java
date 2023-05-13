package com.example.anroidserver.repositories;
import com.example.anroidserver.model.rezept.Rezept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezeptRepository extends CrudRepository<Rezept,Integer> {

}
