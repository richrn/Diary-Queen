package com.diaryqueen;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		ArrayList<DiaryEntry> entries = new ArrayList<>();
		
		entries.add(new DiaryEntry(1, "10/21/2020", "Wednesday Entry", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		
		entries.add(new DiaryEntry(2, "10/22/2020", "What a phenomenal day!", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		

		model.addAttribute("entries", entries);

		return "index";
	}
}
