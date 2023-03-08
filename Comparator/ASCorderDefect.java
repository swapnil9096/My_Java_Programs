package Comparator;

import java.util.Comparator;

public class ASCorderDefect implements Comparator<Defect> {

	public int compare(Defect a1, Defect a2) {
		if (a1.getId() == a2.getId())
			return 0;
		else if (a1.getId() < a2.getId())
			return -1;
		else
			return 1;
		/*
		 * if (a1.getName().compareTo(a2.getName()) == 0) return 0; else if
		 * (a1.getName().compareTo(a2.getName()) < 0) return -1; else return 1;
		 */
	}

}
