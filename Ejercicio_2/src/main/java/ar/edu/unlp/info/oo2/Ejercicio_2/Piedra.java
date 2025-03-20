package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Piedra implements Jugada {
	
	public boolean ganaA(Jugada ju) {
		if((ju instanceof Tijera) || (ju instanceof Lagarto)) {
			return true;
		}
		else
			return false;
	}

}
