package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Papel implements Jugada {

	public boolean ganaA(Jugada ju) {
		if((ju instanceof Piedra) || (ju instanceof Spock)) {
			return true;
		}
		else
			return false;
	}

}
