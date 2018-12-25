package com.qa.java;

public class Reverinteger {

	public static void main(String[] args)
	{
		
		int num=319635; int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		int number=12345; String rev1="";
		String str=String.valueOf(number);
		for(int i=str.length()-1;i>=0;i--)
		{
			 rev1=rev1+str.charAt(i);
			 
		}
		System.out.println(rev1);

	}

}
