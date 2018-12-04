package com.tdi.spring.hibernate.testjpahibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transaksi_tabungan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransaksiTabungan {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "kode", nullable = false, length = 50)
    private String kode;

    @Column(name = "tanggal_transaksi")
    private LocalDate tanggalTransaksi;

    @Column(name = "debet")
    private BigDecimal debet;

    @Column(name = "kredit")
    private BigDecimal kredit;

    @Column(name = "saldo")
    private BigDecimal saldo;

}
