package Basic_Assignment;
/*o	A three digit number is called Armstrong number,
o	if sum of cube of its digit is equal to number itself.
o	
o	E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
o	Write all Armstrong numbers between 100 to 500.*/

public class LoopAssignment13 {
 public static void main(String[] args) {
	
int  sum,n1,n2,n3,first,second,third;
System.out.print("Armstrong numbers 100 to 500 =>");
for(int i=100;i<=500;i++) 
{
n1=i/100%10;
n2=i/10%10;
n3=i%10;
	first=n1*n1*n1;
	second=n2*n2*n2;
	third=n3*n3*n3;
sum=first+second+third;

if(i==sum)
{
System.out.print(i+" ");
}
else
	System.out.print("");
}
}
}
