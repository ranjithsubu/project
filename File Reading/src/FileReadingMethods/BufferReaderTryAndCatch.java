package FileReadingMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTryAndCatch {

	public static void main(String[] args) throws IOException {

		int count = 0;
		FileReader file = null;
		BufferedReader br = null;
		try {

			file = new FileReader("E:\\\\apj missile man.txt");
			br = new BufferedReader(file);
			String eachline;
			while ((eachline = br.readLine()) != null) {
				String array[] = eachline.split(" ");
				for (int i = 0; i < array.length; i++) {
					if (array[i].equalsIgnoreCase("kalam")) {
						count++;
						System.out.println(count);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(null != file)
			{
				br.close();
			}
			
		}

	}
}
