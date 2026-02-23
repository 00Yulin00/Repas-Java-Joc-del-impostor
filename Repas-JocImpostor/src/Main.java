import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand = new Random();
		int cantJugador =0;
		boolean dadoValido = false; 
		do {
			System.out.print("Introdueix num de jugadors: ");
			try {
				cantJugador=sc.nextInt();
				sc.nextLine();
				if(cantJugador>1) {
					dadoValido = true;
				}else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Error: Ha de ser major que 1 i ha de ser un número.");
				sc.nextLine();
			}
		}while(!dadoValido);
		
		dadoValido = false; 
		String paraulaSecreta="";
		do {
			System.out.print("Introdueix la paraula secreta: ");
			try {
				paraulaSecreta = sc.nextLine();
				if(paraulaSecreta.isBlank()||paraulaSecreta.isEmpty()){
					throw new Exception();
				}else {
					paraulaSecreta = paraulaSecreta.trim();
					dadoValido = true;
				}
			}catch (Exception e) {
				System.out.println("Error: No puede estar vacio");
			}
		}while(!dadoValido);
		
		Joc juego = new Joc(cantJugador,paraulaSecreta);
		int indexImpostor = rand.nextInt(cantJugador);
		
		for (int i = 0; i < cantJugador; i++) {
			boolean nombreValido = false; 
            String nick = "";
			do {
				System.out.print("Introdueix el nick del jugador " + (i + 1) + ": ");
				try {
					nick = sc.nextLine();
					if(nick.isBlank()||nick.isEmpty()){
						throw new Exception();
					}else {
						nick = nick.trim();
						nombreValido = true;
					}
				}catch (Exception e) {
					System.out.println("Error: No puede estar vacio");
				}
			}while(!nombreValido);
            String paraulaAssignada = (i == indexImpostor) ? "IMPOSTOR" : paraulaSecreta;
            
            juego.getJugadors()[i] = new Jugador(nick, paraulaAssignada);
        }
		
		while(!juego.totsHanVist()) {
			System.out.println("\n");
			juego.mostrarJugadors();
			System.out.print("\nSelecciona jugador per veure la paraula (1-" + cantJugador + "): ");
            try {
                int opcio = Integer.parseInt(sc.nextLine()) - 1;
                if (opcio >= 0 && opcio < cantJugador) {
                    juego.veureParaulaJugador(opcio);
                } else {
                	throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error: Introdueix un número vàlid o una pocicion valida.");
            }
		}
		System.out.println("\n");
		System.out.println("Tots els jugadors han vist la paraula.");
		System.out.print("Voleu veure qui és l’impostor? (S/N): ");
		String fin=sc.nextLine();
		if (fin.equalsIgnoreCase("S")) {
			System.out.println(juego.nickImpostor());
		}
		sc.close();
	}
}
