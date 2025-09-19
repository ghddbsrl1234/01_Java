package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 
		//	그 숫자까지의 숫자들을 모두 출력하세요.
		//	단, 입력한 수는 1보다 크거나 같아야 합니다.
		//	만일 1 미만의 숫자가 입력됐다면 
		//	“1 이상의 숫자를 입력해주세요“를 출력하세요.
		
			System.out.print("1 이상의 숫자를 입력하시오 : ");
			int input = sc.nextInt();
			
			if(input >= 1) { // 조건 O
				
				// 1부터 input 까지 1씩 증가 반복 출력
				for(int i = 1; i <= input; i++) {
					System.out.print(i + " ");
				}
				
			} else { // 조건 X
				System.out.println("1이상의 숫자만 입력해주세요");
				
			}
				
		}
	
	public void practice2() {
		// 사용자로부터 한 개의 값을 입력 받아 
		// 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
			
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input >= 1) {
				// input = 5
				// 5 4 3 2 1 
				// 시작 5부터, 끝 1, 1씩 감소하면서...
				for(int i = input; i >= 1; i-- ) {
					System.out.print(i + " ");
					// 5 4 3 2 1 
				}
				
			} else {
				System.out.println("1 이상의 숫자만 입력하세요");
			}
		
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		String result = "";
		int sum = 0;
		
		for(int i = 1; i <= input; i++ ) {
			sum += i; // 합계
			
			if(i == input) {
				result += i;
			} else {
				result += i + " + ";
			}
		}
		System.out.printf("%s = %d", result, sum);	
		
		
		
		
	}
	
	public void practice4() { 

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("첫 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 <1) {
			System.out.println("1 이상의 숫자만 입력하세요!");
		
		} else { //정상인 경우
			
			//일단 statr에 첫번째 숫자, end에 두번째 숫자 대입
			int start = num1;
			int end = num2;
			
			
			//만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			
		}
	
		
		
	}

	public void practice5() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		
		System.out.println("===== " + dan +"단 =====");
		for(int i = 1; i <=9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
				
			
		}
	
	public void practice6() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) { // 2~9 벗어난 경우
			System.out.println("2~9 숫자만 입력하세요");
			
		}else { // 2~9 사이 정상범위 경우
			
			for(int dan = input; dan <= 0; dan++) {
				System.out.println("======" + dan + "단 =====");
				
				for(int i =1; i <= 9; i++) { //곱해지는 수
					System.out.printf("%d X %d = %d\n" , dan, i, dan * i );
				}
			}
		}
		
		
	}
		
	public void practice7() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0; // 갯수세기용
		
		for(int i = 1; i <= input; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i % 2 == 0 || i % 3 ==0) {
			
				System.out.print(i + " ");
				
			// 2와 3의 공배수 == 2로도 나누어 떨어지고,
			// 3으로도 나누어 떨어진다
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
			 
		}
		
	
	}
		System.out.println("\ncount : " + count);
		
	}
	
	
		
	
		
	}


