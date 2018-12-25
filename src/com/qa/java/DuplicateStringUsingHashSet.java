package com.qa.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringUsingHashSet {

	public static void main(String[] args) {
		
		String arr[]={"selenium","java","selenium",".net"};
		Set name=new HashSet<String>();
		for(String s:arr)
		{
			if(name.add(s)==false)
			{
				System.out.println("duplicate string is "+ s);
				
			}
		}

	}

}
