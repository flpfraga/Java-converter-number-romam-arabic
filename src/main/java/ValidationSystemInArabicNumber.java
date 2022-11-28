import java.io.Serializable;

public class ValidationSystemInArabicNumber implements ValidationsSystemIn<Integer>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean valid(Integer number) {

		
		
		return false;

	}
	
	public boolean caracterIsValid(Integer number) {
		
		String numberAux = number.toString();
		
		if (numberAux.contains("`~!@#$%^&*()-_=+{[}}:;\"\'?/>.<,"));
		
		return false;
	}
	
	public boolean numberIsValid(Integer number) {
		if (number < 0 || number > 3999) {
			return false;
		}
		
		return true;
	}
	

}
