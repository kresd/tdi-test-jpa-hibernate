package com.tdi.spring.hibernate.testjpahibernate;

import com.tdi.spring.hibernate.testjpahibernate.entity.Nasabah;
import com.tdi.spring.hibernate.testjpahibernate.entity.ProdukTabungan;
import com.tdi.spring.hibernate.testjpahibernate.entity.TransaksiTabungan;
import com.tdi.spring.hibernate.testjpahibernate.repository.NasabahDao;
import com.tdi.spring.hibernate.testjpahibernate.repository.ProdukTabunganDao;
import com.tdi.spring.hibernate.testjpahibernate.repository.TransaksiTabunganDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class TestJpaHibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TestJpaHibernateApplication.class, args);

		ProdukTabunganDao produkTabunganDao = applicationContext.getBean(ProdukTabunganDao.class);
		NasabahDao nasabahDao = applicationContext.getBean(NasabahDao.class);
		TransaksiTabunganDao transaksiTabunganDao = applicationContext.getBean(TransaksiTabunganDao.class);


		//INSERT PRODUK TABUNGAN
		ProdukTabungan TB01 = new ProdukTabungan(
				"TB01",
				"TabunganKu"
		); TB01 = produkTabunganDao.save(TB01);

		ProdukTabungan TB02 = new ProdukTabungan(
				"TB02",
				"Tabungan Mapan"
		); TB02 = produkTabunganDao.save(TB02);

		ProdukTabungan TB03 = new ProdukTabungan(
				"TB03",
				"Tabungan Umroh"
		); TB03 = produkTabunganDao.save(TB03);



		//INSERT TRANSAKSI TABUNGAN
		List<TransaksiTabungan> listTransaksi = new ArrayList<>();

		TransaksiTabungan trans1 = new TransaksiTabungan(
				1,
				"001",
				LocalDate.of(2017,8,1),
				new BigDecimal(250000),
				BigDecimal.ZERO,
				new BigDecimal(250000)
		); trans1 = transaksiTabunganDao.save(trans1);

		TransaksiTabungan trans2 = new TransaksiTabungan(
				2,
				"001",
				LocalDate.of(2017,8,20),
				new BigDecimal(250000),
				BigDecimal.ZERO,
				new BigDecimal(500000)
		); trans2 = transaksiTabunganDao.save(trans2);

		TransaksiTabungan trans3 = new TransaksiTabungan(
				3,
				"001",
				LocalDate.of(2017,8,21),
				new BigDecimal(50000),
				BigDecimal.ZERO,
				new BigDecimal(550000)
		); trans3 = transaksiTabunganDao.save(trans3);


		TransaksiTabungan trans4 = new TransaksiTabungan(
				4,
				"002",
				LocalDate.of(2017,8,21),
				BigDecimal.ZERO,
				new BigDecimal(250000),
				new BigDecimal(250000)
		); trans4 = transaksiTabunganDao.save(trans4);


		listTransaksi.add(trans1);
		listTransaksi.add(trans2);
		listTransaksi.add(trans3);
		listTransaksi.add(trans4);

		//INSERT NASABAH
		Nasabah n1 = new Nasabah(
				1,
				"Sulaeman Hasim",
				"Jl. Bojongsoang no 110",
				"Bandung",
				"Ciparay",
				"081123123543",
				listTransaksi
		); n1 = nasabahDao.save(n1);
	}
}
