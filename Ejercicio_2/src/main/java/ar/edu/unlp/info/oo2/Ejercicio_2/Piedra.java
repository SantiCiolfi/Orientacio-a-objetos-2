package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Piedra implements Jugada {
	
	public String Juego(Jugada jugada) {
		return jugada.ContraPiedra();
	}

	public String ContraPiedra() {
		return "Empate";
	}

	public String ContraPapel() {
		return "Gana papel";
	}

	public String ContraTijera() {
		return "Gana piedra";
	}

	public String ContraLagarto() {
		return "Gana piedra";
	}

	public String ContraSpock() {
		return "Gana Spock";
	}

}
