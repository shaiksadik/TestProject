


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewOne {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Temp\\read_files\\File11.txt"));
		BufferedReader bf1 = new BufferedReader(new FileReader("C:\\\\Temp\\\\read_files\\File22.txt"));
		
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		String str1;
		String str2;
		String readline= null;
		int count1 =0;
		int count2=0;
			while((readline=bf.readLine()) != null) {
			count1++;
			if(readline.contains("DETAIL LIST 3.")) {
				break;
			}
			if(readline.length() >= 130) {
				if(count1>143) {
				    str1=readline.substring(15, 18);
				    //System.out.println(str1);
					str2=str1+readline.substring(22, 27);
					//System.out.println(str2);
					list1.add(str2);
					}
			}	
		}
		//System.out.println("File1 Records: \n"+list1);
		boolean flag = false;
		while ((readline = bf1.readLine()) != null) {
			if (readline.contains("DETAIL LIST 2.")) {
				flag = true;
			}
			if (flag) {
				if (readline.trim().length() > 100) {
					if (readline.trim().startsWith("DEP") || readline.trim().startsWith("Obs")) {
					} else {
						//System.out.println(readline.trim());
						str1=readline.substring(17,20);
						//System.out.println(str1);
						str2=str1+readline.substring(24, 29);
						//System.out.println(str2);
						list2.add(str2);
					}
				}
			}
			if (readline.contains("DETAIL LIST 3.")) {
				break;
			}
		}
			//System.out.println("File2 Records:\n "+list2);
		
		Collections.sort(list1);
		System.out.println(list1);
		Collections.sort(list2); 
		System.out.println(list2);
		list2.removeAll(list1);  
		
		System.out.println("The Missing Records are:\n"+list2); 

	}

}
