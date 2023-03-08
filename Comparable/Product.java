package Comparable;

public class Product implements Comparable<Product> {
	int id;
	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getname() {
		return name;
	}
	public String toString()
	{
		return "id=" + id + "name" + name;
	}
	
	public int compareTo(Product p)
	{
		if(this.getname().compareTo(p.getname())==0)
			return 0;
		else if(this.getname().compareTo(p.getname())<=0)
			return -1;
		else 
			return 1;
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	

