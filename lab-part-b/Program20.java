// 20. Write a program to implement thread priorities.

class Program20 {
	public static void main(String[] args) {
		A thread1 = new A();
		B thread2 = new B();
		C thread3 = new C();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class A extends Thread {
	public void run()
	{
		for (int i=0;i<3 ;i++ ) {
			System.out.println("Thread1 is executing");			
		}
	}
}

class B extends Thread {
	public void run()
	{
		for (int j=0;j<3 ;j++ ) {
			System.out.println("Thread2 is executing");
		}
	}
}

class C extends Thread {
	public void run()
	{
		for (int k=0;k<3 ;k++ ) {
			System.out.println("Thread3 is executing");
		}
	}
}
