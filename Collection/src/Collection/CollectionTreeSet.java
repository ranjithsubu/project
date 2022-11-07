package Collection;

import java.util.TreeSet;

public class CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(40);
		ts.add(20);
		ts.add(10);
		ts.add(30);
		System.out.println(ts.size());
		for (Integer integer : ts) {
			System.out.println(integer);

		}
		

	}

}
