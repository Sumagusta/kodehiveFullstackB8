package com.kodehive.technokhb10.service;

import java.util.List;

import com.kodehive.technokhb10.model.MahasiswaModel;

public interface IMahasiswaService {

	public void save(MahasiswaModel mahasiswaModel);
	
	public List<MahasiswaModel> readData();
	
}
