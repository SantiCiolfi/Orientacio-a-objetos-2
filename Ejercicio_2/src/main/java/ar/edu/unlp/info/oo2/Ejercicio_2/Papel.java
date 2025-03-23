package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Papel implements Jugada {

	public String Juego(Jugada jugada) {
		return jugada.ContraPapel();
	}

	public String ContraPiedra() {
		return "Gana papel";
	}

	public String ContraPapel() {
		return "Empate";
	}

	public String ContraTijera() {
		return "Gana tijera";
	}

	public String ContraLagarto() {
		return "Gana lagarto";
	}

	public String ContraSpock() {
		return "Gana papel";
	}

}
