package Encapsulation;

public class Student {
	private int id;
	private String name;

	Student() {

	}

	private Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + "===" + name);
	}

	public int getId() {
		return id=1000;
	}

	public String getName() {
		return name="virat";
	}

}
