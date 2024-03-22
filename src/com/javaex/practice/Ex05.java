package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1= scanner.nextInt();
		int n2= scanner.nextInt();
		int n3= scanner.nextInt();
		int n4= scanner.nextInt();
		int n5= scanner.nextInt();
		
		int arr[]= {n1,n2,n3,n4,n5};
		float avg=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			avg=sum/5;
		}
		System.out.printf("평균은 %.1f입니다.",avg);
	}

}
