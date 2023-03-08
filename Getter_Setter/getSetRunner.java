package Getter_Setter;

public class getSetRunner {

	public static void main(String[] args) 
	{
	getSet obj=new getSet();
	obj.setId(66);
	obj.setId(90);
	obj.setName("Swapnil");
	obj.setName("Vishakha");
	System.out.println(obj.getId());
	System.out.println(obj.getName());
	System.out.println(obj.getId());
	System.out.println(obj.getId());
	obj.setName("Swapnil");
	System.out.println(obj.getName());
	
	}
}
