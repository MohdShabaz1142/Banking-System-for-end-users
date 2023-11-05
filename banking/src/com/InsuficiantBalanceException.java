package com;

public class InsuficiantBalanceException extends RuntimeException 
{
private String message;

InsuficiantBalanceException(String message)
{
	this.message=message;
}
public String getMessage()
{
	return message;
}

}
