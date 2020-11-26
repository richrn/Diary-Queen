package com.diaryqueen.dto;

public class DiaryEntry {

	private int entryId;
	private String date;				// This could be improved with a Date object
	private String header;
	private String content;
	
	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public DiaryEntry(int entryId, String date, String header, String content) {
		this.entryId = entryId;
		this.date = date;
		this.header = header;
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The diary entry with ID --> " + entryId + " Date --> " + date  + " is:\n\n" + header + "\n\n" + content;
	}
	
	
}
