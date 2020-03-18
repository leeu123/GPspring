package com.GPspring.web.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class foodController {

	@RequestMapping("/index")
	public String index() { // 인덱스 페이지
		
		return "/WEB-INF/views/gpindex.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/masjib")
	public String masjib() { // 맛집리스트 페이지
		
		return "/WEB-INF/views/masjib.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/party")
	public String party() { // 진행중인 파티 리스트 페이지
		 
		return "/WEB-INF/views/party.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/party1")
	public String party1() { // 완료된 파티 리스트 페이지
		
		return "/WEB-INF/views/party1.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/partyregi")
	public String partyregi() { // 파티 모집 페이지
		
		return "/WEB-INF/views/partyregi.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/loginpage")
	public String loginpage() {
		
		return "/WEB-INF/views/loginpage.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/infosearch")
	public String infosearch() {
		
		return "/WEB-INF/views/infosearch.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/membership")
	public String membership() {
		
		return "/WEB-INF/views/membership.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/license")
	public String license() {
		
		return "/WEB-INF/views/license.jsp"; // 자기가 만든 jsp 파일 경로
	}

}
