package programmeDeCalcul;

public class App {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };

		double moyenne = 0;
		double somme = 0;
		int plusGrand = 0;

		System.out.println("Bienvenue dans le programme de calcul du tableau d'entier.");

		for (int i = 0; i < numbers.length; i++) {

			somme += numbers[i];

			if (numbers[i] > plusGrand) {

				plusGrand = numbers[i];
			
			}

		}

		moyenne = somme / 10;

		int carreDePlusGrand = plusGrand * plusGrand;

		System.out.println("Moyenne de valeurs du tableau :" + moyenne);
		System.out.println("Valeur la plus grande (" + plusGrand + ") élevée au carré : " + carreDePlusGrand) ;
	}

}
