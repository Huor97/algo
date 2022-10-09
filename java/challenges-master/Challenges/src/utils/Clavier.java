package utils;
// classe fournissant des fonctions de lecture au clavier
import java.io.*; // recuper tout �ritage de class java
// class Clavier recuper les donn�s qu'on donne apr�s Clavier
public class Clavier{
	// Lire moi cha�nes de caract�re 
	public static String lireString() {
		// cr�e moi une variable de type String
		String saisie = null;
		/**
		 * Cr�e objet de type BufferedReader et
		 * mettre de dans un objet 
		 * de type inputStreameader (input) 
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		try {
			// m�thode readLine (lire moi la lign) 
			saisie = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return saisie;
	}
	// Lire moi entier
	public static int lireInt() {
		// faire reference de la methode lireString()
		String saisie1 = lireString();
		// Cr�e une variable type int qui fait reference saisie1 parseInt (lire un apr�s l'autre)
		int myInt = Integer.parseInt(saisie1);
		return myInt;
	}
	// Lire float 
	public static float lireFloat() {
		// faire reference de la methode lireString()
		String saisie2 = lireString();
		// Cr�e variable de type float. parseFloat (lire un apr�s l'autre)
		float myFloat = Float.parseFloat(saisie2);
		return myFloat;
	}
	// Lire float 
	public static double lireDouble() {
	// faire reference de la methode lireString()
		String saisie3 = lireString();
	// Cr�e variable de type float. parseFloat (lire un apr�s l'autre)
		double myDouble = Double.parseDouble(saisie3);
		return myDouble;
	}
	//main de projet pour ex�cuter les objets
	public static void main(String[] args) {
	}
}

