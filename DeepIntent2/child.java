package DeepIntent2;

import DeepIntent.ProtectedAccessModifier;

public class child extends ProtectedAccessModifier{

	public static void main(String[] args) {
		
		child c= new child();
		c.print();
	}
	
	protected void hello()
	{
		System.out.println("vadkakusy");
	}
}
