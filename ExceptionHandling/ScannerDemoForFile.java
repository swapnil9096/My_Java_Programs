package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemoForFile {

	public static void main(String[] args) {
		String fileName = "D:\\ECLIPSE\\Happy_Diwali\\src\\ExceptionHandling\\Hello2";
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			System.out.println("File not exist...!!!");
		}
	}

}
//Notes=Try with Resource is useful when you use a class which implements closable interface, the resource //get automatically closed.
//You not need to close the resource explicitly