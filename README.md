# 🕵️ Joc de l’Impostor - Java

Aplicació en **Java** per gestionar una partida del joc **El Joc de l’Impostor**, desenvolupada com a activitat de repàs de Programació Orientada a Objectes.

---

## 📁 Estructura del Projecte

Els fitxers estan organitzats de la següent manera:

```
Repas-Java-Joc-del-impostor
│
├── src
│   └── yu
│       ├── Jugador.java
│       ├── Joc.java
│       ├── Main.java
│       └── VistoException.java
└── README.md
```

---

## 📌 Descripció del Joc

En cada partida:

- Participen **N jugadors**
- **1 jugador és l’impostor**
- Es defineix una **paraula secreta**
- Els jugadors normals veuen la paraula secreta
- L’impostor veu la paraula **"IMPOSTOR"**

L’aplicació controla la partida fins que tots els jugadors han vist la seua paraula.

---

## 👤 Classe `Jugador`

Representa un jugador de la partida.

### Atributs
- `nick` → nom del jugador
- `paraula` → paraula assignada
- `vist` → indica si ha vist la paraula

### Funcions
- `veureParaula()` → mostra la paraula o llança excepció si ja s’ha vist
- `toString()` → mostra l’estat del jugador

Exemple:
```
Andrea (pendent de veure)
Andrea (visualitzat)
```

---

## 🎮 Classe `Joc`

Gestiona tota la partida.

### Funcions
- `mostrarJugadors()` → mostra la llista de jugadors
- `veureParaulaJugador(int posicio)` → mostra la paraula individual
- `totsHanVist()` → comprova si tots han vist la paraula
- `nickImpostor()` → retorna el nick del impostor

---

## 🚀 Classe `Main`

Controla el programa.

### Funcionalitats
- Demanar número de jugadors
- Demanar paraula secreta
- Assignar impostor aleatori
- Mostrar paraules individualment
- Evitar veure-la dues vegades
- Mostrar impostor al final

---

## ⚠️ Classe `VistoException`

Excepció personalitzada que es llança quan un jugador intenta veure la paraula més d’una vegada.

---

## ▶️ Exemple d’Execució

```
Introdueix num de jugadors: 3
Introdueix la paraula secreta: Patata

=== LLISTA DE JUGADORS ===
1. Alex (pendent de veure)
2. Maria (pendent de veure)
3. Joan (pendent de veure)
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

## ✨ Autor
Enunciado: Profes de ins Cami de Mar

Código y readme: Zhenhao Yu
