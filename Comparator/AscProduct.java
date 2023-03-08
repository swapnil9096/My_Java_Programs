package Comparator;

import java.util.Comparator;

public class AscProduct implements Comparator<Product> {
	public int compare(Product x, Product y)
	{
		if (x.getName().compareTo(y.getName())==0)
			return 0;
		else if (x.getName().compareTo(y.getName())<=0)
			return -1;
		else
			return 1;
	}
}
