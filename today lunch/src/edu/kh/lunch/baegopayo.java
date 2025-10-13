package edu.kh.lunch;

import java.util.ArrayList;
import java.util.List;

public class baegopayo {

	public static void main(String[] args) {
		
		List<Lunch> lunch = new ArrayList<Lunch>();

		lunch.add(new Lunch("까스"));
		lunch.add(new Lunch("햄버거"));
		lunch.add(new Lunch("백반"));
		lunch.add(new Lunch("중국집"));
		
		int randomIndex = (int) (Math.random() * lunch.size());

		Lunch leader = lunch.get(randomIndex);

		leader.pilcklunch();
		
		
	}

}
