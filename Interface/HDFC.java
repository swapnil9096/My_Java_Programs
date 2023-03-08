package Interface;

public class HDFC implements RBI, UTI {

	@Override
	public void print() {
		System.out.println("In print....");
	}

	@Override
	public void show() {
		System.out.println("in show....");
	}

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.bangad();
		hdfc.show();
		hdfc.print();
		
		
		
	}	
}
