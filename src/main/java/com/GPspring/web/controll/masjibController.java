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
	
	@RequestMapping("/masjipviewtop")
	public String masjipviewtop(Model model) { // 조회수 순 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipviewtop();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipviewtop.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipkor")
	public String masjipkor(Model model) { // 한식 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkor();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipkor.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipjpn")
	public String masjipjpn(Model model) { // 일식 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjpn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipjpn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipchn")
	public String masjipchn(Model model) { // 중식 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipchn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipchn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	
	@RequestMapping("/masjipworld")
	public String masjipworld(Model model) { // 세계음식 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipworld();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipworld.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipwhat")
	public String masjipwhat(Model model) { // 뷔페 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipwhat();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipwhat.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipseoul")
	public String masjipseoul(Model model) { // 서울 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipseoul();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipseoul.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipdj")
	public String masjipdj(Model model) { // 대전 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipdj();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipdj.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipgj")
	public String masjipgj(Model model) { // 광주 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipgj();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipgj.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipbs")
	public String masjipbs(Model model) { // 부산 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipbs();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipbs.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipcb")
	public String masjipcb(Model model) { // 충북 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipcb();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipcb.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipcn")
	public String masjipcn(Model model) { // 충남 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipcn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipcn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipdg")
	public String masjipdg(Model model) { // 대구 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipdg();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipdg.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipic")
	public String masjipic(Model model) { // 인천 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipic();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipic.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipjb")
	public String masjipjb(Model model) { // 전북 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjb();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipjb.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipjj")
	public String masjipjj(Model model) { // 제주 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjj();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipjj.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipjn")
	public String masjipjn(Model model) { // 전남 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipjn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipjn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipkb")
	public String masjipkb(Model model) { // 경북 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkb();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipkb.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipkk")
	public String masjipkk(Model model) { // 경기 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkk();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipkk.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipkn")
	public String masjipkn(Model model) { // 경남 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkn();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipkn.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipkw")
	public String masjipkw(Model model) { // 강원 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipkw();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipkw.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipsj")
	public String masjipsj(Model model) { // 세종 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipsj();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipsj.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping("/masjipus")
	public String masjipus(Model model) { // 울산 맛집 베스트 10 
		
		ArrayList<ResdatDTO> rslist = mjSer.masjipus();
		
		model.addAttribute("rslist",rslist);		
				
		return "/WEB-INF/views/masjipus.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	
	
	
}
