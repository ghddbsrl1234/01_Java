package co.hw1.model.vo;

public class Employee {
	
	private int empNO;
	private String empName;
	private String debt;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	public Employee () {
		
	}
	
	
	
	
	public Employee(int empNO, String empName, int age, char gender, String phone, String address) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	public Employee(int empNO, String empName, String debt, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.debt = debt;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}


	public int getEmpNO() {
		return empNO;
	}
	
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDebt() {
		return debt;
	}
	public void setDebt(String debt) {
		this.debt = debt;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String information() {
		return empNO + "," + empName + "," + debt +  "," + job +  "," + age
				+ "," + gender + "," + salary + "," + bonusPoint + "," + phone
				+ "," + address;
	}

	

	






}
