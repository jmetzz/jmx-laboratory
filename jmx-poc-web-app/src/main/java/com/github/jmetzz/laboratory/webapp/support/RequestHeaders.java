package com.github.jmetzz.laboratory.webapp.support;

public enum RequestHeaders {

	REQUEST_ID("X-requestId");

	private final String name;

	RequestHeaders(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}