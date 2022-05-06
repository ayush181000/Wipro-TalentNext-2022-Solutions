// 2 a

public class Shape {
	public void draw() {
		System.out.println("Drawing shape");
	}

	public void erase() {
		System.out.println("Erasing Shape");
	}

	static class Circle {
		public void draw() {
			System.out.println("Drawing circle");
		}

		public void erase() {
			System.out.println("Erasing circle");
		}
	}

	static class Triangle {
		public void draw() {
			System.out.println("Drawing Triangle");
		}

		public void erase() {
			System.out.println("Erasing Triangle");
		}
	}

	static class Square {
		public void draw() {
			System.out.println("Drawing Square");
		}

		public void erase() {
			System.out.println("Erasing Square");
		}
	}
}
