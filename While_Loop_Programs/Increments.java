package While_Loop_Programs;

public class Increments {

	
	public static void main(String[] args) {
int a=100,b=87,c=1;
a= b + c-- + a++ - --b + ++c; //(87+0+101)-(86+1)=188-87  
b= (a+b - --a) + (++b - --a); 
c= a+b + c++; 

System.out.print(a);
	}
}
    		 