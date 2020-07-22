package assignment7;

public class Parallelogram implements Shape {
public double base;
public double height;

Parallelogram(double b, double h){
	this.base = b;
	this.height = h;
}

@Override
public double area() {
	return base*height;
}
@Override
public String toString() {
	return String.format("I am a parallelogram with area" + area());
}
}

 