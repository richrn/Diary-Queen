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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diaryqueen.dto.DiaryEntry;

/**
 * @author 97kem
 *
 */
@Controller
public class DiaryQueenController {
	
	
	@WebServlet("/add") //this /add might be wrong idk
	public class ProcessText extends HttpServlet {
	 
		@Override
	    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
			
			 ProcessText processText = new ProcessText();

		        if (request.getParameter("button1") != null) {
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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		ArrayList<DiaryEntry> entries = new ArrayList<>();
		
		
		
		
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

	       
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		return "add";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(Model model) {
		return "edit";
	}
}
