package yu;
public class Jugador {
	private String nick;
	private String paraula;
	private boolean vist;
	// constructor
	public Jugador(String nick, String paraula) {
		setNick(nick);
		setParaula(paraula);
		this.vist = false;
	}
	// getter y setters
	public String getNick() { return nick; }
	public String getParaula() { return paraula; }
	public boolean getVist() { return vist; }
	public void setNick(String nick) { this.nick = nick; }
	public void setParaula(String paraula) { this.paraula = paraula;}
	public void setVisto(boolean visto) { this.vist = visto; }
	// metodos
	public void veureParaula() throws VistoException {
		if(!vist) {
			System.out.println("la teva paraula es:" + getParaula());
			setVisto(true);
		}else {
			throw new VistoException("ya lo ha visto");
		}
	}
	// toString
	@Override
	public String toString() {
		if (!getVist()) {
			return  getNick() + " (Pendent de veure)";
		}else {
			return  getNick() + " (Visualitzat)";
		}
	}
	
	
}
