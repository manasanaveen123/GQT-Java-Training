package com.gqt.arraysproj.Scanner;

import java.util.Scanner;

public class ArrayCode4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of universities: ");
		int uni=sc.nextInt();
		System.out.println("Enter the count of schools: ");
		int scl=sc.nextInt();
		System.out.println("Enter the count of classes: ");
		int cls=sc.nextInt();
		System.out.println("Enter the count of students: "); int stu= sc.nextInt();
		int arr[][][][] = new int[uni][scl][cls][stu];
		//four dimensional array
		
		//Storing the marks
		for(int i=0; i<uni; i++) {
			System.out.println("Inside university "+(i+1));
			for(int j=0;j<scl; j++) {
				System.out.println("Inside school "+(j+1));
				for(int k=0;k<cls; k++) {
					System.out.println("Inside class "+(j+1));
					for(int l=0;l<stu; l++) {
						System.out.println("Enter marks of student no: "+(l+1)); 
						arr[i][j][k][l]= sc.nextInt();
					}
				}
			}
		}

		//Fetching the marks
		for(int i=0; i<uni; i++) {
			System.out.println("Inside university "+(i+1));
			for(int j=0;j<scl; j++) {
				System.out.println("Inside school "+(j+1));
				for(int k=0;k<cls; k++) {
					System.out.println("Inside class "+(k+1));
					for(int l=0;l<stu; l++) {
						System.out.println("The marks of student no:"+(l+1)+" is:"+arr[i][j][k][l]); 
					}
				}
			}
		}
	}
}