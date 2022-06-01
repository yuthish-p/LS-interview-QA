package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class dataController {
	
	@RequestMapping("/form")
	public static String form()
	{
		return "studentwebsit";
	}
	@Autowired
	studentRespotry std;
	@PostMapping("/data")
	ModelAndView data(@RequestParam String name , @RequestParam String gender,@RequestParam String dob,@RequestParam String about,@RequestParam("file") MultipartFile pdffile)
	{
		data s1 = new data();
		s1.setName(name);
		s1.setGender(gender);
		s1.setDob(dob);
		s1.setAbout(about);
		
		String message = "";
		
			try {
				FileStorageService.store(pdffile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return display();
		
		
	}
	
			
	

	@GetMapping("/display")
	ModelAndView display()
	{
		ModelAndView mv = new ModelAndView("studentlist");
		mv.addObject("data",std.findAll());
		return mv;
	}

}
