package cConcrete;

import cAbstraite.IVerifCarte;

public class CarteVerififcateur {

	private IVerifCarte verifier;
	
	public CarteVerififcateur(IVerifCarte verifier) {
		setVerifier(verifier);
	}
	
	public void setVerifier(IVerifCarte verifier) {
		this.verifier = verifier;
	}
	
	public IVerifCarte getVerifier() {
		return this.verifier;
	}
	
	public void faireVerification(String numero) {
		this.getVerifier().verifierCarte(numero);
	}
}