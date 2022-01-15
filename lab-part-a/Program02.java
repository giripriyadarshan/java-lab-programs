// Write a program to find area of geometrical figures using method overloading

public class Program02 {
    public static void main(String[] args) {
        var figure1 = new GeometricalFigures();
        System.out.println("area of square = " + figure1.area(4));
        System.out.println("area of rectangle = " + figure1.area(7, 4));
        System.out.println("area of circle = " + figure1.area(3));
    }
}

class GeometricalFigures {
    int area(int side) {
        return (side * side);
    }

    int area(int length, int breadth) {
        return (length * breadth);
    }

    double area(float radius) {
        return (3.14 * radius * radius);
    }
}