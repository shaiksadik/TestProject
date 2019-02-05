package read_files;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class LineByLine {

	public static void main(String[] args) {
		
		readFromFile("File11.txt");

	}

	private static void readFromFile(String filename) {
		LineNumberReader lineNum = null;
		
		try {
			
			lineNum = new LineNumberReader(new FileReader(filename));
			
			System.out.println("Line:"+lineNum.getLineNumber());
			
			lineNum.setLineNumber(176);
			
			System.out.println("Line:"+lineNum.getLineNumber());
			
			String line= null;
			//String str1= null;
			ArrayList<String> str1 = new ArrayList<>();
			
			while((line = lineNum.readLine()) != null) {
				System.out.println("Line:"+lineNum.getLineNumber()+ ": "+line);
				//str1=line.substring(23, 28);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(lineNum != null) {
					lineNum.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
