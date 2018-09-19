package com.ofis.concrete.insan;

import com.ofis.helper.Cizimci;

public class TeknikCizimci extends Isci implements Cizimci {
	
	public TeknikCizimci(String isim) {
		super(isim);
	}

	public void cizimYap() {
		System.out.printf("Teknik cizimci %s: \"Autocad'de uygulama ciziyorum!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}

	@Override
	public void verYansinEt() {
		System.out.printf("Teknik cizimci %s: \"Yeter be, yoruldum!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}

	@Override
	public void calis() {
		System.out.printf("Teknik cizimci %s: \"Cizim yapiyorum zaten!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}
		
}
