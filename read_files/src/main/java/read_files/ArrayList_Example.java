package read_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("sadik.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("shaik.txt"));
		//Scanner s = new Scanner(new File("sadik.txt"));
		
		ArrayList<String> list = new ArrayList<>();
		/*while(s.hasNext()){
			list.add(s.next());
		}*/
		
		String line;
		while((line= br.readLine()) != null) {
			String s=line.substring(25, 29);
			list.add(s);
			System.out.println(s);
		}
		br.close();
		//s.close();
	}

}
