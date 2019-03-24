package cConcrete;

public class AlgoDeLunh {

	public boolean verifierNumero(String num) {
		char[] numero = num.toCharArray();
		int impaire=0 , paire=0 , somme;
		
		for(int i= 0; i<numero.length; i++) {
			if (i%2 != 0) {
				impaire += Integer.parseInt(String.valueOf(numero[i]));
			}
			else {
				int n=2*Integer.parseInt(String.valueOf(numero[i]));
				if (n >=10)
					paire += (n/10)+(n%10);
				else
					paire += n;
			}
		}
		somme = paire+impaire;
		//Si lunh est respecté retouner true, false sinon
		if(somme%10==0) 
			return true;
		return false;	
	}
}
