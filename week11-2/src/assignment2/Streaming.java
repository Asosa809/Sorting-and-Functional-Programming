package assignment2;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Streaming {
	private RepeatService repeatService = new RepeatService();

	public static void main(String[] args) {
		
		new Streaming().run();
	}
	
	private void run() {
		
		//group by repeating character goes into a map
		
		Map<String, List<RepeatingName>> names = repeatService.findRepeatingNames();
		
		names.entrySet().forEach(entry -> 
			System.out.println(entry.getKey() + ": " +
					entry.getValue().stream()
					.map(RepeatingName::getName)
					.collect(Collectors.toList())));
	}

}
