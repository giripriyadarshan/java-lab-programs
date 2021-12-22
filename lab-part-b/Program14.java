// 14. Write a java program to implement constructor overloadingby passing different number of parameters of different types.

class Program14 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box(10, 20, 15);
		Box box3 = new Box(7);

		System.out.println("Volume of box1 = " + box1.volume());
		System.out.println("Volume of box2 = " + box2.volume());
		System.out.println("Volume of box3 = " + box3.volume());
	}
}

class Box {
	double width, height, depth;

	Box() {
		width = height = depth = 0;
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(double length) {
		width = height = depth = length;
	}

	double volume() {
		return width * height * depth;
	}
}