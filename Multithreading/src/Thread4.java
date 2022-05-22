class OddThread implements Runnable {
	Thread thread;

	OddThread() {

		thread = new Thread(this);
		System.out.println("Odd thread");
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);
		}
	}
}

class EvenThread implements Runnable {
	Thread thread;

	EvenThread() {

		thread = new Thread(this);
		System.out.println("Even thread");
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);
		}
	}

}

public class Thread4 {
	public static void main(String[] args) throws InterruptedException {
		EvenThread even = new EvenThread();
		OddThread odd = new OddThread();
//		odd.thread.join();
//		even.thread.join();

	}

}
