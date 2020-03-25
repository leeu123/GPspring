package com.GPspring.web.controll;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.GPspring.web.service.MasjipService;
import com.GPspring.web.vo.ResdatDTO;


@Controller
public class masjibController {
	
	
	@Autowired
	private MasjipService mjSer;

	@RequestMapping("/masjiprec")
	public String masjiprec(Model model) { // 평점 순 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjiprec();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjiprec.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipkor")
	public String masjipkor(Model model) { // 평점 순 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkor();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipkor.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipjpn")
	public String masjipjpn(Model model) { // 평점 순 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjpn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipjpn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipchn")
	public String masjipchn(Model model) { // 평점 순 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipchn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipchn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipwest")
	public String masjipwest(Model model) { // 평점 순 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipwest();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipwest.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	
	
}
