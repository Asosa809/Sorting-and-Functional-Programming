package assignment2;

import java.util.Objects;

public class RepeatingName implements Comparable<RepeatingName>{
	private String repeatingChar;
	private String name;
	
	public RepeatingName(String name) {
		this.name = Objects.requireNonNull(name, "name must not be null");
		this.repeatingChar = findRepeatingChar(name);
		Objects.requireNonNull(this.repeatingChar, 
				"The name " + name + " must have one or more repeating characters.");
	}
	
	public String getRepeatingChar() {
		return repeatingChar;
	}

	public String getName() {
		return name;
	}

	public static boolean hasRepeatingCharacter(String name) {
		return findRepeatingChar(name) != null;
	}

	private static String findRepeatingChar(String name) {
		if (Objects.isNull(name) || name.trim().isEmpty()) {
			throw new RuntimeException("Name must not be null or empty");
		}
		
		String trimmed = name.trim();
		char lastChar = name.charAt(0);
		
		for (int index = 1; index < trimmed.length(); index++) {
			char thisChar = name.charAt(index);
			
			if (lastChar == thisChar) {
				return Character.toString(thisChar);
			}
			
			lastChar = thisChar;
		}
		
		return null;
	}

	@Override
	public int compareTo(RepeatingName that) {
		int cmp = this.repeatingChar.compareTo(that.repeatingChar);
		
		if (cmp == 0) {
			cmp = this.name.compareTo(that.name);
		}
		
		return cmp;
	}

	@Override
	public String toString() {
		return "RepeatingName [repeatingChar=" + repeatingChar + ", name=" + name + "]";
	}
	
	

}
