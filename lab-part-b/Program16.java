// 16. Write a java program to demonstrate multiple inheritance by interface

class Program16 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.height();
	}
}

interface Father {
	float ht = 6.2f;

	void height();
}

interface Mother {
	float ht = 5.8f;

	void height();
}

class Child implements Father, Mother {
	public void height() {
		float ht = (Father.ht + Mother.ht) / 2;
		System.out.println("Child's height is " + ht);
	}
}