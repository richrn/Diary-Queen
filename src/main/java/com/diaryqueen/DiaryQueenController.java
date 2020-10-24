package com.diaryqueen;

import java.time.Instant;
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
	
	/***
	 * Adds data to the index model and returns the index page.
	 * @param model the UI model.
	 * @return the index page.
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		DiaryEntry diaryEntry1 = new DiaryEntry(1, Instant.now().toEpochMilli(), "Wednesday Entry", "Today I was doing something and then I started doing something else... While I was doing that something else, I just realized that I was indeed doing nothing. This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier.");
		DiaryEntry diaryEntry2 = new DiaryEntry(2, Instant.now().toEpochMilli(), "What a phenomenal day!", "Today I was doing something and then I started doing something else... While I was doing that something else, I just realized that I was indeed doing nothing. This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier.");
		
		ArrayList<DiaryEntry> diaryEntries = new ArrayList<>();
		diaryEntries.add(diaryEntry1);
		diaryEntries.add(diaryEntry2);
		
		model.addAttribute("diaryEntries", diaryEntries);
		
		return "index";
	}
}
