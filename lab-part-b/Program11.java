// 11. Write a java program to print fibonacci series using command-line argument.

class Program11 {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		if (args.length < 1) {
			System.out.println("Please input something in command-line");
			System.exit(0);
		}

		int n = Integer.parseInt(args[0]);
		System.out.print(a + " " + b);
		for (int i = 1; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
	}
}