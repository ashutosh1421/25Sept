package com.ashu.exceptions;

@SuppressWarnings("serial")
public class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message) {
		super(message);
	}

}
