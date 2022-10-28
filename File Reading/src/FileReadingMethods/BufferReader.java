
package FileReadingMethods;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
	public static int textreader(String filename,String findname)throws Throwable{
		FileReader file = new FileReader(filename);
		BufferedReader br = new BufferedReader(file);
		String eachline;
		int count = 0;
		while((eachline = br.readLine())!=null) {
			String array [] = eachline .split (" ");
			for(int i = 0;i<array.length;i++) {
				if (array[i].equalsIgnoreCase(findname)) {
					count++;
				}
			}
		}
		
		file.close();
		br.close();
		return count;
	}

    public static void main(String[]args)throws Throwable {
    	System.out.println(textreader("E:\\apj missile man.txt","kalam"));
    }
	
}
