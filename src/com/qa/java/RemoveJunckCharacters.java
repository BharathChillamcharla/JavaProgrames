package com.qa.java;

public class RemoveJunckCharacters {

	public static void main(String[] args) {
		
		String str="selenium&&&#*&@#*!@!(@!@(@java";
		String replacevalue=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replacevalue);

	}

}
