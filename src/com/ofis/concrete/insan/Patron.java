package com.ofis.concrete.insan;

public class Patron extends Insan {
	
	public Patron(String isim) {
		super(isim);
	}

	public void bagir(Isci[] personel) {
		System.out.printf("Patron %s: \"Calisin lan!\"%n", getIsim());
		
		for(Isci isci: personel) {
			isci.calis();
		}		
	}
	
	public void zamYap(Isci[] personel) {
		System.out.printf("Patron %s: \"Herkese zam yaptim. Hadi iyisiniz koftehorlar!\"%n", getIsim());
		
		for(Isci isci: personel) {
			isci.bunalimiAzalt();
		}	
		
	}
}
