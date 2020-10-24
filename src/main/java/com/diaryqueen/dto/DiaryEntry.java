package com.diaryqueen.dto;

public class DiaryEntry {

	private int entryId;
	private long timestamp;				// This could be improved with a Date object
	private String header;
	private String content;
	
	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public DiaryEntry(int entryId, long timestamp, String header, String content) {
		this.entryId = entryId;
		this.timestamp = timestamp;
		this.header = header;
		this.content = content;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
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
		return "The diary entry with ID --> " + entryId + " Date --> " + timestamp + " is:\n\n" + header + "\n\n" + content;
	}
	
	
}
