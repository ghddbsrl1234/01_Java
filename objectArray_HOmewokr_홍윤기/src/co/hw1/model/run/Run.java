package co.hw1.model.run;

import co.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee empArr[] = new Employee[3];
		
			
		 empArr[0] = new Employee();
		 empArr[1] = new Employee(1,"홍길동",19,'M',"01011112222","서울 마곡");
		 empArr[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		 
		
		 for(int i = 0; i < empArr.length; i++) {
			
			 System.out.println("empArr[" + i +"]:" +empArr[i].information());
		 }
		 	
		 	System.out.println("=============================================");
		 
		 	empArr[0] = new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
		 	empArr[1] = new Employee(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
		 
		 	System.out.println("empArr[0] : "+ empArr[0].information() + "\n" + "empArr[1] : " + empArr[1].information());
	
		 }
	}

	
	
	
	
	

