package Collection;

import java.util.ArrayList;

public class CollectionArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);

		for (Integer integer : al) {
			System.out.println(integer);
		}

	}

}
