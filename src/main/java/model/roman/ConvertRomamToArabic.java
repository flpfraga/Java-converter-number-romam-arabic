package model.roman;

import java.io.Serializable;

import model.ConvertRomam;

public class ConvertRomamToArabic implements ConvertRomam<Integer>, Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Integer convert(String number) {
		Integer listArabic[] = parseListRomamForNumber(number);

		int tam = number.length();
		Integer response = 0;
		for (int c = 0; c < tam; c++) {
			if (c + 1 == tam) {
				response += listArabic[c];
				break;
			}

			if (listArabic[c] < listArabic[c + 1]) {
				response -= listArabic[c];
				continue;
			}
			response += listArabic[c];
		}
		return response;
	}

	public Integer[] parseListRomamForNumber(String romamNumber) {
		int tam = romamNumber.length();
		Integer listArabic[] = new Integer[tam];

		for (int c = 0; c < tam; c++) {
			try {
				if (c + 1 == tam) {
					listArabic[c] = parseRomamForNumber(romamNumber.substring(c));
				}
				listArabic[c] = parseRomamForNumber(romamNumber.substring(c, c + 1));
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return listArabic;

	}

	public Integer parseRomamForNumber(String i) throws Exception {

		if (i.equalsIgnoreCase("I")) {
			return 1;
		}
		if (i.equalsIgnoreCase("V")) {
			return 5;
		}
		if (i.equalsIgnoreCase("X")) {
			return 10;
		}
		if (i.equalsIgnoreCase("L")) {
			return 50;
		}
		if (i.equalsIgnoreCase("C")) {
			return 100;
		}
		if (i.equalsIgnoreCase("D")) {
			return 500;
		}
		if (i.equalsIgnoreCase("M")) {
			return 1000;
		}
		throw new Exception();
	}

}
