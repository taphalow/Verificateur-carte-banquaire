package cConcrete;

import cAbstraite.IVerifCarte;

public class CarteVisaVerif implements IVerifCarte {
	
	@Override
	public void verifierCarte(String numero) {
		boolean isTrue=false;
		//Verifions si le numero respecte lunh
		boolean lunhOk = new AlgoDeLunh().verifierNumero(numero);
		if (lunhOk) {
			if (numero.length() == 16) {
				//On verifie si le numéro commence par 4
				if(numero.startsWith("4")){
					isTrue=true;
				}
			}
			if (isTrue)
				System.out.println("\n\nLa carte est correcte et est une carte VISA.\n\n");
			else
				System.out.println("\n\nLa carte est correcte mais elle n'est pas une carte VISA.\n\n");
		}
		else
			System.out.println("\n\nLa carte n'est pas correcte, elle ne respecte pas l'algo de Lunh.\n\n");

	}

}
