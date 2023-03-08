package Inheritance;

public class Runner1 {
	public static void main(String[] args) {

		Manager mgr = new Manager();
		mgr.doEmpWork();
		mgr.doMgrActivities();
		Emp obj = new Manager();// Top casting/up casting/polygraphic reference
		// Parent child
		// we are creating an object of Manager class of type EMP
		obj.doMgrActivities();
		// interface/parent /child class
		// obj.doAccounting();
		obj.Dept = "Purchase";// Emp Parent
		obj.id = 100; // Emp Parent
		obj.salary = 120000; // Emp parent
		obj.name = "Swapnil"; // Emp parent
		obj.doEmpWork(); // Emp Parent
		obj.doMgrActivities(); // Manager-child

		Emp obj1 = new Accountant();// top casting

		obj1.doAccounting();//
		mgr.doAccounting();//
		obj.doAccounting();//

		Emp obj2 = new Engineer();
		obj2.doEngineering();
		obj.doEngineering();

	}
}
