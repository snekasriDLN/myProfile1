package com.basicpackages;

public class PackageExample {
	 int packNo = 1;
	 int value =100;
	public PackageExample() {
		
	}
	@Override
	public String toString() {
		return packNo+","+value;
	}
	public PackageExample(int packNo,int value) {
		this.packNo=10;
		this.value=1000;
		return;
	}
	public static void main(String[] args) {
		PackageExample pe = new PackageExample();
		System.out.println(pe.hashCode());
		System.out.println(pe.packNo);
		System.out.println(pe.value);
		System.out.println(pe.toString());
		System.out.println(pe.getClass());
		System.out.println(PackageExample.class);
	}
}