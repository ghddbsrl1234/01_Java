package edu.kh.lunch;

public class Lunch {

	private String lunch;
	
	public Lunch() {}

	public Lunch(String lunch) {
		super();
		this.lunch = lunch;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	
	public void pilcklunch() {
		System.out.println("오늘 점심 당첨 : " + lunch);
	}


}
