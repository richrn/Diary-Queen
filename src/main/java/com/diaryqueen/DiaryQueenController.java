package com.diaryqueen;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.diaryqueen.dto.DiaryEntry;

/**
 * @author 97kem
 *
 */
@Controller
public class DiaryQueenController {
	
	ArrayList<DiaryEntry> entries = new ArrayList<>();
	
	@WebServlet("/add") //this /add might be wrong idk
	public class ProcessText extends HttpServlet {
	 
		@Override
	    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
			
			 ProcessText processText = new ProcessText();

		        if (request.getParameter("addButton") != null) {
		        	String addTextBox = request.getParameter("addTextBox") ;
			        String header = request.getParameter("header");
			        
			        System.out.println("addTextBox" + addTextBox);
			        System.out.println("header: " + header);
		            
		            	// something? push to array here
		            }
	         
	        // read input fields
	    	
	         
	       
	        
	        // Return Response (not in yet)
	        
	    }
	    }
	
	@GetMapping("/")
	public String index(Model model) {

		entries.add(new DiaryEntry(1, java.time.LocalDate.now(),  "Wednesday Entry", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		
		entries.add(new DiaryEntry(2, java.time.LocalDate.now(), "What a phenomenal day!", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		
		

		model.addAttribute("entries", entries);

		return "index";
	}

	       
	
	@GetMapping("/add")
	public String add(Model model) {
		
		return "add";
	}
	
	@GetMapping( "/edit")
	public String edit(Model model) {
		return "edit";
	}
	
	
}
