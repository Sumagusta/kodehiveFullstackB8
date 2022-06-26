package com.kodehive.technokhb10.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.technokhb10.model.MahasiswaModel;
import com.kodehive.technokhb10.repository.MahasiswaDAORepository;
import com.kodehive.technokhb10.service.IMahasiswaService;

@Service
public class MahasiswaService implements IMahasiswaService {
	
	// Dependencies Injection
	@Autowired
	MahasiswaDAORepository mahasiswaRepository;
	
	@Override
	public void save(MahasiswaModel mahasiswaModel) {
		mahasiswaRepository.save(mahasiswaModel);		
	}

	@Override
	public List<MahasiswaModel> readData() {

		return mahasiswaRepository.findAll();
		
	}

}
