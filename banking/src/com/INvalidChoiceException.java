package com;

public class INvalidChoiceException extends Exception
{

	private String message;
	
	
	INvalidChoiceException(String message)
	{
		this.message=message;
		
	}
	
	public String getMessage()
	{
		return message;
	}
}
