package read_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("shaik.txt"));
		BufferedReader bf2 = new BufferedReader(new FileReader("sadik.txt"));
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		String readline;
		String str1;
		String str2;
		
		int c = 0;
		while((readline=bf.readLine()) != null) {
			/*if(c > 286) {
				System.out.println(readline);
				//c++;
				System.out.println(readline.substring(25, 30));
			}
			c++;*/
			str1=readline.substring(17, 21); // Flight Num
			str2=str1+readline.substring(25, 30); // Concatinating the two strings
			list1.add(str2);
		}
		System.out.println("The file-1 data is:\n"+list1);
		while ((readline = bf2.readLine()) != null) {
			str1 = readline.substring(15, 19); // Flight Num
			str2 = str1 + readline.substring(23, 28); // Concatinating the two strings
			list2.add(str2);

		}
		System.out.println("The file-2 data is:\n"+list2);
		Collections.sort(list1); // Sorting the records
		Collections.sort(list2); 
		list1.removeAll(list2);  // Removing common records
		
		System.out.println("The Missing Records are:\n"+list1); //printing the missing records

	}

}
