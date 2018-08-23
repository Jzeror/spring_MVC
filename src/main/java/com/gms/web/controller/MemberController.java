package com.gms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @RequestMapping("/add")
    public void add() {}
    @RequestMapping("/list")
    public void list() {}
    @RequestMapping("search")
    public void search() {}
    @RequestMapping("/retrieve")
    public void retrieve() {}
    @RequestMapping("/count")
    public void count() {}
    @RequestMapping("/modify")
    public void modify() {}
    @RequestMapping("/remove")
    public void remove() {}
    @RequestMapping("/login")
    public String login() {
    	return "login_success";
    }
    @RequestMapping("/logout")
    public String logout() {
    	return "redirect:/";
    }
    @RequestMapping("/fileupload")
    public void fileupload() {}
    
}