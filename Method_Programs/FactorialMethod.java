package Method_Programs;

public class FactorialMethod {
int fact()
{
	int n=6,mult=1;
	for(int i=n;i>=1;i--)
	{
		mult=mult*i;
	}
	return mult;
}
public static void main(String[] args) {
	FactorialMethod obj=new FactorialMethod();
	System.out.println(obj.fact());
}
}
