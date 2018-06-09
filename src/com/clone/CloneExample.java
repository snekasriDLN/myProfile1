package com.clone;

public class CloneExample implements Cloneable {
	Lunch lunch;
	Dinner dinner;
	public CloneExample() {
		lunch= new Lunch();
		dinner=new Dinner();
	}
	public static void main(String[] args) {
		try {
		CloneExample ce1=new CloneExample();
		CloneExample ce2=(CloneExample)ce1.clone();
		System.out.println(ce1.clone());
		System.out.println(ce2.hashCode()+"=="+ce1.hashCode());
		System.out.println(ce1.dinner);
		System.out.println(ce2.lunch);
		System.out.println(ce1.hashCode()+"=="+ce2.hashCode());
		System.out.println(ce2.clone());
		}
		catch (Exception e) {
			e.toString();
		}
	}
	}