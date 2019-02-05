package com.java;

import java.util.Scanner;

public class Rotate_Left {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int data[]= new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			 data[i] = sc.nextInt();
		}
		int x=2;// how many values you want to rotate in right side
		
		//int data[] = {1,2,3,4,5,6,7};
		int [] result =new int[data.length];
		
		for(int i=0;i<data.length;i++) {
			//result[(i+(data.length-2))%data.length]=data[i]; // for left rotate
			result[(i+x)%data.length]=data[i];                 // for right rotate
		}
		for(int i:result) {
			System.out.print(i+" ");
		}

	}

}
