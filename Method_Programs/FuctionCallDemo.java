package Method_Programs;

public class FuctionCallDemo {
	static void india()
	{
	System.out.println("I stay in India");
	uk();
	}
	static void uk()
	{
	System.out.println("I stay in uk");
	usa();
	}
	static void usa()
	{
	System.out.println("I stay in usa");
	france();
	}
	static void france()
	{
	System.out.println("I stay in france");
	return ;
	}
	
	public static void main(String[] args) {
		india();
	}

}
