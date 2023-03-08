package Inheritance;

public class Manager extends Emp {

	int totalSubOrdinate;

	void doMgrActivities()
	{
		super.doMgrActivities();
		System.out.println("Manager=> doing managerial activities");
	}
}
