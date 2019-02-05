package read_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.sun.org.apache.bcel.internal.classfile.LineNumber;

public class TaskUsingSet {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf1 = new BufferedReader(new FileReader("File11.txt"));
		BufferedReader bf2 = new BufferedReader(new FileReader("File22.txt"));
		
		Set s1 = new HashSet<>();
		Set s2 = new HashSet<>();
		String readline;
		String str1;
		String str2;
		
		int c = 0;
		while((readline=bf1.readLine()) != null) {
			str1=!readline.isEmpty()?readline.substring(16, 19):""; // Flight Num
			//str2=str1+readline.substring(112, 117); // Concatinating the two strings
			s1.add(str1);
		}
		System.out.println("The file-1 data is:\n"+s1);
		while ((readline = bf2.readLine()) != null) {
			str2 = !readline.isEmpty()?readline.substring(18, 21):""; // Flight Num
			//str2 = str1 + readline.substring(110, 115); // Concatinating the two strings
			s2.add(str2);

		}
		System.out.println("The file-2 data is:\n"+s2);
		
		s1.removeAll(s2);  // Removing common records
		
		System.out.println("The Missing Records are:\n"+s1); //printing the missing records
		}

}
