package polymorphisum;

class Language {
	
	  public void displayInfo() {
	    System.out.println("Common English Language");
	  }
	  
	  public void myLanguage() {
		  String name = "English";
		System.out.println("My language is : "+ name);
	  }
	}

	class Java extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }

	  public void myLanguage() {
			String name1 = "Java";
			String name2 = "Python";
			System.out.println("My 2 languages are : "+ name1+ " and "+ name2);
		  }
	}

	class Main {
	  public static void main(String[] args) {

	    // create an object of Java class
	    Java j = new Java();
	    j.displayInfo();
	    j.myLanguage();

	    // create an object of Language class
	    Language l = new Language();
	    l.displayInfo();
	    l.myLanguage();
	  }
	}