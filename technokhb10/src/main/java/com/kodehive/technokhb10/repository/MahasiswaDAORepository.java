package com.kodehive.technokhb10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kodehive.technokhb10.model.MahasiswaModel;

@Repository
public interface MahasiswaDAORepository extends JpaRepository<MahasiswaModel, String> {
	
	// Contoh custome query dinamis value dengan 1 parameter
//	@Query("select m from mahasiswa_model m where m.kd_mhs = ?1 ")
//	MahasiswaModel cariId(String kdMhs);
	
	// Contoh custome query dinamis value dengan >1 parameter
//	@Query("select m from mahasiswa_model m where m.nm_mhs = ?1 and m.usia = ?2")
//	List<MahasiswaModel> cariDataMahasiswa(String namaMahasiswa, int usia);
}
