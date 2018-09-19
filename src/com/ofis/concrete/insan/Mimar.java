package com.ofis.concrete.insan;
import com.ofis.concrete.urun.MimariProje;
import com.ofis.helper.Cizimci;
import com.ofis.concrete.insan.Isci;

public class Mimar extends Isci implements Cizimci {
	
	private MimariProje buMimarinProjesi;
	
	public Mimar(String isim) {
		super(isim);
	}
	
	@Override
	public void calis() {
		System.out.printf("Mimar %s: \"Tasarim yapiyorum zaten!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}
	
	public void cizimYap() {
		System.out.printf("Mimar %s: \"Sketchup'ta ciziyorum!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}
	
	@Override
	public void verYansinEt() {
		System.out.printf("Mimar %s: \"Keske akademik olsaydim. Biktim bu isten!\"%n", getIsim());
		bunalimiArtir();
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}

	public void asagila(TeknikCizimci teknikCizimci) {
		bunalimiAzalt();
		System.out.printf("Mimar %s: \"Gerizekali teknik cizimci %s.\"%n", getIsim(), teknikCizimci.getIsim());
		teknikCizimci.bunalimiArtir();
	}
	
	public void mimariTasarimYap(double arsaGenisligi, int katSayisi, String fonksiyonalite) {
		bunalimiArtir();
		
		buMimarinProjesi = new MimariProje(arsaGenisligi, katSayisi, fonksiyonalite);
		
		System.out.printf("Mimar %s: \"Yeni projemin arsa genisligi: %.2f metrekare.\n\t\tKatsayisi: %d\n\t\tFonksiyonalitesi: %s.\"%n"
				,getIsim(), buMimarinProjesi.arsaGenisligi, buMimarinProjesi.katSayisi, buMimarinProjesi.fonksiyonalite);
		System.out.println("Bu calisanin ruh hali: " + getBuIscininRuhHali());
	}
}
