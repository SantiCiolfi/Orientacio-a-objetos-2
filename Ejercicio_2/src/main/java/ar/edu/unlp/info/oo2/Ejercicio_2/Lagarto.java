package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Lagarto implements Jugada {
	
	public boolean ganaA(Jugada ju) {
		if((ju instanceof Papel) || (ju instanceof Spock)) {
			return true;
		}
		else
			return false;
	}
	
}
