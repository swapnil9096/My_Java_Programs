package SingletonClass;

public class SingetonRunner {
public static void main(String[] args) {
	//SingletonClassDemo sc=new SingletonClassDemo();
	
	SingletonClassDemo sc=SingletonClassDemo.getInstance();
	System.out.println(sc.hashCode());
	SingletonClassDemo sc2= SingletonClassDemo.getInstance();
	System.out.println(sc2.hashCode());
	
	
}
}
