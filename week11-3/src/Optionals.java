import java.util.NoSuchElementException;
import java.util.Scanner;

public class Optionals {
	
	private Scanner scanner = new Scanner(System.in);
	private OptionalService service = new OptionalService();
	
	public static void main(String[] args) {
		
		new Optionals().run();
		
	}

	private void run() {
		
		boolean done = false;
		
		while(!done) {
			System.out.print("Enter something: ");
			String search = scanner.nextLine();
			
			if (search.isEmpty()) {
				done = true;
			} else {
				try {
				String found = service.find(search);
				System.out.println("I found " + found + "! ");
				}
				catch(NoSuchElementException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}

}
