package cConcrete;

import cAbstraite.IVerifCarte;

public class Test {

	public static void main(String[] args) {
		
		IVerifCarte visaVerif = new MasterCardVerif();
		CarteVerififcateur verificateur = new CarteVerififcateur(visaVerif);
		verificateur.faireVerification("5326351192003591");
		
	}

}
