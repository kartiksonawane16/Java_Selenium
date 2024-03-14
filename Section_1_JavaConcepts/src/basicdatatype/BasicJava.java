package basicdatatype;

public class BasicJava {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		// Data types in java
		//character
        char a = 'G';
 
        // Integer
        int i = 89;
 
        //use byte
        byte b = 4;
 
        //double
        double d = 4.355453532;
 
        // for float use 'f' as suffix as standard
        float f = 4.7333434f;
 
        // this data type
        long l = 12121;
 
     // Declare String without using new operator 
        String s = "Kartik Sonawane"; 
        // Declare String using new operator 
        String s1 = new String("Kartik Sonawane"); 
        
        
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println("Name: " + s);
        System.out.println("Name: " + s1);
        System.out.println("****************************");
        
        // add to integer
        int num1 = 23;
        int num2 = 45;
        int c = num1 + num2;
        System.out.println("Sum of "+num1+ " and " + num2+ " is : "+ c);
	}

}
