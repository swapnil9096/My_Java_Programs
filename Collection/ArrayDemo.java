package Collection;

public class ArrayDemo {
	public static void main(String[] args) {
		Object[] objArr = new Object[4];
		
		objArr[0] = 1;  // int
		objArr[1] = 11.2f; // float
		objArr[2] = true; // boolean
		objArr[3] = "Pune";  // String
		
		for(Object x: objArr)
			System.out.println(x);
		
	}
}
