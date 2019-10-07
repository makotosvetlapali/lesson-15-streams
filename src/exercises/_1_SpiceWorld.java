package exercises;

public class _1_SpiceWorld {

	public static void main(String[] args) {	
   
		SpiceGirl sporty = () -> System.out.println("Do backflips.");
		
		sporty.perform();
	}
}

interface SpiceGirl {
	void perform();
}
