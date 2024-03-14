package inheritance;



class Animal {

	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Animal
	class Dog extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	class Main {
	  public static void main(String[] args) {
		  
		// Animal a = new Dog();
	    Dog d = new Dog();

	    d.name = "rock";
	    d.display();
	    d.eat();

	  }
	}
