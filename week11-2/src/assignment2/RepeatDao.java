package assignment2;

import java.util.List;

public class RepeatDao {
	
	// creating list of last names

	List<String> lastName = List.of("Facello", " Simmel", " Bamford", " Koblick", " Preusig", " Peac", " Sluis",
			" Terkki", " Genin", " Peha");

	//returning last name
	
	public List<String> getLastName() {
		return lastName;
	}

}
