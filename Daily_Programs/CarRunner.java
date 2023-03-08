package Daily_Programs;

public class CarRunner {
	public static void main(String[] args) {
		
	
	int price=1000;
	float weight=1200;
	char type='U';
	boolean isElectric=true;
	String color="Black1";
	
	Car c1 = new Car(price,type,color,weight,isElectric);
	
	{
		System.out.println(c1.getPrice());
	}
	Car c2 = new Car(900,'B',"Black",4000,false);
	{
		System.out.println(
				c2.getPrice()+"::"+
				c2.getColor()+"::"+
				c2.getType()+"::"+
				c2.getWeight()+"::"+
				c2.getisElectric()+"::");
		System.out.println("c2.toString()==>"+c2.hashCode());

		System.out.println("c2.toString()==>"+c2);
		System.out.println(c1.getPrice()+"::"+
							c1.getWeight()+"::"+
							c1.getType()+"::"+
							c1.getisElectric()+"::"+
							c1.getColor()+"::");
	}
	}

}
