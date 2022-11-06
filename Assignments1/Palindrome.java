package week2.Assignments1;


public class Palindrome {
	//Build a logic to find the given string is palindrome or not
     
	/*
	 * Pseudo Code
	 * a) Declare A String value as"madam"
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */	
	
	  public static void main(String[] args)
	    {
	        // Input string
	        String str = "madam";
	 
	        // Convert the string to lowercase
	        str = str.toLowerCase();
	        boolean A = isPalindrome(str);
	        System.out.println(A);
	    }
			
	public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
  
				
		
	}
	