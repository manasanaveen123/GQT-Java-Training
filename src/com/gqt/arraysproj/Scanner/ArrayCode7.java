package com.gqt.arraysproj.Scanner;

import java.util.Scanner;

public class ArrayCode7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of Universities: ");
		int uni=sc.nextInt();
		System.out.println("Enter the count of Colleges: "); 
		int clg= sc.nextInt();
		System.out.println("Enter the count of Classrooms: ");
		int cls=sc.nextInt();
		System.out.println("Enter the count of Students: ");
		int stu=sc.nextInt();
		int arr[][][][] = new int[uni][clg][cls][stu];
		
		//storing the marks
		for(int i=0; i<uni; i++) {
			System.out.println("Inside University:"+(i+1));
			for(int j=0;j<clg;j++) {
				System.out.println("Inside College:"+(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("Inside Classroom:"+(k+1));
					for(int l=0;l<stu;l++) {
							System.out.println("Enter marks of student no: "+(l+1)); 
							arr[i][j][k][l]= sc.nextInt();
					}
				}
			}
		}
		
		//fetching the marks 
		for(int i=0; i<uni; i++) {
			System.out.println("Inside University:"+(i+1));
			for(int j=0; j<clg; j++) {
				System.out.println("Inside College:"+(j+1));
				for(int k=0; k<cls; k++) {
					System.out.println("Inside classroom:"+(k+1));
					for(int l=0; l<stu; l++) {
						System.out.println("The marks of student no:"+(l+1)+"is "+arr[i][j][k][l]);	
					}
				}
			}
		}
	}
}

