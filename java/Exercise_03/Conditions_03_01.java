//Saisir l��ge de l�utilisateur et lui dire s�il est majeur ou s�il est mineur

package Exercise_03;

import java.util.Scanner;

public class Conditions_03_01 
{

	public static void main(String[] args) 
	{
		
				Scanner scanner = new Scanner(System.in);
					System.out.print("Veuillez saisir vore �ge :");
				int age = scanner.nextInt();
				
				if (age <= 18)
					System.out.println("Vous �tes donc mineur.");
				
				else
					System.out.println("Vous �tes donc majeur.");
				
			scanner.close();
	}

}
