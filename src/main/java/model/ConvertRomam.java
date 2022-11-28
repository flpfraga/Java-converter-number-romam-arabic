package model;

import model.roman.ConvertRomamToArabic;

public interface ConvertRomam<D> {
	
	D convert (String number);
	
	static ConvertRomam<?> cria(){
		return new ConvertRomamToArabic();
	}
	
}
