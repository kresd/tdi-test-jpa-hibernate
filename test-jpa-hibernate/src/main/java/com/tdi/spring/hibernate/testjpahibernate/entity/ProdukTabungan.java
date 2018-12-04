package com.tdi.spring.hibernate.testjpahibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "produk_tabungan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdukTabungan {

    @Id
    @Column(name = "kode", nullable = false, length = 50)
    private String id;

    @Column(name = "nama_tabungan", length = 30)
    private String namaTabungan;
}
