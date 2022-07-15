package assignment1;

import java.util.*;

public class SortedAnimals {
	
	private AnimalList aList = new AnimalList();
	
	public List<Animal> getAnimal(SortType type) {
		List<Animal> animals = aList.getAnimals();
		Comparator<Animal> comp = null;
		
		switch(type) {
		
		case LAMBDA:
			comp = (breed1, breed2) -> Animal.compareAnimals(breed1, breed2);
			break;
		
		case METHOD_REFERENCE:
			comp = Animal::compareAnimals;
			break;

		default:
			throw new RuntimeException("Unhandled sort type: " + type);
		
		}
		
		animals.sort(comp);
		return animals;
	}
	
	static class MyApp implements Comparator<Animal> {

		@Override
		public int compare(Animal breed1, Animal breed2) {
			return Animal.compareAnimals(breed1, breed2);
		}
		
	}

}
