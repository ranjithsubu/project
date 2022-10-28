package Class;

public class CholcateCounter {
	public static int NumberOfChoclate(int rupees, int cost, int wrapper) {
		int choclate, wrappers;
		choclate = rupees / cost;
		wrappers = choclate;

		while (wrappers >= wrapper) {
			int extrachoclate = wrappers / wrapper;
			choclate = extrachoclate + choclate;
			int extrawrapper = wrappers % wrapper;
			wrappers = extrawrapper + extrachoclate;

		}
		return choclate;

	}

	public static void main(String[] args) {
		System.out.println(NumberOfChoclate(100, 3, 3));

	}
}
