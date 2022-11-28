package model;

import model.arabic.ConvertArabicToRomam;

public interface ConvertArabic<D> {

	D convert (Integer number);
	
	static ConvertArabic<?> cria(){
		return new ConvertArabicToRomam();
	}
	
}
