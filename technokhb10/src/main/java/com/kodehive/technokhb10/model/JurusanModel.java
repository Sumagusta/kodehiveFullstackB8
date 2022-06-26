package com.kodehive.technokhb10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jurusan_Table")
public class JurusanModel {
	
	@Id
	@Column(name = "kode")
	private String kd_jurusan;
	
	@Column(name = "name")
	private String nm_jurusan;
	
	// getter dan setter
	
	
}
