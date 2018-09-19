package com.ofis.concrete.insan;

public class Temizlikci extends Isci {
	
	public Temizlikci(String isim) {
		super(isim);
	}

	@Override
	public void verYansinEt() {
		System.out.printf("Temizlikci %s: \"Dizlerim mahvoldu!\"%n", getIsim());
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
		bunalimiArtir();
	}

	@Override
	public void calis() {
		System.out.printf("Temizlikci %s: \"Temizlik yapiyorum!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}
}
