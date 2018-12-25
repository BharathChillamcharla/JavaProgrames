package com.qa.java;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=23; boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			int temp=num%i;
			if(temp==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("prime Number");
		}else
		{
			System.out.println("Not Prime Number");
		}

	}

}
