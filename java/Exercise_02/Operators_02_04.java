//Partager une somme entre 0 et 0.99 euros en pi�ces de 0.5, 0.2, 0.1, 0.05, 0.02 et 0.01 en utilisant le moins de pieces
		
package Exercise_02;

import java.util.Scanner;

public class Operators_02_04 {
	public static void main(String[] arge) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entre un nombre:");
		int somme = scanner.nextInt();
		
		// nmP1 <- somme d�viser par 0.5
		int nbP1 = (int)(somme/0.5);
		// mod1 <- somme reste de 0.5
		float mod1 = (float)(somme % 0.5);
		// nmP1 <- mod1 d�viser par 0.5
		int nbP2 = (int)(mod1/0.2);
		float mod2 = (float) (mod1 % 0.2);
		int nbP3 = (int) (mod2 / 0.1);
		float mod3 = (float) (mod2 % 0.1);
		int nbp4 = (int) (mod3 / 0.05);
		float mod4 = (float) (mod3 % 0.05);
		int nbP5 = (int) (mod4 / 0.02);
		float mod5 = (float) (mod4 % 0.02);
		int nbP6 = (int) (mod5 / 0.01);
		
		if (somme == 0) {
			System.out.println("Dommage, revenez encour!");
		}else {
			System.out.println("Pour payer la somme de "+somme+" euros en utilisant le moins de pi�ces possible vous utiliserez: ");
			
			if(nbP1 != 0) 
				System.out.println(nbP1 + " pi�ce(s) de 0,5 euros");
			if(nbP2 != 0)
				System.out.println(nbP2 + "pi�ce(s) de 0,2 euros");
			if(nbP3 != 0)
				System.out.println(nbP3 + "pi�ce(s) de 0,1 euros");
			if(nbp4 != 0)
				System.out.println(nbp4 + "pi�ce(s) de 0,05 euros");
			if(nbP5 != 0)
				System.out.println(nbP5 + "pi�ce(s) de 0,02 euros");
			if(nbP6 != 0)
				System.out.println(nbP6 + "pi�ce(s) de 0,01 euros");

		}
		scanner.close();
		
	} 
	
}
