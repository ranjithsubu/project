package Collection;

import java.util.LinkedList;

public class CollectionlinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll.size());
		for (Integer integer : ll) {
			System.out.println(integer);

		}
		ll.remove((Integer)10);
		System.out.println(ll.size());
		for (Integer integer : ll) {
			System.out.println(integer);

		}

	}

}
