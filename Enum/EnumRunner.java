package Enum;

//* An enum type is a special data type that enables for a variable to be a set of predefined constants. 
//* The variable must be equal to one of the values that have been predefined for it. 
//* Common examples include 
//* Compass directions (values of NORTH, SOUTH, EAST, and WEST) 
//* Planet Names: Venus,Earth, Jupyter
//* The days of the week(Sun, Mon,Tue,Wed,Thu,Fri,Sat).
//* Month Names:JAN,FEB....NOV,DEC
//* COLOR names: RED,GREEN,BLUE
//* Metro City Names: MUMBAI, CHENNAI, CULKATTA, DELHI
//* As they are constants, the names of an enum type's fields are in UPPER CASE letters.
//* Enums are used to avoid typos - spelling mistakes
//* Enum improves type safety
//* Enum can be easily used in switch
//* Enum can be traversed(values())
//* Enum can have fields, constructors and methods
//* Enum may implement many interfaces but cannot extend any class because it internally extends Enum class
//*  we can not create the instance of Enum by new keyword as it has private constructor.
//*  we can have an abstract method in the Enum.
public class EnumRunner {
	public static void main(String[] args) {

		System.out.println(EnumColor.BLACK);
		// get all values from Enum
		// values(): The values() method returns an array containing all the values of
		// the enum.
		// ordinal(): The ordinal() method returns the index of the enum value.
		for (EnumColor c : EnumColor.values()) {
			System.out.println(c);
		}
		EnumColor cvalue = EnumColor.BLACK;
		System.out.println(cvalue);

	}
}
