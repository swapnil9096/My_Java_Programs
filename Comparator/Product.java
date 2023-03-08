package Comparator;

public class Product {
	int id;
	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "id=" + id + "name=" + name;
	}
}
