package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		int arr[] = new int[9];
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			System.out.print(i + " ");

		}

		System.out.printf("\n짝수 번째 인덱스 합 : " + "%d", sum);

	}

	public void ex2() {
		int arr[] = new int[9];
		int sum = 0;
		for (int i = 9; i < arr.length; i--) {
			System.out.println(i + " ");

		}
		System.out.printf("홀수 번째 인덱스 합 :  %d");

	}

	public void ex3() {
		int arr[] = new int[6];

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + " ");

		}

	}

	public void ex4() {
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
		}
			System.out.print("검색할 값 : ");
			int num = sc.nextInt();
			
		
	}	
		
	public void ex5() {
		System.out.print("문자열 : ");
		String input = sc.next();
		String [] arr = new String [input.length()];
		
		for(int i = 0; arr.equals(input); i++) {
			
		}
		
	
		
	
		
	}		
	
	
		

}
