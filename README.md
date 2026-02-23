# 🕵️ Joc de l’Impostor - Java

Aplicació en **Java** per gestionar una partida del joc **El Joc de l’Impostor**, desenvolupada com a activitat de repàs de programació orientada a objectes.

---

## 📌 Descripció del Joc

En cada partida:

- Participen **N jugadors**
- **1 jugador és l’impostor**
- Es defineix una **paraula secreta**
- Els jugadors normals veuen la paraula secreta
- L’impostor veu la paraula **"IMPOSTOR"**

L’objectiu és gestionar correctament la partida fins a la fase final.

---

## 🧱 Estructura del Projecte

El projecte està format per les següents classes:

📦 package inicials  
 ┣ 📄 Jugador.java  
 ┣ 📄 Joc.java  
 ┣ 📄 Main.java  
 ┗ 📄 README.md  

---

## 👤 Classe `Jugador`

Representa un jugador de la partida.

### Atributs
- `nick` → nom del jugador
- `paraula` → paraula assignada
- `vist` → indica si ha vist la paraula

### Mètodes principals
- `veureParaula()` → retorna la paraula o llança excepció si ja l’ha vista
- `toString()` → mostra l’estat del jugador

Exemple:
```
Andrea (pendent de veure)
Andrea (visualitzat)
```

---

## 🎮 Classe `Joc`

Gestiona tota la partida.

### Atributs
- `Jugador[] jugadors`
- `numJugadors`
- `paraulaSecreta`

### Mètodes principals
- `mostrarJugadors()` → llista jugadors
- `veureParaulaJugador(int posicio)` → mostra la paraula individual
- `totsHanVist()` → comprova si tots han vist la paraula
- `nickImpostor()` → retorna el nick de l’impostor

---

## 🚀 Classe `Main`

Controla l’execució del programa.

### Funcionalitats
- Demanar número de jugadors
- Demanar paraula secreta
- Assignar impostor aleatori
- Permetre veure la paraula individualment
- Evitar veure-la dues vegades
- Mostrar impostor al final

---

## ▶️ Exemple d’Execució

```
Introdueix num de jugadors: 3
Introdueix la paraula secreta: Patata

=== LLISTA DE JUGADORS ===
1. Alex (pendent de veure)
2. Maria (pendent de veure)
3. Joan (pendent de veure)

Selecciona jugador per veure la paraula:
```

Si intenta veure-la dues vegades:

```
ERROR: Aquest jugador ja ha vist la paraula
```

Final:

```
Tots els jugadors han vist la paraula.
Voleu veure qui és l’impostor? (S/N)
```

---

## ⚙️ Requisits

- Java 8 o superior
- Qualsevol IDE de Java

---

## 📦 Lliurament

- Crear un `.zip` amb tots els fitxers `.java`
- Totes les classes dins d’un **package amb les vostres inicials**
- El codi ha de **compilar correctament**
- Bones pràctiques obligatòries:
  - Noms clars de variables
  - Codi ordenat
  - Comentaris

---

## ✨ Autor

Projecte acadèmic de repàs de Programació en Java.