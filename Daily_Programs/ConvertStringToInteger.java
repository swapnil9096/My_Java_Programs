package Daily_Programs;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		
		String a = "100f";
		
		System.out.println(a + 100);
		try {
			
		
		int a1 = Integer.parseInt(a);
		
		System.out.println(a1 + 100);
		
		}catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("Given String can not be convert into the integer");
		}
		
		
	}

}
