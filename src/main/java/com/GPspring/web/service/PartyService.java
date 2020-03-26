package com.GPspring.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GPspring.web.repository.PartyDAO;
import com.GPspring.web.vo.PartyDTO;

@Service
public class PartyService {
	
	@Autowired
	private PartyDAO paDAO;
	
	
	public boolean partyregist(PartyDTO padto) {
		 
		boolean ok = paDAO.partyregist(padto);
		
		return ok;

	}
	
	public ArrayList<PartyDTO> partycate(String cate) {
		 
		ArrayList<PartyDTO> palist = (ArrayList<PartyDTO>)paDAO.partycate(cate);
		
		return palist;

	}
	
	public ArrayList<PartyDTO> partycatere(String cate) {
		 
		ArrayList<PartyDTO> palist = (ArrayList<PartyDTO>)paDAO.partycatere(cate);
		
		return palist;

	}
	
	public PartyDTO partyinfo(int pnum) {
		 
		PartyDTO palist = (PartyDTO)paDAO.partyinfo(pnum);
		
		return palist;

	}
	
	public PartyDTO partyinfore(int pnum) {
		 
		PartyDTO palist = (PartyDTO)paDAO.partyinfore(pnum);
		
		return palist;

	}
	
	
	
	

}
