package com.safesmart.safesmart.common;

public enum CommonExceptionMessage {

	REQUIRED_ATTRIBUTE(1, " %1$s is mandatory"), 
	VALIDATE_PIN(2, "Please enter only 4 digit PIN"),
	INCORRECT_PIN(3,"User PIN is incorrect."),
	ALREADY_EXISTS(4,"%1$S is already exists."),
	VALIDATE_FROMDATE(5,"From Date mandatory"),
	VALIDATE_TODATE(5,"To Date mandatory"),
	PERMISSION_NOTEXISTS(5,"You dont have permission to access this screen."),
	NOTFOUND(6,"%1$ not found."),
	VALIDATE_SIX_PIN(7, "Selected password criteria and password lenght are not matching"),
	VALIDATE_TEXT(8,"role name must be text only");
	private int code;

	private String message;

	CommonExceptionMessage(int i, String message) {
		this.code = i;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessgae() {
		return message;
	}


}
