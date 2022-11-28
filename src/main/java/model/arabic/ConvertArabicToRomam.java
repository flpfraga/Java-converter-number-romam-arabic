package model.arabic;

import java.io.Serializable;

import model.ConvertArabic;

public class ConvertArabicToRomam implements ConvertArabic<String>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String convert(Integer number) {
		Integer[] sizeTable = countNumberSize(number);
		return createRomamNumber(sizeTable);
	}

	public Integer[] countNumberSize(Integer number) {

		Integer[] sizeTable = new Integer[13];

		sizeTable[12] = number / 1000;
		number = number % 1000;
		sizeTable[11] = number / 900;
		number = number % 900;
		sizeTable[10] = number / 500;
		number = number % 500;
		sizeTable[9] = number / 400;
		number = number % 400;
		sizeTable[8] = number / 100;
		number = number % 100;
		sizeTable[7] = number / 90;
		number = number % 90;
		sizeTable[6] = number / 50;
		number = number % 50;
		sizeTable[5] = number / 40;
		number = number % 40;
		sizeTable[4] = number / 10;
		number = number % 10;
		sizeTable[3] = number / 9;
		number = number % 9;
		sizeTable[2] = number / 5;
		number = number % 5;
		sizeTable[1] = number / 4;
		number = number % 5;
		sizeTable[0] = number / 1;

		return sizeTable;

	}

	public String createRomamNumber(Integer[] sizeTable) {
		String response = "";
		String[] romamTable = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		for (int c = 12; c >= 0; c--) {
			Integer number = sizeTable[c];
			if (number != null) {
				while (number > 0) {
					response += romamTable[c];
					number--;
				}
			}
		}
		return response;

	}

}
