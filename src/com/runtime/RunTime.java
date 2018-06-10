package com.runtime;

public class RunTime {
public static void main(String[] args) {
	int arr1[] = {1,2,3,4,5};
	int arr2[] = new int[arr1.length];

	System.arraycopy(arr1, 0, arr2, 0, 5);
	System.arraycopy(arr1, 2, arr2, 0, 3);
    for(int i=0;i<arr2.length;i++) {
    	System.out.println(arr2[i]);
    }
    Runtime runtime = Runtime.getRuntime();
	int pro=runtime.availableProcessors();
	System.out.println(pro);
	try
	{
		Process process = runtime.exec("notepad");
		process.waitFor();
		runtime.exec("notepad");	
		}
	
	catch (Exception e) {
		e.printStackTrace();
	}	
	runtime.addShutdownHook(new Thread());{
		System.out.println("HI SRI PAPA");
	}
	System.out.println(System.getenv());	
}
}