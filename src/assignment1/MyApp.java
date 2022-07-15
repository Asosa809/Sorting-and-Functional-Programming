package assignment1;

import java.util.List;

public class MyApp {
	
	private SortedAnimals sortAnml = new SortedAnimals();
	

	public static void main(String[] args) {
		new MyApp().run();
		
	}
	
	private void run() {
		List<Animal> animals = sortAnml.getAnimal(SortType.METHOD_REFERENCE);
		print(animals, SortType.METHOD_REFERENCE);
	}

	private void print(List<Animal> animals, SortType type) {
		switch(type) {
		
		case LAMBDA:
			animals.forEach(animal -> System.out.println(animal.getBreed()));
			break;
		
		case METHOD_REFERENCE:
			animals.forEach(System.out::println);
			break;
			
		default:
			break;
		
		}
		
	}
}
