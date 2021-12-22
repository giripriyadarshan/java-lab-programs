package Packages;

public class Square {
	float side;
	float area;

	public Square(float a) {
		side = a;
	}

	public void calculateArea() {
		area = side * side;
		System.out.println("Area of square " + area);
	}
}