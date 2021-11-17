package com.kumaran.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kumaran.bean.Login;

@Controller
public class SimpleController {
	
	@RequestMapping("/")
	public String Welcome() {
		return "Home";
		
	}
	@GetMapping("/AdminLogin")
	public String AdminLogin() {
		return "AdminLogin";
	}
	@PostMapping("/AdminDashboard")
	public ModelAndView AdminDashboard(@ModelAttribute("LoginData")Login login) {
		ModelAndView mv= new ModelAndView("AdminDashboard");
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		if(login.getUsername().equals("Admin") && login.getPassword().equals("123"))
			return mv;
		else
			//mv.addObject("ErrorMessage","Please Enter Valid USERNAME or PASSWORD");
			return new ModelAndView("AdminLogin","err","!!Please Enter Valid USERNAME or PASSWORD");
		
	}
	@GetMapping("/logout")
	public String doLogout(HttpSession session,Model model) {
		
		session.invalidate();
		
		Login login =new Login();
		
		model.addAttribute("loginData",login);
		
		return "AdminLogin";
		
	}
	@GetMapping("/AddCenter")
	public String AddCenter() {
		return "AddCenter";
	}
	
	@PostMapping("/RegResult")
	public ModelAndView RegResult() {
		ModelAndView mv= new ModelAndView("RegResult");
		return mv;
	}
	@GetMapping("/UserLogin")
	public String UserLogin() {
		return "UserLogin";
	}
	@PostMapping("/UserDashboard")
	public String UserDashboard() {
		return "UserDashboard";
	}
	@GetMapping("/UserSignup")
	public String UserSignup() {
		return "UserSignup";
	}
}
