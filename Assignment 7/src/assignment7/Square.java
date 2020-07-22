package assignment7;

public class Square extends Parallelogram {

	Square(double s) {
		super(s, s);
	}
public String toString() {
	return String.format("I am a square with area" + area());
}
}
