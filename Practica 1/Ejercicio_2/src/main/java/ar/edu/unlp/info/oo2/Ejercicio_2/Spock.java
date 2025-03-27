package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Spock implements Jugada{
	
	public String Juego(Jugada jugada) {
		return jugada.ContraSpock();
	}

	public String ContraPiedra() {
		return "Gana Spock";
	}

	public String ContraPapel() {
		return "Gana papel";
	}

	public String ContraTijera() {
		return "Gana Spock";
	}

	public String ContraLagarto() {
		return "Gana lagarto";
	}

	public String ContraSpock() {
		return "Empate";
	}
}
