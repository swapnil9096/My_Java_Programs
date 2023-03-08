package While_Loop_Programs;

public class Fibo {

	public static void main(String[] args) {
	int a=0,i=0,b=1,res=0;
	while(i<=9)
	{
		System.out.println(a);
		res=a+b;
		a=b;
		b=res;
		i++;
	}

	}

}
