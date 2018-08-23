package com.gms.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
}