package Enum;//To change ordinal value we can assign them in enum only

public class EnumDemo2 {

	enum seasons {
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);

		private int value;
		// private is the default constructor for enum

		seasons(int value) {
			this.value = value;
		}

		public static void main(String[] args) {
			for (seasons s : seasons.values()) {
				System.out.println(s + " " + s.value);
			}
		}

	}

}
