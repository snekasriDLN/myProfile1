package com.owner;

public class Test {
	public static void main(String[] args) {
	Travel t1=new Dog();
	Owner owner1=(Dog)t1;
	System.out.println(owner1.getOwnerName());
	System.out.println(owner1.getSpeed());
	Travel t2 = new Cow();
	Owner owner2= (Cow)t2;
	System.out.println(owner2.getOwnerName());
	System.out.println(owner2.getSpeed());
	Travel t3= new Goat();
	Owner owner3 =(Goat)t3;
	System.out.println(owner3.getOwnerName());
	System.out.println(owner3.getSpeed());
	t1.getSpeed();
	t2.getSpeed();
	t3.getSpeed();
	}
	}