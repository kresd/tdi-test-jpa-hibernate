package com.tdi.spring.hibernate.testjpahibernate.repository;

import com.tdi.spring.hibernate.testjpahibernate.entity.ProdukTabungan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProdukTabunganDao {

    @Autowired
    private ProdukTabunganJpaRepository repository;

    public ProdukTabungan save (ProdukTabungan p) {
        return repository.save(p);
    }

    public Optional<ProdukTabungan> findById(String id) {
        return repository.findById(id);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public Iterable<ProdukTabungan> findAll() {
        return repository.findAll();
    }


}
