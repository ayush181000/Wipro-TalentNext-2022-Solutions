
class DemoThread implements Runnable {

	String name;
	Thread thread;

	DemoThread(String threadname) {
		name = threadname;
		thread = new Thread(this, name);
		System.out.println("New thread :  " + name);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread d = new DemoThread("loop");

	}

}
