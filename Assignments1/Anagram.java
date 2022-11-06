package week2.Assignments1;

import java.util.Arrays;

public class Anagram {
	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss"; 
		
		int length1 = text1.length();
		
		System.out.println("test1 length - " + length1); 
		
		int length2 = text2.length();
		
		System.out.println("test2 length - " + length2);
		
		if (length1 == length2)
		{
			System.out.println("Length is matching");
		}
			
		char[] arrayS1 = text1.toLowerCase().toCharArray();  
		
		char[] arrayS2 = text2.toLowerCase().toCharArray();  
		
		
		Arrays.sort(arrayS1);    
		
		Arrays.sort(arrayS2);    
		
		
		boolean status = Arrays.equals(arrayS1, arrayS2);    
	 
	if (status)   
	{    
	//prints if status returns true      
	System.out.println(text1 + " and " + text2 + " are anagrams");    
	}   
	else   
	{    
	//prints if status returns false      
	System.out.println(text1 + " and " + text2 + " are not anagrams");    
	}    
	
	
	}
		
		
		
	}