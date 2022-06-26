package com.kodehive.technokhb10.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MahasiswaModel {
	
	@Id
	private String kd_mhs;
	private String nm_mhs;
	private String kd_jurusan;
	private int usia;
	
	public String getKd_mhs() {
		return kd_mhs;
	}
	public void setKd_mhs(String kd_mhs) {
		this.kd_mhs = kd_mhs;
	}
	public String getNm_mhs() {
		return nm_mhs;
	}
	public void setNm_mhs(String nm_mhs) {
		this.nm_mhs = nm_mhs;
	}
	public String getKd_jurusan() {
		return kd_jurusan;
	}
	public void setKd_jurusan(String kd_jurusan) {
		this.kd_jurusan = kd_jurusan;
	}
	public int getUsia() {
		return usia;
	}
	public void setUsia(int usia) {
		this.usia = usia;
	}
	
	
}
