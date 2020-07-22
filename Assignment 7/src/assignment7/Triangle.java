package assignment7;

public class Triangle implements Shape {

	public double base;
	public double height;
	
	Triangle (double b, double h) {
		this.base =b;
		this.height=h;
	}
	
@Override
public double area () {
	return (base * height)/2;
}
@Override
public String toString() {
	return String.format("I am a triangle with area" + area());
}
}
