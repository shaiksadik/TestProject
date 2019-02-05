package com.java;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		// char[] arr;
	  String s = "people are friendly in hyderabad";		
	  String [] s3 = s.split("\\s");
	  int i; 
	  int j;
	  int count=0;
	
	  for (i = 0; i < s3.length; i++) {
	 char[] arr = s3[i].toCharArray();
	 //System.out.println(arr);
	 
	 for(j=0;j<arr.length;j++) {
		 if(arr[j] == 'a' || arr[j] == 'i' || arr[j] == 'e' || arr[j] == 'o' || arr[j] == 'u') {
			 j++;
			 j++;
			 if(arr[j] == 'a' || arr[j] == 'i' || arr[j] == 'e' || arr[j] == 'o' || arr[j] == 'u') {
				 count++;
				 System.out.println(s3[i]+"("+count+")");
			 }
		 }
	 }
	  }
	 
	    	
	    	
	    
	    
	}

	}


