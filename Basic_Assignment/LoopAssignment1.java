package Basic_Assignment;

//WAP=>Take 10 integers from keyboard using loop and print their average value on the screen
public class LoopAssignment1 {

	public static void main(String[] args) {
		double sum = 0, avrg;
		for (int i = 10; i <= 20; i++)

			sum = sum + i;

		avrg = sum / 10;
		System.out.println(avrg);
	}
}
