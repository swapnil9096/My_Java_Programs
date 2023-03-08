package Comparator;

public class Defect {
	int id;
	String name;

	Defect(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "id=" + id + "name=" + name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
