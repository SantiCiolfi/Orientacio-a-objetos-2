package ar.edu.unlp.info.oo2.Ejercicio_2;

public class Spock implements Jugada{
	
	public boolean ganaA(Jugada ju) {
		if((ju instanceof Tijera) || (ju instanceof Piedra)) {
			return true;
		}
		else
			return false;
	}
}
