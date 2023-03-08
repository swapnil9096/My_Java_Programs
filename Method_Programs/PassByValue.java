package Method_Programs;

public class PassByValue {
	PassByValue(int a) 
	{
		System.out.println(a);
	}

	 void shaka() {
		int a = 100;
		String s = "Swapnil";
		laka(a,s);
	}

	 void laka(int i,String k) 
	{
		System.out.println(i+"=="+k);
	}

	public static void main(String[] args) {
		PassByValue obj = new PassByValue(1000);
			obj.shaka();
	}
	

}
