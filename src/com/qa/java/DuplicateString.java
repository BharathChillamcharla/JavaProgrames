package com.qa.java;

public class DuplicateString {

	public static void main(String[] args) {
		
		String arr[]={"java","selenium",".net","java","selenium"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println("duplicate string is "+arr[j]);
				}
			}
		}

	}

}
