package week2.Assignments1;



public class FindIntersection {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	public static void main(String[] args) {
		
	int[] ar1 = {3,2,11,4,6,7,9};
	
	int[] ar2 = {1,2,8,4,9,7};
	
	for(int i=0;i<ar1.length;i++) {
		   for(int j =0;j<ar2.length;j++) {
			   if (ar1[i]==ar2[j]) {
				 System.out.println(ar1[i]);
				 
	}
	 }
		
	}
	
	}
	
	}
		

	
		 

	