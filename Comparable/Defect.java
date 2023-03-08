package Comparable;

public class Defect implements Comparable<Defect> {
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

	@Override
	public int compareTo(Defect a1) {
		if(this.id==a1.id)
		return 0;
		else if(this.id>a1.id)
			return -1;
		else 
			return 1;
		
		
		
		
		
		
		
		
	}

}
