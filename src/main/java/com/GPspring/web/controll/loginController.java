package com.GPspring.web.controll;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.GPspring.web.service.MembershipService;
import com.GPspring.web.vo.MembershipDTO;

@Controller
public class loginController {
	
	@Autowired
	private MembershipService mbSer;

	

	@RequestMapping(value="/loginAction" , method = RequestMethod.POST)
	public String loginAction(HttpSession session,Model model,@ModelAttribute MembershipDTO mdto) { // 로그인 페이지
		
		String nick =mbSer.login(mdto);
		
		if(nick!=null) {
		session.setAttribute("id", mdto.getId());
		session.setAttribute("nick", nick);
		return "redirect:/index";
		}
		else {
		model.addAttribute("message", "비밀번호 불일치");
		return "/WEB-INF/views/loginpage.jsp"; 
		}
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) { // 인덱스 페이지
		
		
		session.invalidate();
		
		
		
		return "redirect:/index"; // 자기가 만든 jsp 파일 경로
	}
	
	
	

}
