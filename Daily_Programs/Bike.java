package Daily_Programs;

public class Bike {
		
	private String color;
		
		static void passObject(Bike c)
		{
			 c.color = "WHITE";
		}
		public static void main(String[] args) {
			Bike b = new Bike();
			b.color="RED";
			passObject(b);
			System.out.println(b.color);
		}

}
