package cConcrete;

import cAbstraite.IVerifCarte;

public class AmExpVerif implements IVerifCarte {

	@Override
	public void verifierCarte(String numero) {
		boolean isTrue=false;
		//Verifions si le numero respecte lunh
		boolean lunhOk = new AlgoDeLunh().verifierNumero(numero);
		if (lunhOk) {
			if (lunhOk && numero.length() == 15) {
				//On verifie si le numéro commence par deux chiffres compris entre [34-37]
				if(numero.startsWith("34") || numero.startsWith("35") || numero.startsWith("36") || numero.startsWith("37")){
					isTrue=true;
				}
			}
			if (isTrue)
				System.out.println("\n\nLa carte est correcte et est une carte American Express.\n\n");
			else
				System.out.println("\n\nLa carte est correcte mais elle n'est pas une carte American Express.\n\n");
		}
		else
			System.out.println("\n\nLa carte n'est pas correcte, elle ne respecte pas l'algo de Lunh.\n\n");

	}

}
