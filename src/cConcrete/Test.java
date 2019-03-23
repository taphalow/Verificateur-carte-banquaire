package cConcrete;

import cAbstraite.IVerifCarte;

public class Test {

	public static void main(String[] args) {
		IVerifCarte visaVerif = new CarteVisaVerif();
		CarteVerififcateur verificateur = new CarteVerififcateur(visaVerif);
		verificateur.faireVerification("5978210033328381");

	}

}
