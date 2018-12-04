package com.tdi.spring.hibernate.testjpahibernate.repository;

import com.tdi.spring.hibernate.testjpahibernate.entity.Nasabah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class NasabahDao {

    @Autowired
    private NasabahJpaRepository repository;

    public Nasabah save(Nasabah n) {
        return repository.save(n);
    }

    public Optional<Nasabah> findById(Integer id) {
        return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Iterable<Nasabah> findAll() {
        return repository.findAll();
    }

}
