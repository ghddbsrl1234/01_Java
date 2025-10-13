
public class Book {
	
	private int num;
	private String name;
	private String author;
	private int price;
	private String pubHouse;
	
	public Book() {}

	public Book(int num, String name, String author, int price, String pubHouse) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.price = price;
		this.pubHouse = pubHouse;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPubHouse() {
		return pubHouse;
	}

	public void setPubHouse(String pubHouse) {
		this.pubHouse = pubHouse;
	}

	@Override
	public String toString() {
		return "";
	}
	
}
