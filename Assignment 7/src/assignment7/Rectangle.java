package assignment7;

public class Rectangle extends Parallelogram{

	Rectangle(double w, double h) {
		super(w, h);
	}
	
	public String toString() {
		return String.format("I am a rectangle with area " + area());
	}
	

}