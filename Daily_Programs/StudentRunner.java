package Daily_Programs;

public class StudentRunner {
	public static void main(String[] args) {
		
		Student s1=new Student();//object get created to heap memory
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.result);
		System.out.println(s1.perc);
		System.out.println(Student.schoolname);
		
		
		
		//Every object has-id,instance variable,method
		//Every class has an 'Object' as a parent class
		//11 methods in Object class
		s1.gender='m';
		s1.id=100;
		s1.name="Swapnil";
		s1.perc=99;
		s1.result=true;
		Student.Zp1();
		s1.appearForExam();
		s1.study();
		s1.play();
		System.out.println(s1.hashCode());
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.result);
		System.out.println(s1.perc);

		System.out.println("=".repeat(50));
		  
		
		Student s2=new Student();
		s2.gender='F';
		s2.id=200;
		s2.name="XYZ";
		s2.perc=35;
		s2.result=false;
	     //S Student.schoolname="Zilha Parishad,America";
		Student.Zp2();
		
		System.out.println(s2.hashCode());
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.gender);
		System.out.println(s2.result);
		System.out.println(s2.perc);

		System.out.println("*".repeat(50));

		
		

		


	}

}
