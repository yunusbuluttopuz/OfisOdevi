package com.ofis.helper;
import com.ofis.concrete.insan.Temizlikci;
import com.ofis.concrete.insan.Isci;
import com.ofis.concrete.insan.Mimar;
import com.ofis.concrete.insan.Patron;
import com.ofis.concrete.insan.TeknikCizimci;

public class Runner {

	public static void main(String[] args) {
		Patron myPatron = new Patron("Osman");
		
		Isci myMimar = new Mimar("Gorkem");
		Isci myTeknikCizimci = new TeknikCizimci("Erman");
		Isci myTemizlikci = new Temizlikci("Ayse abla");
		
		Isci[] personel = {myMimar, myTeknikCizimci, myTemizlikci};
				
			myPatron.bagir(personel);
			System.out.println();
			
			((Mimar) myMimar).mimariTasarimYap(100, 3, "okul");
			((Mimar) myMimar).verYansinEt();
			((Mimar) myMimar).asagila((TeknikCizimci) myTeknikCizimci);
			System.out.println();
			
			((TeknikCizimci) myTeknikCizimci).verYansinEt();
			System.out.println();
			
			((Temizlikci) myTemizlikci).verYansinEt();
			System.out.println();
			
			myPatron.bagir(personel);
			System.out.println();
			
			myPatron.zamYap(personel);		
	}

}
