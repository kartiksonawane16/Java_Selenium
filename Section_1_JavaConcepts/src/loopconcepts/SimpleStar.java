package loopconcepts;

public class SimpleStar {
	public static void main(String[] args) { 
		
		// Printing Simple Triangle star pattern
	    // loop to iterate for the given number of rows 
        for (int i = 1; i <= 5; i++) { 
        	for(int j=1; j<=i; j++) {
        		System.out.print("* ");
        	}
        	
        	System.out.println("");
        }
}
}
