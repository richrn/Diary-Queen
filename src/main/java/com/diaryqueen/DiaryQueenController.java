package com.diaryqueen;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diaryqueen.dto.DiaryEntry;

/**
 * @author 97kem
 *
 */
@Controller
public class DiaryQueenController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		ArrayList<DiaryEntry> entries = new ArrayList<>();
		
		entries.add(new DiaryEntry(1, java.time.LocalDate.now(), "Wednesday Entry", 
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
