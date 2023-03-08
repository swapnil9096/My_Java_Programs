package DATE;

public class StringBufferBuilderDemo {

	public static void main(String[] args) {
		/*StringBuffer class is used to create mutable (modifiable) string. 
		 * The StringBuffer class in java is same as String class except it is mutable 
		 * i.e. it can be changed.
		 */
//Thread Safe
		
		  Object obj= new Object(); 
		  System.out.println(obj.getClass().getSimpleName());
		  System.out.println(obj.getClass().getName()); System.exit(0);
		 
		System.exit(0);
		StringBuffer sb = new StringBuffer("Pune");
		System.out.println("className: " + sb.getClass().getName());	 
		sb.append(" Mumbai");
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.insert(1, "oo");
		System.out.println(sb);
	
		StringBuffer sb1 = new StringBuffer("Hello"); 
	     sb1.replace(1,3,"Java"); //replaces 1 and 2 excluding 3 last index
         System.out.println(sb1);
         sb1.delete(1,3); ///exclude 3
         System.out.println(sb1);	

		System.out.println(sb1.reverse());
		
		StringBuffer s = new StringBuffer();
		System.out.println("s : " + s);
	
		s.append("New String");
		System.out.println(s);
		
		System.out.println("s.charAt(0)=>"+s.charAt(0));
		System.out.println("s.indexOf(\"S\")=>"+ s.indexOf("S"));
        System.exit(0);
		//StringBuilder Not thread safe
        
        
        
		StringBuilder sbld1 = new StringBuilder();
		sbld1.append("Java");
		System.out.println(sbld1);
		System.out.println(sbld1.toString());
		
		StringBuilder sbld2 = new StringBuilder(10);
		sbld2.append("Hello");
		System.out.println(sbld2);
		System.out.println(sbld2.toString());
		System.out.println("sbld2.capacity()=>"+ sbld2.capacity()); //default is 16 characters
		
 /*
 0. Java.lang.StringBuffer extends Object class.
1.  Serializable, Appendable, CharSequence interfaces implements StringBuffer.
3. String buffers are safe for use by multiple threads. 
 4. It inherits some of the methods from the Object class which such as 
     clone(), equals(), finalize(), getClass(), hashCode(), notifies(), notifyAll().
  */
		
	}

}
