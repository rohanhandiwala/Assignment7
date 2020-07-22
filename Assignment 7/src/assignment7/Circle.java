package assignment7;

public class Circle implements Shape {

	public double radius;
	
	public Circle (double radi) {
		radius = radi;
	}
	
	@Override
	public String toString() {
		return String.format("I am a circle with area" + area());
	}
	
	
	@Override
	public double area() {
		double totalArea = Math.PI * Math.pow(radius, 2);
		return totalArea;
	}

}

