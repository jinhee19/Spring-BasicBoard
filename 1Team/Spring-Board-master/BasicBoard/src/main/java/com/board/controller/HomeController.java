package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.Criteria;
import com.board.domain.PageDTO;
import com.board.service.PlaceService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
@RequestMapping("/*")
@AllArgsConstructor
public class HomeController {
	private PlaceService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping({"/"})
	public String home(Locale locale, Model model) {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";*/
		return "index";
	}
	
	@GetMapping({"/index"})
	public String index() {
		return "index";
		
	}
	
	@GetMapping({"/get"})
	public void get(@RequestParam("bno") Long bno, Model model) {
		System.out.println("please........   "+bno);
		model.addAttribute("place", service.get(bno));
		model.addAttribute("blog", service.getBlog(bno));
	}


	@GetMapping({"/list_north"})
	public void list_north(Model model) {
		
		model.addAttribute("list", service.getList_N());
	}
	
	@GetMapping({"/list_south"})
	public void list_south(Model model) {
		
		model.addAttribute("list", service.getList_S());
	}
}
