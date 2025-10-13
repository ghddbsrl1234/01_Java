package hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


import hw2.model.dto.Animal;


public class  Zoo  {
	
	 private List<Animal> animals  = new ArrayList<>();
	 
	 public Zoo() {}
	 

	public void addAnimall(Animal animal) {
		animals.add(animal);
		
	}
	
	public void showAnimall() {
		System.out.println("동물들의 울음소리를 들어보세요:");
		for(Animal animals : animals) {
			animals.sound();
		}
	}
	
	public void displayMenu () {
	
		Scanner sc = new Scanner(System.in);
			
		int menuNum = 2;
		
		
		try {
			
			do {
				System.out.println("\n=======KH 동물원=======");
				System.out.println("원하는 작업을 선택하세요 : ");
				System.out.println("1. 동물들의 울음소리 듣기");
				System.out.println("2. 종료");
				System.out.print("선택 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : showAnimall(); break;
				case 2 : System.out.println("프로그램을 종료합니다."); break;
				} 

			} while(menuNum != 2);
						
		} catch (InputMismatchException e) {
			System.out.println("1,2만 입력해주세요");
		}
		

	
	
	}
	
	
}
