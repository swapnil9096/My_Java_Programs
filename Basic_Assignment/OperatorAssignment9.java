package Basic_Assignment;
//WAP=>If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
public class OperatorAssignment9 {

	public static void main(String[] args)
	{
int math=78,science=42,chemistry=62,add,percentage;
	add=math+science+chemistry;
	percentage=add/3;
    System.out.println("Total marks= " + add);
	System.out.println("percentage of Robert is= "+ percentage+ "%");
		}

}
