package it.localproject.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.localproject.models.Anagrafica;
@Controller
public class TestController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String viewHome(){
		return "home";
	}
	
	@RequestMapping(value="/downloadExcel", method=RequestMethod.GET)
	public ModelAndView downloadExcel(){
		
		List<Anagrafica> elementi = new ArrayList<Anagrafica>();
		elementi.add(new Anagrafica("Mauro", "Rossi", 25));
		return new ModelAndView("excelView", "elementi", elementi);
	}
	
}
