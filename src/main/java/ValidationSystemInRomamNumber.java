import java.io.Serializable;

public class ValidationSystemInRomamNumber implements ValidationsSystemIn<String>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean valid(String number) {

		number = number.toUpperCase();
		
		if (caracterIsValid(number) && numberCarcaterIsValid(number)) {
			return true;
		}
		
		return false;

	}
	
	public boolean caracterIsValid(String number) {
		
		number = number.replaceAll("M", "");
		number = number.replaceAll("D", "");
		number = number.replaceAll("C", "");
		number = number.replaceAll("L", "");
		number = number.replaceAll("X", "");
		number = number.replaceAll("V", "");
		number = number.replaceAll("I", "");
		
		if (number.isBlank()) {
			return true;
		}
		return false;
	}
	
	public boolean numberCarcaterIsValid(String number) {
		int tam = number.length();
		if (tam - number.replaceAll("M", "").length()> 3) {
			return false;
		}
		if (tam - number.replaceAll("D", "").length()> 1) {
			return false;
		}
		if (tam - number.replaceAll("C", "").length()> 3) {
			return false;
		}
		if (tam - number.replaceAll("L", "").length()> 1) {
			return false;
		}
		if (tam - number.replaceAll("X", "").length()> 3) {
			return false;
		}
		if (tam - number.replaceAll("V", "").length()> 1) {
			return false;
		}
		if (tam - number.replaceAll("I", "").length()> 3) {
			return false;
		}
		
		return true;
	}
	

}
