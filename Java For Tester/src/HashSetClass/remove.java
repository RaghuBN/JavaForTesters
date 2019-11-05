package HashSetClass;

import java.util.HashSet;
import java.util.Set;

public class remove {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);

		System.out.println("numbers : " + numbers);
		boolean isRemoved = numbers.remove(10);
		System.out.println("After remove(10) => " + numbers);		
	}
}
