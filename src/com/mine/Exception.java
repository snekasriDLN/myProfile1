package com.mine;

public class Exception {
	public static void main(String[] args) {
try {
		int num[] = {1, 2, 3, 4};
    System.out.println(num[5]);
}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Exception abc:"+e);
}}}