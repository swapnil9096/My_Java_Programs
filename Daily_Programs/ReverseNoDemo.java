package Daily_Programs;

public class ReverseNoDemo {
public static void main(String[] args) {

	int i =2345;
	int j = 0;
	while(i>0)
	{
		j = i%10;
		System.out.print(j);
		
		i=i/10;
	}

}
}
