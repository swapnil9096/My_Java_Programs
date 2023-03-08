package Basic_Assignment;

/*o	If
o	x = 2
o	y = 5
o	z = 0
o	then find values of the following expressions:
o	a. x == 2
o	b. x != 5
o	c. x != 5 && y >= 5
o	d. z != 0 || x == 2
o	e. !(y < 10)
*/
public class Assignment10 {

	public static void main(String[] args) {
		int x = 2,y = 5,z = 0;
		if(x == 2)
				System.out.println(x == 2);
	    if(x != 5)
	    		System.out.println(x != 5);
		if(x != 5 && y >= 5)
				System.out.println(x != 5 && y >= 5);
		if(z != 0 || x == 2)
				System.out.println(z != 0 || x == 2);
		if(!( y < 10))
		{
				System.out.println(!(y < 10));
		}

	}

}
