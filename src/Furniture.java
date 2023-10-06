public class Furniture {

	private String type;
	private String name;
	private double price;

	public Furniture(String type, String name, double price) {
		this.type = type;
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return type + " - \"" + name + "\", " + price + "грн";
	}
}
