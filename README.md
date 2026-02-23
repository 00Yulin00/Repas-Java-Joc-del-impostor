Repàs - Joc del impostor
Format activitat i consideracions
En cas d’entregar codi que NO COMPILI, directament s’obtindrà un 0 en aquell exercici.

Recorda que cal que el codi funcioni i es compleixin també les bones pràctiques (noms de variables, codi endreçat, comentaris…)
Lliurament 
Crea un zip amb tots els fitxers (.java) de la col·lecció. Cal que es creï en un package amb les vostres inicials on posareu totes les classes.
Exercicis 
L’Institut vol desenvolupar una aplicació en Java que permeti gestionar una partida del joc El Joc de l’Impostor. 

En cada partida hi participen N jugadors, dels quals 1 serà impostor, i hi haurà una paraula secreta definida a l’inici del joc. A cada jugador se li assignarà una paraula: els jugadors normals veuran la paraula secreta, mentre que el impostor rebran la paraula “IMPOSTOR”. 

L’objectiu de l’aplicació serà controlar correctament l’assignació de rols, gestionar la visualització individual de la paraula i garantir el correcte desenvolupament de la partida fins a la fase final de votació.
Classes a crear
Jugador
Joc
Main
1. Classe Jugador
Aquesta classe representa un jugador de la partida i ha de tenir com a mínim el nick del jugador, la paraula que se li assigna i per últim una variable que controli si ha vist o no la paraula.
1.1 Constructor.
Crea el constructor de la classe, has de tenir en compte si algún atribut ha de rebre un valor per defecte o no.
1.2 Getters i Setters
Genera els getters i setters que consideres necessaris.
1.3 Mètode veureParaula() 
Aquest mètode ha de mirar si la persona ja ha vist la paraula, si no la ha vist, ha de retornar la paraula, però si sí la ha vist, ha de llançar una excepció ja que sí la ha vist.
1.4 Mètode toString()
Mètode què farem servir per a llistar els participants del joc. Ha de seguir el següent format:
Si NO ha vist la paraula: Andrea (pendent de veure)
Si JA ha vist la paraula: Andrea (visualitzat)
2. Classe Joc
Aquesta classe gestiona tota la partida i és la responsable de controlar els jugadors, la configuració inicial i el desenvolupament del joc. La classe ha de contenir una llista de jugadors representada mitjançant un array d’objectes de tipus Jugador, així com la informació necessària per configurar la partida. En concret, ha de guardar el nombre total de jugadors que participen i la paraula secreta que veuran els jugadors no-impostors. Aquesta classe també serà l’encarregada de coordinar les accions principals del joc.
2.1 Constructor.
Crea el constructor de la classe, has de tenir en compte si algún atribut ha de rebre un valor per defecte o no.
2.2 Getters i Setters
Genera els getters i setters que consideres necessaris.
2.3 Mètode mostrarJugadors()
Mostra la llista completa de jugadors utilitzant el toString() de la classe Jugador.
2.4 Mètode veureParaulaJugador(int posicio)
Mostra:
Ets JugadorX
La teua paraula és: XXXXX
Utilitza el mètode veureParaula() de la classe Jugador. Si el jugador ja l’ha vista → es llança l’excepció.
2.5 Mètode totsHanVist()
Retorna true si tots els jugadors han vist la paraula.
2.6 Mètode nickImpostor()
Recorre l’array i retorna el nick del jugador que té la paraula "IMPOSTOR".

3. Classe Main
1. Introducció de dades
El programa demanarà:
Introdueix número de jugadors: 3
Validació: Ha de ser major que 1 i ha de ser un número.
Després:
Introdueix la paraula secreta: Patata
Validació:No pot estar buida.
2. Creació del joc
3. Desenvolupament
El programa mostrarà repetidament la llista de jugadors:
1. Jugador1 (pendent de veure)
2. Jugador2 (pendent de veure)
3. Jugador3 (pendent de veure)
I demanarà:
Selecciona jugador per veure la paraula:
Cada jugador veurà la seua paraula de forma individual introduint el seu número associat (ha se un número i ha de ser també un dels que es mostren, en aquest cas, 1, 2 o 3)
Si intenta veure-la dues vegades:
ERROR: Aquest jugador ja ha vist la paraula

4. Finalització
Quan el mètode totsHanVist() retorne true, el programa mostrarà:
Tots els jugadors han vist la paraula.
Voleu veure qui és l’impostor? (S/N)
Si l’usuari introdueix N, el programa finalitza, i si respòn S, el programa mostra el nick del impostor i desprès ja finalitza.

