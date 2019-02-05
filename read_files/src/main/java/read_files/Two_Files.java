package read_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Two_Files {

	public static void main(String[] args) throws IOException {
		/*
		BufferedReader bf1 = new BufferedReader(new FileReader("VMC190102.rtf"));
		
		BufferedReader bf2 = new BufferedReader(new FileReader("Z0037.VMCRPT.GIL.D2019.D0102.txt"));*/
		
		BufferedReader bf3 = new BufferedReader(new FileReader("sadik.txt"));
		
		BufferedReader bf4 = new BufferedReader(new FileReader("shaik.txt"));
		
		String readline ;
		
		String line1 = bf3.readLine();
		String line2 = bf4.readLine();
		
		boolean areEqual = true;
		
		int lineNum = 1;
		int count=0;
		
		while(line1 != null || line2 != null){
			
			if(line1 == null || line2 == null) {
				
				areEqual = false;
				count++;
				break;
			}
			else if(! line1.equalsIgnoreCase(line2)) {
				areEqual= false;
				break;
			}
			line1= bf3.readLine();
			line2= bf4.readLine();
			lineNum++;
		}
		
		if(areEqual) {
			System.out.println("Two files are having same content");
		}
			else
			{
				System.out.println("Two files have different content. They are different at line"+lineNum);
				
				System.out.println("File one has"+line1+"and File two has"+line2+"at line "+lineNum);
				
				System.out.println("\n"+count);
			}
		
		bf3.close();
		bf4.close();
		/*while((readline = bf4.readLine())  != null)
		System.out.println(readline);*/
		}

	}


