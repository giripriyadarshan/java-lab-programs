// 13. Write a java program to implement all string operations.

class Program13 {
	public static void main(String[] args) {
		String s1 = "COMPUTER SCIENCE";
		String s2 = "COMPUTER SCIENCE";
		System.out.println("First string is " + s1);
		System.out.println("Second string is " + s2);
		System.out.println("Lowercase: \ns1 = " + s1.toLowerCase() + "\ns2 = " + s2.toLowerCase());

		System.out.println("Substring 4, 5 = " + s1.substring(4,5));
		System.out.println("String length = " + s1.length());
		System.out.println("Comparison of 2 strings = " + s1.equals(s2));
		System.out.println("First occurance of 'e' = " + s1.toLowerCase().indexOf('e'));
		System.out.println("Last occurance of 'e' = " + s1.toLowerCase().lastIndexOf('e'));
		System.out.println("Replace letter 'i' with 'a' = " + s1.toLowerCase().replace('i', 'a'));
		System.out.println("Char at position 4 is = "+ s1.charAt(4));
	}
}