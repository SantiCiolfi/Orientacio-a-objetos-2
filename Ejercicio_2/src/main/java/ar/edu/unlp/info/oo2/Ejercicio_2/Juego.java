package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Juego {
	
	public String revisarJugada (Jugada ju1, Jugada ju2) {
		if(ju1.ganaA(ju2)) {
			return "Gano el jugador 1";
		}else {
			if(ju2.ganaA(ju1)) {
				return "Gano el jugador 2";
			}else
				return "Empate";
		}
			
	}
}
