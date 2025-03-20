package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Tijera implements Jugada{

	public boolean ganaA(Jugada ju) {
		if((ju instanceof Papel) || (ju instanceof Lagarto)) {
			return true;
		}
		else
			return false;
	}

}
