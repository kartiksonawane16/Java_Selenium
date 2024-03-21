package arraylist;


import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("kartik");
		ar.add("sonawane");
		
		ar.add("Java");
		ar.add(0, "student");
		System.out.println(ar);
		System.out.println(ar.contains("kartik"));
		ar.containsAll(ar);
		
		ar.remove(0); 
		ar.remove("java"); 
		
		ar.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + ar);
		
		
		System.out.println(ar.indexOf("kartik")); 
		System.out.println(ar.isEmpty()); 
		System.out.println(ar.size());
		
		// for loop
		for (String i : ar) {
			 
            System.out.print(i + " ");
            System.out.println("");}
		
		// Iterator method
		Iterator<String> it = ar.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        System.out.println(" ");}
        
        // for each loop
        ar.forEach(name->System.out.println(name));
	}

}
