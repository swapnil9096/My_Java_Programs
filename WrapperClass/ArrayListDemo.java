package WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
List al = new ArrayList<>();
System.out.println(("al.side: "+al.size()));
al.add(10);
al.add(20);
System.out.println(("al.side: "+al.size()));
al.add(30);
System.out.println(("al.side: "+al.size()));
al.add(30);
System.out.println(("al.side: "+al.size()));
System.out.println(al);
al.add(1,100);
System.out.println(("al.side: "+al.size()));
System.out.println(al);



	}

}
