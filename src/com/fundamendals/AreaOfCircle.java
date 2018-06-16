package com.fundamendals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
//rt java.io.InputStreamReader;
import java.io.Reader;
//import java.util.Scanner;

public class AreaOfCircle {
//ublic static void main(String[] args) {
//double radius =12;
	//ystem.out.println("The Radius of Circle");
	//ouble area = Math.PI* radius*radius;
//System.out.println(area);
//}
	public static void main(String[] args) {

		double radius =12;
		System.out.println("Please enter radius of a circle");
	
	try
	{
		BufferedReader input = new BufferedReader(InputStreamReader(System.in));
		radius = Integer.parseInt(input.readLine());
	}
	catch(NumberFormatException ne)
	{
		System.out.println("Invalid radius value" + ne);
		System.exit(0);
	}
	catch(IOException ioe)
	{
		System.out.println("IO Error :" + ioe);
		System.exit(0);
	}
	double area = Math.PI * radius * radius;
	
	System.out.println("Area of a circle is " + area);
}

	private static Reader InputStreamReader(InputStream in) {

		return null;
	}

}