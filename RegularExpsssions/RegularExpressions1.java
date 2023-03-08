package RegularExpsssions;

import java.util.regex.Pattern;

//Pattern class: A pattern object is compiled representation of a regular expression
	// MAtcher class: A Matcher Object is the engine that interprets the pattern and perform operations against an input string
	/*
	 [abc]: either a or b or c
	 [^abc]: any character except a or b or c
	 [a-z]: char between a to z
	 [A-Z]: char between A to Z
	 [a-zA-Z]: char between a to z or A-Z
	 [0-9]: digit between 0 to 9
	 []?:  0 or 1 char/digit 
	 . : represents one character alphabet/digit
	 []+:  char/digit 1 or more times
	 []*:  char/digit 0 or more times
	 []{n}: Occurs n times
	 []{n,}: Occurs n or more times
	 []{a,b}: Occurs at least a times but below b times
	 \d: [0-9]
	 \D:[^0-9]
	 \w:[a-zA-Z0-9]
	 \W:[^\w]
	 */
	
public class RegularExpressions1 {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[acd]","a")); //true
		System.out.println(Pattern.matches("[acd]","c")); //true
		System.out.println(Pattern.matches("[acd]","d")); //true
		System.out.println(Pattern.matches("[acd]","e")); //false
		System.out.println(Pattern.matches("[acd]","ac")); // false
		System.out.println(Pattern.matches("[acd]","acd")); //false
		System.out.println(Pattern.matches("[acd]","mnoa")); //false
		System.out.println(Pattern.matches("[^acd]","m")); //true
		System.out.println(Pattern.matches("[^acd]","a")); //false
		System.out.println(Pattern.matches("[a-zA-S]","U"));
		System.out.println(Pattern.matches("[a-zA-S]","B"));
		System.out.println(Pattern.matches("[a-zA-S]","z"));
		// {5}: Quantifier
		System.out.println(Pattern.matches("[SM][onali]{5}","Sonali"));
		System.out.println(Pattern.matches("[SM][onali]{5}","Monali"));
		System.out.println(Pattern.matches("[SM][onali]{5}","Donali"));
		 
		
		//? : represents zero or one character
		System.out.println(Pattern.matches("[xyz]?","x")); //true
		System.out.println(Pattern.matches("[xyz]?","")); // true
		System.out.println(Pattern.matches("[xyz]?","y")); //true
		System.out.println(Pattern.matches("[xyz]?","z")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println(Pattern.matches("[xyz]?","xx")); //false
			
		//+ represents one or more character
		System.out.println(Pattern.matches("[xyz]+","x")); //true
		System.out.println(Pattern.matches("[xyz]+","xx")); //true

		
		//* zero or more characters
		System.out.println(Pattern.matches("[xyz]*","xyyz")); //true
		System.out.println(Pattern.matches("[xyz]*","yyyyy")); //true
		System.out.println(Pattern.matches("[xyz]*","zzzz")); //true
		System.out.println(Pattern.matches("[xyz]*","xxyyzz")); //true
		System.out.println(Pattern.matches("[xyz]*","")); //true
		System.out.println(Pattern.matches("[xyz]*","xxdyyzz")); 
		
		//Meta character [0-9]
		System.out.println(Pattern.matches("\\d","1")); //true
		System.out.println(Pattern.matches("\\d{2}","12")); //true
		System.out.println(Pattern.matches("\\d{2}","56")); //true
		
		// \\d represents 0-9
		System.out.println(Pattern.matches("\\d{1,3}","1")); //true
		System.out.println(Pattern.matches("\\d{1,3}","23")); //true
		System.out.println(Pattern.matches("\\d{1,3}","567")); //true
		System.out.println(Pattern.matches("\\d{1,3}","8768")); //false
		System.out.println(Pattern.matches("\\d{1,5}","98765")); //true

		//w: [a-zA-Z0-9]
		System.out.println(Pattern.matches("\\w{1,3}","abc")); //true
		System.out.println(Pattern.matches("\\w{1,3}","abcde")); //false
		System.out.println(Pattern.matches("\\w{1,3}","ab1")); //true
		System.out.println(Pattern.matches("\\w{1,3}","123")); //true
		System.out.println(Pattern.matches("\\w{1,3}","ABC")); //true
		System.out.println(Pattern.matches("\\w{1,3}","abcd")); //false
		
		
		// \\D: [a-zA-Z]
		System.out.println(Pattern.matches("\\D","1")); //false
		System.out.println(Pattern.matches("\\D","12")); //false
		System.out.println(Pattern.matches("\\D","A")); //true
		System.out.println(Pattern.matches("\\D","a")); //true
		System.out.println(Pattern.matches("\\D","ab")); //false
		
		// . represents a single character
		System.out.println(Pattern.matches("..m","alm")); //true
		System.out.println(Pattern.matches("alm","alm")); //true
		System.out.println(Pattern.matches("alm","apq")); //false
		System.out.println(Pattern.matches("...","apq")); //true
		
		System.out.println(Pattern.matches(".o","monali")); //false
		System.out.println(Pattern.matches("[mo][onali]{5}","monali")); //true
		System.out.println(Pattern.matches(".o[nali]{4}","monali")); //true
		System.out.println(Pattern.matches(".o[nali]{5}","monali")); //false
		
		
		System.out.println(Pattern.matches("[xyz]?","xxx")); //false
		System.out.println(Pattern.matches("[xyz]?","x")); //true
		System.out.println(Pattern.matches("[xyz]?","y")); //true
		System.out.println(Pattern.matches("[xyz]?","z")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
	
		
		System.out.println(Pattern.matches("[xyz]*","x")); //true
		System.out.println(Pattern.matches("[xyz]*","xx")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false

		// write a program which is of 10 digit and starts with either 7/8/9
		// 7/8/9 552588168
		System.out.println(Pattern.matches("[789][0-9]{9}","7552588168")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}","8552588168")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}","9525881681")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}","1552588168")); //false
		System.out.println(Pattern.matches("[789][0-9]{9}","955258")); //false
		System.out.println(Pattern.matches("[789][0-9]{9}","9552581234455555")); //false
		
		//eg: 197-267-3345
		System.out.println(Pattern.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}","955-258-8761")); //true
		System.out.println(Pattern.matches("[0-9]{3}[-]{2}[0-9]{3}[-]{1}[0-9]{4}","955-258-8761")); //false
		System.out.println(Pattern.matches("[0-9]{3}[-]{2}[0-9]{3}[-]{1}[0-9]{4}","955--258-8761")); //true
		System.out.println(Pattern.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}","9535-258-8761")); //false
		System.out.println(Pattern.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}","953-2258-8761")); //false
		
		// Have 1 digit between uppercase alphabets towards left side lower case alphabets towwards right side
		// [A-Z]*[0-9][a-z]*
		System.out.println(Pattern.matches("[A-Z]*[0-9][a-z]*","CYBER5success")); //true
		System.out.println(Pattern.matches("[A-Z]*[0-9][a-z]*","CYBER55success")); //false
		System.out.println(Pattern.matches("[A-Z]*[0-9]+[a-z]*","CYBER55success")); //true
		
		
		// validation of an email
		//sonali789@gmail.com or monali@gmail.org or cybersuccess@gmail.edu
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}[gmail]*[\\.][com|org|edu]*","sonali123@gmail.com"));//true
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail\\.[com]*[org]*[edu]*","sonali123@gmail.gov")); //false
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail[\\.]{1}[com]*[org]*[edu]*","sonali123@gmail.org")); //true
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail\\.[com]*[org]*[edu]*","sonali123@gmail.edu")); //true
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail1\\.[com]*[org]*[edu]*","sonali123@gmail.org")); //false
	
	}
}
