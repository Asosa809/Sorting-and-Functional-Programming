import java.util.Optional;

public class OptionalDao {
	
	public Optional<String> find(String search) {
		if("missing".equals(search)) {
			return Optional.empty();
		}
		
		return Optional.of(search);
	} 

}
