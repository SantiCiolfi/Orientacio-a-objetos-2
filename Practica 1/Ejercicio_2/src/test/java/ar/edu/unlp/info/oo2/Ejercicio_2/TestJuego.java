package ar.edu.unlp.info.oo2.Ejercicio_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJuego {
	Jugada ju1Pi;
	Jugada ju2T;
	Jugada ju3Pa;
	Jugada ju4L;
	Jugada ju5S;
	
	@BeforeEach
	void setUp() {
		ju1Pi = new Piedra();
		ju2T = new Tijera();
		ju3Pa = new Papel();
		ju4L = new Lagarto();
		ju5S = new Spock();
	}
	
	@Test
	void testRevisaJugada() {
		assertEquals("Gana piedra", ju1Pi.Juego(ju2T));
		assertEquals("Gana piedra",ju1Pi.Juego(ju4L));
		assertEquals("Gana tijera",ju2T.Juego(ju3Pa));
		assertEquals("Gana tijera",ju2T.Juego(ju4L));
		assertEquals("Gana papel",ju3Pa.Juego(ju1Pi));
		assertEquals("Gana papel",ju3Pa.Juego(ju5S));
		assertEquals("Gana lagarto",ju4L.Juego(ju3Pa));
		assertEquals("Gana lagarto",ju4L.Juego(ju5S));
		assertEquals("Gana Spock",ju5S.Juego(ju2T));
		assertEquals("Gana Spock",ju5S.Juego(ju1Pi));
		
		assertEquals("Empate", ju1Pi.Juego(ju1Pi));
		assertEquals("Empate", ju2T.Juego(ju2T));
		assertEquals("Empate", ju3Pa.Juego(ju3Pa));
		assertEquals("Empate", ju4L.Juego(ju4L));
		assertEquals("Empate", ju5S.Juego(ju5S));
	}

}
