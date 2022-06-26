package com.kodehive.technokhb10.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodehive.technokhb10.model.MahasiswaModel;
import com.kodehive.technokhb10.service.IMahasiswaService;

@Controller
public class MahasiswaController {
	
	@Autowired
	IMahasiswaService mahasiswaService;

	@RequestMapping("/home")
	public String home() {
		return "/mahasiswa/home";
	}

	@RequestMapping("/add")
	public String add() {
		return "/mahasiswa/add";
	}
	
	@RequestMapping("/create")
	public String create(HttpServletRequest request) {
		String kode = request.getParameter("kode");
		String kodeJurusan = request.getParameter("kodeJurusan");
		String namaMahasiswa = request.getParameter("namaMhs");
		int usia = Integer.valueOf(request.getParameter("usia"));
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setKd_mhs(kode);
		mahasiswaModel.setKd_jurusan(kodeJurusan);
		mahasiswaModel.setNm_mhs(namaMahasiswa);
		mahasiswaModel.setUsia(usia);
		
		mahasiswaService.save(mahasiswaModel);
		
		return "/mahasiswa/home";
	}
	
	@RequestMapping("/list")
	public String readData(Model model) {
		
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.readData();
		
		model.addAttribute("bungkusanBacaData", mahasiswaModelList);
		
		return "/mahasiswa/list";
	}
	
}
