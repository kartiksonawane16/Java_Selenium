package loopconcepts;

//import java.util.*;

public class Triangle {
	
	public static void main(String[] args) { 
	      // loop to iterate for the given number of rows 
        for (int i = 0; i <= 5; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = 5; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = 0; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        }
    } 

}
