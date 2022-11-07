package Collection;

import java.util.ArrayList;

public class StringCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
		st.add("ranjith");
		st.add("subu");
		st.add("hii");
		System.out.println(st.size());
		for (String string : st) {
			System.out.println(string);
		}
		st.remove("subu");
		for (String string : st) {
			System.out.println(string);
			
		}

	}

}