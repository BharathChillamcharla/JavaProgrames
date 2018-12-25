package com.qa.java;

public class CountNumberofDuplicateCharacters {

	public static void main(String[] args) {
		char Char;
		String str="selenium"; int count;
		//char c[]=str.toCharArray();
		for(Char ='a';Char <='z';Char++)
		{
			count =0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==Char)
				{
					count++;
					
				}
				
				
		}
			
			System.out.println("Number of occurences of " + Char + " is " + count);		

	}
		
	}
}
