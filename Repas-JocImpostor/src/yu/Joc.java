package yu;
public class Joc {
    private Jugador[] jugadors;
    private int numJugadors;
    private String paraulaSecreta;

    public Joc(int maximJugadors, String paraulaSecreta) {
        this.jugadors = new Jugador[maximJugadors];
        this.numJugadors = 0;
        this.paraulaSecreta = paraulaSecreta;
    }

    public Jugador[] getJugadors() { return jugadors; }
    public int getNumJugadors() { return numJugadors; }
    public String getParaulaSecreta() { return paraulaSecreta; }
    public void setParaulaSecreta(String paraulaSecreta) { this.paraulaSecreta = paraulaSecreta; }


    public void mostrarJugadors() {
        System.out.println("=== LLISTA DE JUGADORS ===");
        for (int i = 0; i < jugadors.length; i++) {
            System.out.println((i+1) + ". " + jugadors[i]);
        }
    }
    
    public void veureParaulaJugador(int posicio) {
    	try {
        	System.out.println("Ets Jugador "+jugadors[posicio].getNick());
    		jugadors[posicio].veureParaula();
		} catch (VistoException e) {
			System.out.println("Error: Aquest jugador ja ha vist la paraula");
		}
    }
    
    public boolean totsHanVist() {
        for (int i = 0; i < jugadors.length; i++) {
            if (jugadors[i] == null ||!jugadors[i].getVist()) {
                return false;
            }
        }
        return true;
    }
    
    public String nickImpostor() {
        for (int i = 0; i < jugadors.length; i++) {
            if (jugadors[i].getParaula().equals("IMPOSTOR")) {
                return jugadors[i].getNick();
            }
        }
        return "Error no se encontro el Impostor";
    }
}
