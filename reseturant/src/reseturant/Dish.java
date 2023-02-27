package reseturant;

public class Dish {
	private String name;
	private double price;
	private boolean available;

	public Dish(String name, int price) {
		this.name = name;
		this.price = price;
		this.available = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
