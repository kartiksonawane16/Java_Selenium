package encapsulation;

public class Encapsulation {

	  private int length;
	  private int breadth;

	  // constructor
	  Encapsulation(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	  public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	// method to calculate area
	  public void getArea() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }

	}


	class Main {
	  public static void main(String[] args) {

	    // create object of class
		  Encapsulation rectangle = new Encapsulation(5, 6);
	    rectangle.getArea();
	  }
}
