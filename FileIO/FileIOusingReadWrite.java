package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOusingReadWrite {

	public static void main(String[] args) {
		try {
			FileReader a = new FileReader("D:\\ECLIPSE\\Happy_Diwali\\src\\FileIO\\Demo");

			FileWriter b = new FileWriter("D:\\ECLIPSE\\Happy_Diwali\\src\\FileIO\\Demo3");

			for (int c; (c = a.read()) != -1;)
			b.write(c);
			a.close();
			b.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error in File reading...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error Showing in  writting...");
			e.printStackTrace();
		}
	}

}
