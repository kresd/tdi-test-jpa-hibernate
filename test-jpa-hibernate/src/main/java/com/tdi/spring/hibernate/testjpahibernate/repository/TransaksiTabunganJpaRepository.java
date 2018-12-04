package com.tdi.spring.hibernate.testjpahibernate.repository;

import com.tdi.spring.hibernate.testjpahibernate.entity.TransaksiTabungan;
import org.springframework.data.repository.CrudRepository;

public interface TransaksiTabunganJpaRepository extends CrudRepository<TransaksiTabungan, Integer> {
}
