
public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2108190271234950435L;
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, Throwable e) {
		super(message, e);
	}
	
	
}
