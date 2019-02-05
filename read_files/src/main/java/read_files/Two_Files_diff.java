package read_files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Two_Files_diff {

	public static int count1 = 0;
	 public static int count2=0;
	 public static int readchars=0;
	 public static int count=0;
	public static void main(String[] args) throws IOException {
		String filename = "shaik.txt";
		String filename2 = "sadik.txt";
		

		BufferedReader bf3 = new BufferedReader(new FileReader(filename));
		
		BufferedReader bf4 = new BufferedReader(new FileReader(filename2));
		
		String readline;
		countLine(filename);
		countLine2(filename2);
		
		
		
		if(count1 == count2) {
			
			System.out.println("All the records are same, there is no missing records here.");
			
		}
		else {
			count = count1-count2;
			System.out.println("There are totally "+count+ " records are missing.");
			/*while((readline = bf3.readLine()) != null)
				System.out.println(readline);*/
		}

	}

	private static int countLine2(String filename2) throws IOException {
InputStream is = new BufferedInputStream(new FileInputStream(filename2));
		
		try {
			byte[] c = new byte[1024];
			//int count=0;
			int readchars=0;
			boolean empty = true;
			while((readchars=is.read(c)) != -1) {
				empty = false;
				for(int i=0; i<readchars;i++) {
					if(c[i]=='\n') {
						count2++;;
					}
				}
			}
			System.out.println("List1:"+count2);
		}finally {
			is.close();
		}
		return 0;
		
		
	}

	private static int countLine(String filename) throws IOException {
InputStream is = new BufferedInputStream(new FileInputStream(filename));
		
		try {
			byte[] c = new byte[1024];
			/*int count=0;
			int readchars=0;*/
			boolean empty = true;
			while((readchars=is.read(c)) != -1) {
				empty = false;
				for(int i=0; i<readchars;i++) {
					if(c[i]=='\n') {
						count1++;;
					}
				}
			}
			System.out.println("List2:"+count1);
		}finally {
			is.close();
		}
		return 0;
		
		
	}

}
