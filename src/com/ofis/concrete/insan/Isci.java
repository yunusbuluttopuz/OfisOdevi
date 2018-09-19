package com.ofis.concrete.insan;

import com.ofis.helper.RuhHali;

public abstract class Isci extends Insan {

	private int bunalim = 0;
	private RuhHali buIscininRuhHali = RuhHali.MUTLU;
	
	public Isci(String isim) {
		super(isim);
	}
	
	public RuhHali getBuIscininRuhHali() {
		return buIscininRuhHali;
	}

	public void setBuIscininRuhHali(RuhHali buIscininRuhHali) {
		this.buIscininRuhHali = buIscininRuhHali;
	}	
	
	public void bunalimiArtir() {
		bunalim++;
		if (bunalim > 2) {
			bunalimaGir();
			bunalim = 0;
		}
	}
	
	public void bunalimiAzalt() {
		if (bunalim <= 0) {
			bunalim = 0;
		}		
		else {
			bunalim--;
		}
	}

	private void bunalimaGir() {
		System.out.printf("Personel %s: \"Bunalimdayim!\"%n", getIsim());
		this.buIscininRuhHali = RuhHali.MUTSUZ;
	}
	
	public abstract void verYansinEt();
	public abstract void calis();
}
