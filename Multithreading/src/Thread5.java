class ThreadDemo implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " thread is running ... " + i);
		}
	}
}

public class Thread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t = new ThreadDemo();

		Thread t1 = new Thread(t, "First");
		t1.setPriority(Thread.MAX_PRIORITY);

		Thread t2 = new Thread(t, "Second");
		t2.setPriority(Thread.MIN_PRIORITY);

		Thread t3 = new Thread(t, "Third");
		t3.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
