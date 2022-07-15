package assignment2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatService {

	private RepeatDao repeatDao = new RepeatDao();

	public Map<String, List<RepeatingName>> findRepeatingNames() {
		return repeatDao.getLastName().stream()
			.filter(RepeatingName::hasRepeatingCharacter)
			.map(RepeatingName::new)
			.sorted()
			.collect(Collectors.groupingBy(RepeatingName::getRepeatingChar));
	}

}
