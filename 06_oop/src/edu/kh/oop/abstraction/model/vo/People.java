package edu.kh.oop.abstraction.model.vo;

// model : 프로그램 로직과 관련되어있는 데이터를 저장하는 용도
// + 비즈니스 로직
// VO(Value Object) 
// : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

public class People { // 국민(사람) 클래스
	
	// 클래스란? 객체의 특성( 속성과 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값을 저장하기 위한  변수 선언
	// -> 국민이라면 공통적으로 가지고있는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이
	// 필드 == 필드변수 == 멤버변수
	
	// [접근제한자] 자료형 변수명;
	public String name; // 이름 
	public char gender; // 성별
	public String pNo; // 주민등록번호 " 123456=1234567"
	public String address; // 주소
	public String phone; // 전화번호 " 010=1234=1234"
	public int age; // 나이
	// public double bitcoin; // 모든 국민이 가진 공통점이 아니므로 제거(추상화)
	
	// 캡슐화
	
	
	// 기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다...");
	}

	public void vote() {
		System.out.println("투표를 합니다...");
	}
	
	
	
	
	
	
	

}
