package Collection;

import java.util.ArrayList;
import java.util.List;

public class elementsIsPresent {

	public static void main(String[] args) {
		elementsIsPresent obj = new elementsIsPresent();

		obj.isPresent();
	}

	void isPresent() {

		List<Integer> al1 = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));
		List<Integer> al2 = new ArrayList<>(List.of(20, 40, 50, 33));

		System.out.println("al1 : " + al1);
		System.out.println("al2 : " + al2);

		for (int i = 0; i < al1.size(); i++) {

			for (int j = 0; j < al2.size(); j++) 
			{
				if (al1.get(i) == al2.get(j)) {

					System.out.println("Element is present=> " + al1.get(i));

				}

			}
		}

	}
}
