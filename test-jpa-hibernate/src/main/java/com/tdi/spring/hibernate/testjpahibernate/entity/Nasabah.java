package com.tdi.spring.hibernate.testjpahibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "master_nasabah")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nasabah", nullable = false)
    private Integer id;

    @Column(name = "nama_nasabah", length = 100, nullable = false)
    private String nama;

    @Column(name = "alamat", length = 100, nullable = false)
    private String alamat;

    @Column(name = "asal_kota", length = 50, nullable = false)
    private String asalKota;

    @Column(name = "asal_kecamatan", length = 50, nullable = false)
    private String asalKecamatan;

    @Column(name = "no_hp", length = 13, nullable = false)
    private String noHp;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "history_transaksi_nasabah",
            joinColumns = @JoinColumn(name = "nasabah_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "transaksi_id", nullable = false)
    )
    private List<TransaksiTabungan> listTransaksi = new ArrayList<>();
}
