// 18. Write a program to implement wrapper classes.

class Program18 {
	public static void main(String[] args) {
		int b = 10;
		Integer intobj = new Integer(b);
		float c = 18.6f;
		Float floatobj = new Float(c);
		char e = 'a';
		Character charobj = e;

		int iv = intobj;
		float fv = floatobj;
		char cv = charobj;

		System.out.println("Printing as data types");
		System.out.println("int value " + iv);
		System.out.println("float value " + fv);
		System.out.println("char value " + cv);
	}
}