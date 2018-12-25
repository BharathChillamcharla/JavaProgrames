package com.qa.java;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num=30;
		int n1=0; int n2=1; int n3;
		while(n1<=num)
		{
			System.out.print(n1 +" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
