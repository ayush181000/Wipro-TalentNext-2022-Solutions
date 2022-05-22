class Runner implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In thread");

	}

}

public class Thread1 {

	public static void main(String[] args) {
		Thread scooby = new Thread(new Runner());
		Thread shaggy = new Thread(new Runner());

		scooby.start();
		shaggy.start();
	}
}
