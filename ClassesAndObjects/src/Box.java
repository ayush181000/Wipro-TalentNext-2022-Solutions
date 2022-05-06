// 1 a

class Box {
	private double height;
	private double width;
	private double length;

	Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double volume() {
		return height * width * length;
	}
}
