

````
VARIABLES

	numbers est un ENTIER TABLEAU // int[] numbers = { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 }
	
	moyenne est un REEL
	
	somme est un REEL
	
	plusGrand est un ENTIER
	
	carreDePlusGrand  est un ENTIER

TRAITMENT

AFFICHER "Bienvenue dans le programme de calcul du tableau d'entier."

moyenne <-- 0

somme <-- 0

// Boucle pour calculer la somme des entiers jusqu'à nombreLimite
    POUR i DE 0	À nombreLimite FAIRE  // nombreLimite = numbers.length
        somme <-- somme + i
        
        SI numbers [i] > plusGrand ALORS
        plusGrand <-- number[i]
            
       FIN POUR 
    
   moyenne <-- somme /10
   
   carreDePlusGrand <-- plusGrand * plusGrand
   
   
   AFFICHER "Moyenne de valeurs du tableau :" + moyenne
	AFFICHER "Valeur la plus grande(42) élevée au carré : " + carreDePlusGrand
    
 
RESULTAT

	Bienvenue dans le programme de calcul du tableau d'entier.
	Moyenne de valeurs du tableau :13.2
	Valeur la plus grande(42) élevée au carré : 1764

````