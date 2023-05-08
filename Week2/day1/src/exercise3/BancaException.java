package exercise3;

public class BancaException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;

public BancaException(String message) {
super(message);
this.message = message;
}

@Override
public String toString() {
return message;
}
}
