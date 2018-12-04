package com.tdi.spring.hibernate.testjpahibernate.repository;

import com.tdi.spring.hibernate.testjpahibernate.entity.TransaksiTabungan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TransaksiTabunganDao {

    @Autowired
    private TransaksiTabunganJpaRepository repository;

    public TransaksiTabungan save(TransaksiTabungan t) {
        return repository.save(t);
    }

    public Optional<TransaksiTabungan> findById( Integer id) {
        return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Iterable<TransaksiTabungan> findAll() {
        return repository.findAll();
    }

}
