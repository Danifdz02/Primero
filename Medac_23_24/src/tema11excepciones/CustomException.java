package medacformacion.excepciones.resuelto;

public class CustomException extends Exception {

	private static final long serialVersionUID = 7762480686018092847L;
	
	public CustomException() {}
	
	public CustomException(String message) {
		super(message);
	}
	
}