package com.example.demo;

public class GreetingNew {
    private final long id;
	private final String content;

	public GreetingNew(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}