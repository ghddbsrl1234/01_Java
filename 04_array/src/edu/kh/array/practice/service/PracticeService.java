package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService { // 배열 실습
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
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();

		}

	}

	public void ex5() {

		System.out.print("문자열 : ");
		String input = sc.next();
		System.out.println("문자 : ");

		String[] arr = new String[input.length()];
		{

		}

	}

	public void ex6() {
		System.out.println("정수 : ");
		int input = sc.nextInt();

		int arr[] = { 4, -4, 3, -3, 2 };
		System.out.println(arr);

	}

	public void ex7() {

		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();

		char arr[] = new char[input.length()];
		// 입력받은 문자열의 길이만큼 char 배열 할당

		for (int i = 0; i < arr.length; i++) {

			if (i <= 7) { // 7번 인덱스 이하 (생연월일, -, 성별)
				arr[i] = input.charAt(i);
			} else { // 8번 인덱스 이상
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}

	}

	public void ex8() {

		while (true) {
			// 3이상의 수가 입력될 때까지 무한반복
			// -> 3이상 홀수가 입력되면 원하는 코드 수행 후
			// break 문으로 종료 예정
			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) { // -> 반복
				System.out.print("다시 입력하세요!");

			} else {
				// 입력받은 정수 만큼의 크기를 갖는 배열 생성
				int arr[] = new int[input];

				int num = 0; // arr배열에 대입될 값

				for (int i = 0; i < arr.length; i++) {

					// 요소에 값 대입하기
					if (i <= arr.length / 2) { // 중간까지 -> 증가
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}
					// 각 요소에 대입된 값 출력하기
					// 출력 시 , 추가 (단, 마지막 제외)
					if (i == arr.length - 1) { // 마지막 바퀴
						System.out.print(arr[i]);

					} else {
						System.out.print(arr[i] + " , ");
					}
				}
				break;

			}

		}

	}

	public void ex9() {

	}

	public void ex10() {
		int arr[] = new int[10];

		System.out.print("발생한 난수 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

		System.out.println(); // 줄바꿈

		int max = 1; // 최대값을 담아줄 변수
		int min = 10; // 최소값을 담아줄 변수

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) { // 해당 인덱스 값이 max 값보다 큰 경우
				max = arr[i];
			}

			if (arr[i] < min) { // 해당 인덱스 값이 min 값보다 작은 경우
				min = arr[i];
			}

		}

		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);

	}

	public void ex11() {

	}

	public void ex12() {
		// 로또 번호 뽑기
		// 크기가 6인 정수형 배열 선언 및 할당
		int lotto[] = new int[6];

		// 배열에 중복값없이 1부터 45 사이의 난수 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) { // 중복 제거
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}

			}

		}

		Arrays.sort(lotto); // 오름차순 정렬

		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");

		}

	}

	public void ex13() {

	}

	public void ex14() {

		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();

		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

		String arr[] = new String[size];

		// 2. 첫 배열에 저장할 문자열 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		// 3. 반복이 시작되는 구간부터 while 작서하여
		// 내부에 종료조건 만들어 break 이용하여 멈춤
		while (true) {

			System.out.print("더 값을입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);

			// 4. 값을 더 입력할 경우
			if (ch == 'y' || ch == 'Y') {

				// 5. 더 입력받을 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거

				// 6. 새로 값을 입력받을 배열 생성
				// --> 기존 배열 크기 + 추가 입력 갯수
				String[] newArr = new String[arr.length + addSize];

				// 7. 배열 복사 + 새로운 문자열 입력받기
				for (int i = 0; i < newArr.length; i++) {

					if (i < arr.length) { // 인덱스의 값이 기존 배열보다 작을 경우 ( 깊은복사)
						newArr[i] = arr[i];

					} else { // 인덱스의 값이 기존 배열보다 클 경우(새로운값 입력받기)
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				// 8. 기존 배열 공간을 참조하던 변수 arr에
				// 새로운 배열 공간의 주소를 가진 newArr 대입(얕은 복사)
				arr = newArr;

			} else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break;

			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요!!!");
				
			}

		} // wjhile 문 끝

		//9. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
	}

}
