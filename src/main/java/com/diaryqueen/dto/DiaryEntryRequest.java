package com.diaryqueen.dto;


public class DiaryEntryRequest {
	
	private String header;
	private String content;
	private String date;
	
	public DiaryEntryRequest(String header, String content, String date) {
		this.header = header;
		this.content = content;
		this.date = date;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
