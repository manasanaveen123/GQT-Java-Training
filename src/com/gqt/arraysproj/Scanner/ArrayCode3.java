package com.gqt.arraysproj.Scanner;

import java.util.Scanner;

public class ArrayCode3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of schools: ");
		int scl=sc.nextInt();
		System.out.println("Enter the count of classes: ");
		int cls=sc.nextInt();
		System.out.println("Enter the count of students: "); int stu= sc.nextInt();
		int arr[][][] = new int[scl][cls][stu];
		//three dimensional array
		
		//Storing the marks
		for(int i=0; i<scl; i++) {
			System.out.println("Inside school "+(i+1));
			for(int j=0;j<cls; j++) {
				System.out.println("Inside class "+(j+1));
				for(int k=0;k<stu; k++) {
					System.out.println("Enter marks of student no: "+(k+1)); 
					arr[i][j][k]= sc.nextInt();
				}
			}
		}

		//Fetching the marks
		for(int i=0; i<scl; i++) {
			System.out.println("Inside school "+(i+1));
			for(int j=0;j<cls; j++) {
				System.out.println("Inside class "+(j+1));
				for(int k=0;k<stu; k++) {
					System.out.println("The marks of student no:"+(k+1)+" is:"+arr[i][j][k]); 
				}
			}
		}
	}
}
