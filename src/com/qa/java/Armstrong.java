package com.qa.java;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int c=0,a;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
		{
			System.out.println(c +" is armstrong number");
		}else
		{
			System.out.println(c + " is not armstrong number");
		}
		

	}

}
