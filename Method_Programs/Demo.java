package Method_Programs;

public class Demo {
public static void main(String[] args) {
	
	
	Object [][] data = abc("",90);

	for(int a = 0;a<data.length;a++)
	{
		System.out.println(data[a]);
	}
	
}
	
	public static Object[][] abc(String a,int b)
	{
		Object [] [] data = {
		 {a="Swapnil"},
		 {b=100}};
		return data;
	}
	
}
