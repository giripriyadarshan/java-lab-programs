// 3. Write a program to calculate the areas of different geometrical figures using abstract class.

class Program03 {
	public static void main(String[] args) {
		square s = new square();
		circle c = new circle();
		rectangle r = new rectangle();

		System.out.println("area of square = " + s.area());
		System.out.println("area of circle = " + c.area());
		System.out.println("area of rectangle = " + r.area());
	}
}

abstract class geometricalFigures {
	float length, breadth, side, radius;
	abstract double area();
}

class square extends geometricalFigures {
	double area() {
		side = 4f;
		return (side * side );
	}
}

class circle extends geometricalFigures {
	double area() {
		radius = 4.0f;
		return  (3.14f * radius * radius);
	}
}

class rectangle extends geometricalFigures {
	double area() {
		length = 4f;
		breadth = 6f;
		return (length * breadth);
	}
}