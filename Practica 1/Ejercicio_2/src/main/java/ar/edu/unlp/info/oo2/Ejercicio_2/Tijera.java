package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Tijera implements Jugada{

	public String Juego(Jugada jugada) {
		return jugada.ContraTijera();
	}

	public String ContraPiedra() {
		return "Gana piedra";
	}

	public String ContraPapel() {
		return "Gana tijera";
	}

	public String ContraTijera() {
		return "Empate";
	}

	public String ContraLagarto() {
		return "Gana tijera";
	}

	public String ContraSpock() {
		return "Gana Spock";
	}

}
