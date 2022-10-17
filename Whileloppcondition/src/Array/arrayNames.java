package Array;

import java.util.Scanner;

public class arrayNames {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp;
		String str[] = {"Ramesh","Suresh","Arasu","Vinoth"};
       		System.out.println("enter the length value");
       		for(int j = 0; j < str.length; j++) {
       			for(int i = j+1; i< str.length; i++) {
       				if(str[i].compareTo(str[j])<0) {
       						
       				temp = str[i];
       				str[i] = str[j];
       				str[j] = temp;      		}
       		}
       			System.out.println(str[j]);
       		}
}
}