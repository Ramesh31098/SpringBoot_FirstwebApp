package com.rajIt.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	 @RequestMapping("/welcome")
 public ModelAndView displaywelcomeMsg() {
	  ModelAndView mvn = new ModelAndView();
	  mvn.addObject("msg" ,"welcome To Raj it");
	  mvn.setViewName("index");
	  return mvn;
 }
	 @RequestMapping("/greet")
	  public ModelAndView greetMsg() {
		  ModelAndView modelAndView = new ModelAndView();
		  modelAndView.addObject("msg", "GOOD morning...");
		  modelAndView.setViewName("greet");
		  
		  return modelAndView;
		
	}
}
