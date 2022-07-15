
import java.util.NoSuchElementException;


public class OptionalService {
	
	private OptionalDao dao = new OptionalDao();

	public String find(String search) {
		return dao.find(search).orElseThrow(() -> new NoSuchElementException(
				"It appears that " + search + " is missing."));
	}

}
