package com.GPspring.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GPspring.web.repository.MasjipDAO;
import com.GPspring.web.vo.ResdatDTO;

@Service
public class MasjipService {
	
	
	
	@Autowired
	private MasjipDAO mjDAO;
	
	
	public ArrayList<ResdatDTO> masjiprec() {
		 
		ArrayList<ResdatDTO> rslist = (ArrayList<ResdatDTO>)mjDAO.masjiprec();
		
		return rslist;

	}
	
	public ArrayList<ResdatDTO> masjipkor() {
		 
		ArrayList<ResdatDTO> rslist = (ArrayList<ResdatDTO>)mjDAO.masjipkor();
		
		return rslist;

	}
	
	public ArrayList<ResdatDTO> masjipjpn() {
		 
		ArrayList<ResdatDTO> rslist = (ArrayList<ResdatDTO>)mjDAO.masjipjpn();
		
		return rslist;

	}
	
	public ArrayList<ResdatDTO> masjipchn() {
		 
		ArrayList<ResdatDTO> rslist = (ArrayList<ResdatDTO>)mjDAO.masjipchn();
		
		return rslist;

	}
	
	public ArrayList<ResdatDTO> masjipwest() {
		 
		ArrayList<ResdatDTO> rslist = (ArrayList<ResdatDTO>)mjDAO.masjipwest();
		
		return rslist;

	}
	
	
	
	
	
	
	
	

}
