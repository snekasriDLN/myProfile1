package com.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
	String a[]= {"sri","latha","deva"};
	System.out.println(a[1]);
	System.out.println(a[3]);
	return;
		}
		catch (Exception e) {
			System.out.println("deva");
		}
		finally
		{
			System.out.println("sri");
		}
	
	
	}}