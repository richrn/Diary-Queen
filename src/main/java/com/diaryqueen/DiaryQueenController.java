package com.diaryqueen;

import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.diaryqueen.dto.DiaryEntry;
import com.diaryqueen.dto.DiaryEntryRequest;

/**
 * @author 97kem
 *
 */
@Controller
public class DiaryQueenController {
	
	private static ArrayList<DiaryEntry> entries = new ArrayList<>();
	
	public DiaryQueenController() {
		entries.add(new DiaryEntry(1, java.time.LocalDate.now(),  "Wednesday Entry", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		
		entries.add(new DiaryEntry(2, java.time.LocalDate.now(), "What a phenomenal day!", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
	}
	
	@PostMapping("/add")
	public void addDiaryEntry(DiaryEntryRequest request) {
		entries.add(new DiaryEntry(3, java.time.LocalDate.now(),  request.getHeader(), request.getContent()));
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("entries", entries);
		return "index";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		return "add";
	}
	
	@GetMapping("/edit")
	public String edit(Model model) {
		return "edit";
	}
}
