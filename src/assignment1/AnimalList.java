
package assignment1;

import java.util.*;

public class AnimalList {
	List<Animal> animals = new ArrayList<>(List.of(
		new Animal("Bori", "Dog"),
		new Animal("Blockchain", "Axolotl"),
		new Animal("Oreo", "Cat"),
		new Animal("Mufasa", "Lion")));

	public List<Animal> getAnimals() {
		return animals;
		
	}
}
