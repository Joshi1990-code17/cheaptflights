package com.compareflight.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flightcomparedto.flightcomparedto;

@Controller
public class flightController {
	
	@RequestMapping( value ="bookflight", method = RequestMethod.GET)
	public ModelAndView showflightpage() {
		
	flightcomparedto f = new flightcomparedto();
	
	ModelAndView mv = new ModelAndView("bookflight");
	mv.addObject("flightpriceobj", f);
	return mv;
	
	}
	
	@RequestMapping( value = "process-flight", method = RequestMethod.POST)
	public ModelAndView saveusersinput(flightcomparedto usersinput) {
		
		ModelAndView mv = new ModelAndView("process-flight");
		mv.addObject("price", usersinput);
		return mv;
		
	}
	
	
		
	}
	


