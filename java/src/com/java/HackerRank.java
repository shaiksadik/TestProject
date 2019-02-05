package com.java;

import java.io.*;

import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank {



	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	            	System.out.println("The row :" +arr_i +"is and Column of" + arr_j +"is");
	                arr[arr_i][arr_j] = in.nextInt();
	                
	            }
	        }
	        
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	               
	                System.out.print(arr[arr_i][arr_j]+" ");
	            }
	            System.out.println();
	        }
	        
	        
	        int sum = 0;
	        int sum2 = 0;
	        int sum3 = 0;
	        int x = 0;
	        int max = Integer.MIN_VALUE;
	        for(int i = 0; i < 4; i++){
	            for(int j = 0; j < 4; j++){
	                for(int k = 0; k < 3; k++){
	                    sum += arr[i][j+k]; //top elements of hour glass
	                    sum2 += arr[i+2][j+k]; //bottom elements of hour glass
	                    sum3 = arr[i+1][j+1]; //middle elements of hour glass
	                    x = sum + sum2 + sum3; //add all elements of hour glass
	                }
	                if(max < x){
	                    max  = x;
	                }
	                sum = 0; 
	                sum2 = 0; 
	                sum3 = 0;
	                x = 0;
	            }            
	        }
	        System.out.println(max);
	    }
    
}


    

  

																					