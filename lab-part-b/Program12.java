// 12. Write a java program to demonstrate mathematical functions.

class Program12 {
	public static void main(String[] args) {
		int integer1 = 27, integer2 = -45;
		double double1 = 84.6, double2 = 0.45;

		System.out.println("Absolute value of " + integer2 + " = " + Math.abs(integer2));
		System.out.println("Round off for " + double1 + " = " + Math.round(double1));
		System.out.println("Ceiling of " + double1 + " = " + Math.ceil(double1));
		System.out.println("Floor of " + double1 + " = " + Math.floor(double1));
		System.out.println("Minimum out of " + integer1 + " and " + integer2 + " = " + Math.min(integer1, integer2));
		System.out.println("Maximum out of " + integer1 + " and " + integer2 + " = " + Math.max(integer1, integer2));
		System.out.println("exp " + double2 + " = " + Math.exp(double2));
		System.out.println("2^3 = " + Math.pow(2, 3));
		System.out.println("sqrt(16) = " + Math.sqrt(16));
	}
}