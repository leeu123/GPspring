package com.GPspring.web.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class foodController {

	@RequestMapping("/index")
	public String index() {
		
		
		
		
		return "/WEB-INF/views/gpindex.jsp"; // 자기가 만든 jsp 파일 경로
	}
	
	@RequestMapping("/masjib")
	public String masjib() {
		
		
		
		
		return "/WEB-INF/views/masjib.jsp"; // 자기가 만든 jsp 파일 경로
	}

}
