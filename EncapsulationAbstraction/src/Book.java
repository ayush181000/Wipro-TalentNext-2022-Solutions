// 1

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book math = new Book("Mathematics for 12", new Author("Name", "email", 'M'), 200, 50);

		System.out.println("Details of the book are as follows :-");
		System.out.println("Name : " + math.getName());
		System.out.println("Author : " + " Name: " + math.getAuthor().getName() + ", Email : "
				+ math.getAuthor().getEmail() + ", Gender: " + math.getAuthor().getGender());
		System.out.println("Price : " + math.getPrice());
		System.out.println("Quantity : " + math.getQtyInStock());

	}

}