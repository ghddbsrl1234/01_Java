package edu.kh.control.practice;

import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;

public class ConditionPractice {
	// ctrl + shift + f : 코드 자동 정렬
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String result; // 결과값(문자열)을 저장할 수 있는 변수 선언

		if(num <= 0) {
			System.out.println("양수만 입력해주세요"); // "result = "양수만 입력해주세요
		} else if(num % 2 == 0 ) {
			System.out.println("짝수입니다"); // result = "짝수 입니다";
		}else {
			System.out.println("홀수입니다"); // result = "홀수 입니다";
		}
		 // System.out.println(result);

	}

	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
				
		int sum = kor + math + eng; // 합계
		double avg = sum / 3.0; // 평균
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 :" + math );
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 :  %.1f\n" + avg);
			System.out.println("축하합니다, 합격입니다!" + kor);
		
		} else { System.out.println("불학겹입니다");
			
		}
			
		
		
		
		
		
		
	}

	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month +"월은 31일까지 있습니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println(month + "월은  30일까지 있습니다");
			break;
		case 2 : System.out.println(month + "월은 28일까지 있습니다");
			break;
		default : System.err.println(month + "잘못 입력하셨습니다");
	}
		
	}
	
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		// BMI = 몸무게 / (키 * 키)
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " +bmi);
		
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
				
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과체중";
		}else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		System.out.println(result);
		
	
	
	}
	
	public void practice5() {
		
		System.out.print("중간고사 점수 : ");
		double midTerm = sc.nextDouble();
		
		System.out.print("기말고사 점수 : ");
		double finalTerm = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextDouble();
		
		System.out.print("출석 점수 : ");
		double attendance = sc.nextDouble();
		
		//각각의 점수를 비율에 맞게 변경
		midTerm *= 0.2;
		// midTerm = midTerm * 0.2;
		finalTerm *= 0.3;
		report *= 0.3;
		
		System.out.println("====== 결과 ======");
		
		if( attendance <= 20 * 0.7) { // 출석 횟수 부족으로 인한 낙제
			
			System.out.println("Faill [출석 횟수 부족]( " +
							(int)attendance + "/20)");
			
		}else { // 출석 만족 시
			System.err.printf("중간 고사 점수(20) : %.1f\n", midTerm);
			System.err.printf("기말 고사 점수(30) : %.1f\n", finalTerm);
			System.err.printf("과제 점수(30) : %.1f\n", report);
			System.err.printf("출석 점수(20) : %.1f\n", attendance);
			
			double sum = midTerm + finalTerm + report + attendance;
			
			System.out.printf("총점 : %.1f\n " , sum);
			
			if(sum >= 70 ) {
				System.out.println("PASS");
			 	}else {
					System.out.println("Fail [ 점수 미달");
				}
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
