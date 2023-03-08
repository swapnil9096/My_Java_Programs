package Daily_Programs;

public class Car 
{
private int price;
private char type;
private String color;
private float weight;
private boolean isElectric;

public Car(int price ,char type, String color ,float weight ,boolean isElectric)
{
	this.price=price;
	this.type=type;
	this.color=color;
	this.weight=weight;
	this.isElectric=isElectric;
	}
public int getPrice()
{
	return this.price;
}

public char getType()
{
	return this.type;
}
public String getColor()
{
	return this.color;
}
public float getWeight()
{
	return weight;
}
public boolean getisElectric()
{
	return isElectric;
}

public String toString() 
{
return	"Car [price=" + price + ", type=" + type + ", color=" + color + ", weight=" + weight + ", isElectric="
			+ isElectric + "]";	
}


}
