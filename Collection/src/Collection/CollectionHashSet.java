package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		System.out.println(hs.size());
		for (Integer integer : hs) {
			System.out.println(integer);
		}

	}
}
