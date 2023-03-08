package Comparable;

public class Emp implements Comparable<Emp> {
	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "id=" + id + " name=" + name;
	}

	@Override
	public int compareTo(Emp that) {
		if(this.id==that.id)
		return 0;
		else if(this.id<that.id)
			return -1;
		else
			return 1;
		
	}


}
