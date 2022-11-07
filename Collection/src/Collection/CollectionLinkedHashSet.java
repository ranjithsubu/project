package Collection;

import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(10);
		System.err.println(hs.size());
		for (Integer integer : hs) {
			System.out.println(integer);
			
		}



	}

}
