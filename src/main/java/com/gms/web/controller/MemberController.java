package com.gms.web.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;


@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("member") MemberDTO member) {
    	memberService.add(member);
    	return "redirect:/";
    }
    @RequestMapping("/list")
    public void list() {}
    @RequestMapping("search")
    public void search() {}
    @RequestMapping("/retrieve/{memId}")
    public String retrieve(@PathVariable String memId, Model model) {
    	member.setMemId(memId);
    	model.addAttribute("user", memberService.retrieve(member));
    	return "retrieve_go";
    }
    
    @RequestMapping("/count")
    public void count() {}
    @RequestMapping("/modify")
    public void modify() {}
    @RequestMapping(value="/remove" , method = RequestMethod.POST)
    public String remove(@ModelAttribute("member") MemberDTO member) {
    	memberService.remove(member);
    	return "redirect:/";
    }
    @RequestMapping(value="/login" ,method = RequestMethod.POST)
    public String login(@ModelAttribute("member") MemberDTO member, Model model) {
    	model.addAttribute("user", memberService.login(member));
    	return "login_success";
    }
    @RequestMapping("/logout")
    public String logout() {
    	return "redirect:/";
    }
    @RequestMapping("/fileupload")
    public void fileupload() {}
}