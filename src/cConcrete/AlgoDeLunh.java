package cConcrete;

public class AlgoDeLunh {

	public boolean verifierNumero(String num) {
		char[] numero = num.toCharArray();
		int impaire=0 , paire=0 , somme;
		for(int i=0; i<numero.length-1; i++) {
			if ( i%2 == 0)
				paire += (2*Integer.parseInt(String.valueOf(numero[i]))%9);
			else
				impaire += Integer.parseInt(String.valueOf(numero[i]));
		}
		somme = paire+impaire+Integer.parseInt(String.valueOf(numero[numero.length-1]));
		//Si lunh est respecté retouner true, false sinon
		if(somme%10==0) 
			return true;
		return false;		
	}
}
