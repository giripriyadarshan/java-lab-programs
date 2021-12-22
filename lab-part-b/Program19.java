// 19. W.A.P to to create thread using runnable interface

class Program19 {
	public static void main(String[] args) {
		MyThread object1 = new MyThread();
		Thread t1 = new Thread(object1);
		t1.start();
	}
}

class MyThread implements Runnable {
	public void run() {
		System.out.println("Thread from Runnable interface running");
	}
}