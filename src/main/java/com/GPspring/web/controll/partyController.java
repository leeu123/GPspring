package com.GPspring.web.controll;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.GPspring.web.service.PartyService;
import com.GPspring.web.vo.PartyDTO;


@Controller
public class partyController {
	
	@Autowired
	private PartyService paSer;
	
	@RequestMapping(value="/partyregist" , method = { RequestMethod.GET, RequestMethod.POST })
	public String partyregist(HttpSession session,Model model,@ModelAttribute PartyDTO padto) { // 진행중인 파티 카테고리 별 파티
		
		String id= (String)session.getAttribute("id");
		String nick = (String)session.getAttribute("nick");
		padto.setId(id);
		padto.setNick(nick);
		boolean ok = paSer.partyregist(padto);
		
		if(ok) {
		
		return "/WEB-INF/views/party.jsp"; // 자기가 만든 jsp 파일 경로
		}
		model.addAttribute("message", "입력에 오류가 있습니다.");
		return "/WEB-INF/views/partyregi.jsp";
	}	

	@RequestMapping(value="/partycate" , method = { RequestMethod.GET, RequestMethod.POST })
	public String partycate(Model model,@RequestParam String cate) { // 진행중인 파티 카테고리 별 파티
		
		ArrayList<PartyDTO> palist = paSer.partycate(cate);
		System.out.println(palist.get(0).getPnum());
		
		model.addAttribute("palist",palist);		
				
		return "/WEB-INF/views/partycate.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping(value="/partycatere" , method = { RequestMethod.GET, RequestMethod.POST })
	public String partycatere(Model model,@RequestParam String cate) { // 완료된 파티 카테고리 별 파티
		
		ArrayList<PartyDTO> palist = paSer.partycatere(cate);
		System.out.println(palist.get(0).getPnum());
		model.addAttribute("palist",palist);		
				
		return "/WEB-INF/views/partycatere.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping(value="/partyinfo" , method = { RequestMethod.GET, RequestMethod.POST })
	public String partyinfo(Model model,@RequestParam int pnum) { // 진행중인 파티 개별 파티 정보 
		
		
		PartyDTO painfo = paSer.partyinfo(pnum);
		
		model.addAttribute("painfo",painfo);		
				
		return "/WEB-INF/views/partyinfo.jsp"; // 자기가 만든 jsp 파일 경로
	}	
	
	@RequestMapping(value="/partyinfore" , method = { RequestMethod.GET, RequestMethod.POST })
	public String partyinfore(Model model,@RequestParam int pnum) { // 완료된 파티 개별 파티 정보 
		
		PartyDTO painfore = paSer.partyinfore(pnum);
		
		model.addAttribute("painfore",painfore);		
				
		return "/WEB-INF/views/partyinfore.jsp"; // 자기가 만든 jsp 파일 경로
	}	

}
