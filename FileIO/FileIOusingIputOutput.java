package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOusingIputOutput {

	public static void main(String[] args) {
		try{
		FileInputStream a=new FileInputStream("D:\\ECLIPSE\\Happy_Diwali\\src\\FileIO\\Demo");
		
		FileOutputStream b=new FileOutputStream("D:\\ECLIPSE\\Happy_Diwali\\src\\FileIO\\Demo1");
		
		int t;
		while((t=a.read())!= -1)
			b.write(t);
			a.close();
			//b.flush();
			//b.close();
		
		}catch(FileNotFoundException e)
		{
			System.out.println("Error reading file....");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("error in File  Writting....");
			e.printStackTrace();
		}
	}

}
