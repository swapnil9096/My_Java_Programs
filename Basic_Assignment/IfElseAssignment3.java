package Basic_Assignment;
//WAP=>A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
public class IfElseAssignment3 {

	public static void main(String[] args) {
int quantity=20,perUnit=100,discount,totcost;
discount=(quantity*perUnit)/10;
totcost=quantity*perUnit;
if((quantity*perUnit)>1000)
{
	System.out.println("Total cost=> "+totcost);
}
System.out.println("Discount=> "+discount);
	}

}
