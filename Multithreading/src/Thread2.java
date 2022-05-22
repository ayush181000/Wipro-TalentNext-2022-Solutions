import java.util.HashMap;

class Runner2 implements Runnable {

	@Override
	public void run() {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "red");
		map.put(2, "yellow");
		map.put(3, "white");
		map.put(4, "blue");
		map.put(5, "black");
		map.put(6, "green");

		while (true) {
			int color = (int) Math.floor(Math.random() * 6) + 1;

			System.out.println(map.get(color));
			
			if (color == 1) {
				break;
			}

//			if (map.get(color) == "red") {
//				break;
//			}

		}

	}

}

public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(new Runner2());

		t.start();
	}

}
