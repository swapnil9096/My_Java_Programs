package FileIO;

import java.io.File;

public class FileIO {

	public static void main(String[] args) {
		
		File a=new File("D:\\ECLIPSE\\Happy_Diwali\\src\\FileIO\\Demo1");
		
		System.out.println(a.getAbsolutePath());
		System.out.println(a.exists());
		System.out.println(a.compareTo(a));
		System.out.println(a.getName());
		System.out.println(a.delete());
		System.out.println(a.exists());
	}

}
