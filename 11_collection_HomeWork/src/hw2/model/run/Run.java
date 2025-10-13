package hw2.model.run;

import hw2.model.dto.Animal;
import hw2.model.dto.Monkey;
import hw2.model.dto.Tiger;
import hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
	Zoo zoo = new Zoo();
	
	Animal t = new Tiger("호랑이");
	Animal m = new Monkey("원숭이");
	
	zoo.addAnimall(t);
	zoo.addAnimall(m);
		
	
	zoo.displayMenu();
	
		
		
		
	}

}
