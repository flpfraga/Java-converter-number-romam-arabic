package com.fraga.application;

import java.util.Scanner;

import model.ConvertArabic;
import model.ConvertRomam;

public class Startup {

	public static void main(String[] args) {
		
		int v = 1;
		do{
			
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("digitie: "
				+ "1 para converter Romano Arabico"
				+ "2 para converter Arabico Romano");
		
		int opcao = ler.nextInt();
		
		if (opcao == 1) {
			ConvertRomam<Integer> converter = (ConvertRomam<Integer>) ConvertRomam.cria();
			System.out.println("digite um numero em romano");
			String entrada = ler.next();
			System.out.println(converter.convert(entrada));
			
		}
		if (opcao == 2) {
			ConvertArabic<String> converter = (ConvertArabic<String>) ConvertArabic.cria();
			System.out.println("digite um numero em arabico");
			Integer entrada = ler.nextInt();
			System.out.println(converter.convert(entrada));
		}
		System.out.println("tecle 0 para sair");
		v = ler.nextInt();
		}while(v>0);
		
	}

}
