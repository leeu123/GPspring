package com.GPspring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GPspring.web.repository.MembershipDAO;
import com.GPspring.web.vo.MembershipDTO;



@Service
public class MembershipService {
	
	
	@Autowired
	private MembershipDAO mbDAO;
	
	
	public String login(MembershipDTO s) {
		 
		String t = mbDAO.loginAction(s);
		
		return t;

	}
	
	
	
	
	

}
