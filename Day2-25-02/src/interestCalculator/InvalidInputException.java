package interestCalculator;

public class InvalidInputException extends Exception{
	
	// default serial uid
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}
}
