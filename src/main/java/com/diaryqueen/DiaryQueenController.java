package com.diaryqueen;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		entries.add(new DiaryEntry(java.time.LocalDate.now().toString(),  "Wednesday Entry", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		
		entries.add(new DiaryEntry(java.time.LocalDate.now().toString(), "What a phenomenal day!", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what I was doing earlier."));
		
		entries.add(new DiaryEntry(java.time.LocalDate.now().toString(), "What a phenomenal day!", 
				"Today I was doing something and then I started doing something else... "
				+ "While I was doing that something else, I just realized that I was indeed doing nothing. "
				+ "This realization brought me to my feet just to yawn and stretch before going back to what "
				+ "I was doing earlier. Unchecked exceptions do not need to be explicitly handled; they occur"
				+ " at the time of execution, also known as run time. These exceptions can usually be avoided"
				+ " by good coding practices. They are typically caused by programming bugs, such as logic errors"
				+ " or improper use of APIs. These exceptions are ignored at the time of compilation. For example:"));
		
	}
	
	@PostMapping("/add")
	public String addDiaryEntry(DiaryEntryRequest request) {
		entries.add(new DiaryEntry(request.getDate(),  request.getHeader(), request.getContent()));
		
		return "redirect:/";
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
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id")int id) {
		for (int i = 0; i < entries.size() ; i++) {
			if (entries.get(i).getEntryId() == id) {
				entries.remove(i);
			}
		}

		return "redirect:/";
	}
	
	@GetMapping("/edit")
	public String add(Model model, @RequestParam("id")int id) {
		DiaryEntry entry = null;
		
		for (int i = 0; i < entries.size() ; i++) {
			if (entries.get(i).getEntryId() == id) {
				entry = entries.get(i);
			}
		}
		
		model.addAttribute("entry", entry);
		
		return "edit";
	}
	
	@PostMapping("/edit")
	public String editDiaryEntry(DiaryEntryRequest request) {
		DiaryEntry entry = null;
		
		for (int i = 0; i < entries.size() ; i++) {
			if (entries.get(i).getEntryId() == request.getEntryId()) {
				entry = entries.get(i);
			}
		}
		
		entry.setContent(request.getContent());
		entry.setDate(request.getDate());
		entry.setHeader(request.getHeader());
		
		return "redirect:/";
	}
}
