package com.mine;

public class SnekaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME + "Sneka");
		System.out.println(ProfileConstants.LAST_NAME + "Sri");
		System.out.println("Age:20");
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are Hearing songs and cooking");
	}

}
