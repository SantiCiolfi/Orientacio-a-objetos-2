package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Lagarto implements Jugada {
	
	public String Juego(Jugada jugada) {
		return jugada.ContraLagarto();
	}

	public String ContraPiedra() {
		return "Gana piedra";
	}

	public String ContraPapel() {
		return "Gana lagarto";
	}

	public String ContraTijera() {
		return "Gana tijera";
	}

	public String ContraLagarto() {
		return "Empate";
	}

	public String ContraSpock() {
		return "Gana lagarto";
	}
	
}
