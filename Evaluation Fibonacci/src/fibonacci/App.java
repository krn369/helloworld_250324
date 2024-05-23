package fibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Position;
		int N;
		String Resultat;
		double NbPrecedent;
		double NbCourant;
		double NbSuivant;

		System.out.println("Suite de Fibonacci. Combien de nombre de la suite souhaitez-vous afficher ? ");
		N = sc.nextInt();

		Position = 2;
		Resultat = "0 1";
		NbPrecedent = 0;
		NbCourant = 1;

		if (N > 2) {

			while (Position < N) {

				NbSuivant = NbPrecedent + NbCourant;
				Resultat = Resultat + "," + " " + NbSuivant;
				NbPrecedent = NbCourant;
				NbCourant = NbSuivant;
				Position = Position + 1;

			}

		} else {

			N = 2;

		}

		System.out.println("Les " + N + " premiers nombres de la suite de Fibonacci sont \n" + Resultat);

		sc.close();

	}

}
