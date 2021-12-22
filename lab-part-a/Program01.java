// write a program to sort and display a vector with command line input

import java.util.Vector;
import java.util.Collections;

class Program01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		if (args.length <= 0) {
			System.out.println("No command-line input found");
		} else {
			for (int i = 0; i < args.length; i++) {
				v.add(Integer.parseInt(args[i]));
			}

			Collections.sort(v);
			System.out.println(v);
		}
	}
}