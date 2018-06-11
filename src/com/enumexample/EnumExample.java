package com.enumexample;

public class EnumExample {
	public static void main(String[] args) {
		Verify verify=Verify.Name;
		Verify verify2=Verify.Gender;
		System.out.println(Verify.Name);
		System.out.println(Verify.Gender);
		System.out.println(verify.getClass().getName());
		System.out.println(verify2.getClass().getName());
		System.out.println(verify.hashCode());
		System.out.println(verify2.equals(verify));
		System.out.println(verify.compareTo(verify2));
		System.out.println(verify2.ordinal());
		System.out.println(verify.getClass().getSuperclass());
		System.out.println(verify.toString());
		System.out.println(verify2.toString());
	}

}
