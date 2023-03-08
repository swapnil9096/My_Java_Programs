package Basic_Assignment;
//The total number of students in a class are 90 out of which 45 are boys.
//If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.

public class OperatorAssignment12 {

	public static void main(String[] args) {
int totStud=90,halfStud,grade_A_boys=20,grade_A_girls;
halfStud=totStud/2;//45
grade_A_girls=halfStud-grade_A_boys;//25
System.out.println("Total number of girls getting grade A=> "+grade_A_girls);
	}

}
