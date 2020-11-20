package com.diaryqueen.dto;

public class DiaryEntryRequest {
	
	private String header;
	private String content;
	
	public DiaryEntryRequest(String header, String content) {
		this.header = header;
		this.content = content;
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

}
