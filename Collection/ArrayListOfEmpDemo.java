package Collection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListOfEmpDemo {

	public static void main(String[] args) {
		List<Emp> emplist = new ArrayList<>();

		Emp e1 = new Emp(10, "Virat");
		Emp e2 = new Emp(20, "Anushka");
		Emp e3 = new Emp(30, "Surya");
		Emp e4 = new Emp(40, "Chahal");

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
System.out.println(emplist);


for(Emp emp:emplist)
{
	System.out.println(emp.getName());
	System.out.println(emp.getId());
}
	}

}
