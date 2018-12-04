package com.tdi.spring.hibernate.testjpahibernate.repository;

import com.tdi.spring.hibernate.testjpahibernate.entity.Nasabah;
import org.springframework.data.repository.CrudRepository;

public interface NasabahJpaRepository extends CrudRepository<Nasabah, Integer> {
}
