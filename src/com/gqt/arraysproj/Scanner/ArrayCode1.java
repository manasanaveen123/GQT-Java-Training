package com.gqt.arraysproj.Scanner;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Students:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of Students no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("#####---------Marks added----------#####");
		for(int i=0;i<=n-1;i++) {
			System.out.println("The marks of Student no"+(i+1)+" is="+arr[i]);
		}
	}
}
