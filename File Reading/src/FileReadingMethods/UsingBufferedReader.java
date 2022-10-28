package FileReadingMethods;

import java.io.BufferedReader;
import java.io.FileReader;

public class UsingBufferedReader {
	public static String textReader(String fileName, String findName) throws Throwable {

		FileReader file = new FileReader(fileName);
		BufferedReader br = new BufferedReader(file);
		String eachLine;
		int count = 0;
		while ((eachLine = br.readLine()) != null) {
			String array[] = eachLine.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(findName)) {
					count++;
				}
			}
		}
		file.close();
		br.close();
		String ans = Integer.toString(count);
		return ans;
	}

	public static void main(String[] args) throws Throwable {
		System.out.println(textReader("E:\\apj.txt", "1931"));
	}

}