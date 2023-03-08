package CollectionSet;
import java.util.HashSet;
import java.util.Set;
public class SetOfStudentsDemo {

	public static void main(String[] args) {
		Set<Student> s1= new HashSet<>();
		s1.add(new Student(10,"virat"));
		s1.add(new Student(1,"swapnil"));
		s1.add(new Student(2,"hello"));
		s1.add(new Student(3,"virat"));
		
		System.out.println(s1.toString());
	}
}