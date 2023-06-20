package projects.partone;

import java.util.ArrayList;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int x = 1; x <= 10; x++) {
			numbers.add((int)Math.pow(2, x));
		}
		
		for(int y = 0; y < 10; y++) {
			System.out.println(numbers.get(y));
		}
	}

}
