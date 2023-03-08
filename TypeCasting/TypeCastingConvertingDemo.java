package TypeCasting;

//1 byte = 8 bits capable of storing either 1 or 0 at a given time
public class TypeCastingConvertingDemo {

	public static void main(String[] args) {
		// Widening Data type from int (4 bytes) to double(8 bytes)
		// The lower data type (having smaller size) is converted into the higher data
		// type (having larger size).
		// So there is no loss in data.
		// This is why this type of conversion happens automatically.
		// byte->short->int->long->float->double
		// char
		// boolean -> char
		int num = 100;
		System.out.println("Integer value: " + num);
		double data = num;
		System.out.println("Double value" + data);

		// Narrowing Type Casting: we manually convert one data type into another using
		// the parenthesis.
		// In the case of Narrowing Type Casting, the higher data types (having larger
		// size) are converted into
		// lower data types (having smaller size). So there is the loss of data.
		// This is why this type of conversion does not happen automatically.

		double n = 20.89d;

		System.out.println("Double value: "+ n);
		
		int data1= (int)n;// explicit type conversion, done by programmer/developer from double to int
	
		System.out.println("Integer value: "+data1);// data loss .89 is truncated
		
		int a=34;//Integer to String conversion
		System.out.println("Integer value : " + a);
		
		String str =String.valueOf(a);
		System.out.println( "String new value: "+ str);
		
		//String to Number conversion
		String str2="100";
		System.out.println("Orignal String: "+str2);
		int no=Integer.parseInt(str2);
		System.out.println("New value of Integer: "+(no+200));
	}

}
