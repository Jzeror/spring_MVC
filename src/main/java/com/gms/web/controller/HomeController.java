package com.gms.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("context")
public class HomeController {
    static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/") //겟방식을 생략하면 이렇게 사용할 수 있
    public String home(HttpSession session, HttpServletRequest request) {
        String context = request.getContextPath();
        logger.info("Welcome home! The client locale is {}.", context);
        session.setAttribute("context", context);
        return "public:common/content.tiles"; 
    } 
    
    @RequestMapping("/move/{prefix}/{dir}/{page}")
    public String move(
    		@PathVariable String prefix,
    		@PathVariable String dir,
    		@PathVariable String page) {
        logger.info("HomeController ::: move() {}.", "ENTER");
    	return  prefix+":"+dir+"/"+page+".tiles";
    }
    
    @RequestMapping("/move/{memId}/{teamId}/{name}/{roll}/{age}/{ssn}/{gender}")
    public String move(
    		@PathVariable String memId,
    		@PathVariable String teamId,
    		@PathVariable String name,
    		@PathVariable String roll,
    		@PathVariable String age,
    		@PathVariable String ssn,
    		@PathVariable String gender,Model model) {
    	model.addAttribute("memId", memId);
    	model.addAttribute("teamId", teamId);
    	model.addAttribute("name", name);
    	model.addAttribute("roll", roll);
    	model.addAttribute("age", age);
    	model.addAttribute("ssn", ssn);
    	model.addAttribute("gender", gender);
    	
    	//재경이 형이 이걸언제 발견할지는 모르겠지만 발견하시면 진태 옆구리를 한대 찔러주시면 감사드리겠습니다.가나다라마바사abcd
    	return  "modify:member/modify.tiles";
    }
}