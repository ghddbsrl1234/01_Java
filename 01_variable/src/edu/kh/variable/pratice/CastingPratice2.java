package edu.kh.variable.pratice;

public class CastingPratice2 {

	public static void main(String[] args) {
		// 문제 1
		int age = 25;
		System.out.println("나는" + age + "살입니다.");
		
		//문제 2
		int score = 90;
		score = score + 10;
		// score += 10; 으로도 표현 가능
		System.out.println("최종 점수 : " + score);
		
		//문제 3
		int a = 10;
		double b = a;
		System.out.println("a=" + a);
		System.out.println("b =" + b);
		
		//문제 4
		double pi = 3.14159;
		int num = (int)pi;
		System.out.printf("pi = %.2f, num = %d\n" , pi, num);
		// num = %d\n은 \n은 다음 문제 콘솔에 printf 인하여 
		//개행이되지않기때문에 미리 해준다.
		
		//문제5
		char ch  = 'A';
		int code = ch; // 자동형변환 char -> int
		System.out.printf("문자: %c , 코드값: %d\n" , ch , code  );
		
		//문제 6
		final int PRICE = 5000;
		int count = 3;
		int total = PRICE * count;
		System.out.printf("물건가격: %d원, 개수: %d개, 총액: %d원\n",
								PRICE,	count,		total);
		
		//문제 7 
		int kor = 95, eng = 87, math = 90;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", kor, eng, math);
		System.out.printf("총점: %d, 평균: %2f\n", sum, avg );
		
		
		//응용문제 1
		
		String name = "영숙";
		int age2 = 28;
		double height = 165.7;
		//응용문제 2,3,4,5에 모두 대입하여 사용하는 변수들.
		
		//응용문제 2
		System.out.printf("출연자 이름: %s\n", name);
		System.out.printf("나이: %d세\n", age2);
		System.out.printf("키: %.1fcm\n", height);
		
		System.out.printf("출연자 이름: %s\n,나이: %d세\n,키: %.1fcm\n "
							,name , age2 , height);
		
		//응용문제 3
		
		double doubleage = age2; // 자동형변화
		System.out.println("자동형변환된 나이:" + doubleage);
		
		//응용문제 4
		int intheight = (int)height; // double -> int 강제형변화
		System.out.println("강제 형변환된 키(int): " + intheight);
		
		//응용문제 5
		int score1 = 87, score2 = 92;
		double avgScore = (score1 + score2) /2.0;
		System.out.printf("%s님의 매칭 점수 평균은 %.1f점입니다!", 
							name,		avgScore);
		
		
		
				
		
		
		
		
		
		
		
		
	}

}
