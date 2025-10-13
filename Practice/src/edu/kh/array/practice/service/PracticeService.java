package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		int age = 25;
		System.out.println("나는 " + age + "살 입니다.");
	} 
	
	public void ex2() {
		int score = 90;
		System.out.println("최종 점수 : " + (score + 10));
	}
	
	public void ex3() {
		int a = 10;
		double b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public void ex4() {
		double pi = 3.14159;
		int a = (int)pi;
		System.out.printf("pi = %.2f, n = %d\n " , pi ,a);
	}
	public void ex5() {
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		System.out.print("멤버십 있으세요? (있으면 true/ 없으면 false : )");
		boolean isMember = sc.nextBoolean();
		
		double discount = isMember ? price * 0.10 : price * 0.05;
		double totalPrice = price - discount;
		
		System.out.println("할인가격 : " + discount);
		System.out.println("할인을 포함한 최종 가격 : " + totalPrice +"원");
	}
	
	public void ex6() {
		
		System.err.print("출금할 금 입력 : ");
		int amount = sc.nextInt();
		
		int fiftyTh = amount / 50000;
		amount %= 50000;
		
		int tenTh = amount /  10000;
		amount %= 10000;
		
		int fiveTh = amount / 5000;
		amount %= 5000;
		
		int oneTh = amount / 1000;
		
		System.out.println("50000원:" + fiftyTh);
		System.out.println("10000원:" + tenTh);
		System.out.println("5000원:" + fiveTh);
		System.out.println("1000원:" + oneTh);
		
	}
	
	public void ex7() {
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		String result = num1 % num2 == 0 ? "배수입니다." : "배수가 아닙니다.";
		
		System.out.println(result);
		
		
		
		
		
		
		
	}
	
	public void ex8() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String result;
		
		if(age <= 13 ) result = "어린이 입니다";
		else if(age <= 19) result = "청소년 입니다";
		else result = "성인 입니다";
			
		System.out.println(result);
	
	}
	
	public void ex9() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
		 for(int i = 1; i <= input ; i++ ) {
			 System.out.print(i + " ");
			
		 } if(input == 0) {
			 System.out.println("1 이상의 숫자를 입력해주세요.");
		 }
		
		
				
			
			
	}
	
	public void ex10() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			for(int i = input ; i >= 1; i--) {
				System.out.print(i + " ");
			} if(input == 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
	}
	
	
}