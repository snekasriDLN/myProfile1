package com.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExamples {
	public static void main(String[] args) {
		//ArrayList Example
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		 
		
	   //LinkedList Example	
	   LinkedList<String> list = new LinkedList<String>();
	   list.add("one");
	   list.add("two");
	   list.add("three");
	   System.out.println(list);
	   Set<String> setone= new HashSet<String>(list);
	   System.out.println(setone);
	
	   //HashSet Example
	   Set<Integer> set1 = new HashSet<Integer>();
	   set1.add(1);
	   set1.add(2);
	   set1.add(3);
	   System.out.println(set1);
	
	   //HashMap
	   Map<Integer, String> hashMap = new HashMap<>();
	   hashMap.size();
	   hashMap.put(1, "one");
	   hashMap.put(2, "two");
	   System.out.println(hashMap);
	
       //TreeMap
	   Map<String, String> treeMap = new TreeMap<>();
	   treeMap.put("one","1");
	   treeMap.put("two","2");
	   treeMap.put("three","3");
	   System.out.println(treeMap);
	
	   //TreeSet
	   Set<Integer> setTree = new TreeSet<>();
	   setTree.add(1);
	   setTree.add(2);
	   setTree.add(3);
	   System.out.println(setTree);
			
	}}