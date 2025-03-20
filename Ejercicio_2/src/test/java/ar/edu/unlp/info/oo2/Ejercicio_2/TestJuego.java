package ar.edu.unlp.info.oo2.Ejercicio_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJuego {
	Juego juego;
	Jugada ju1Pi;
	Jugada ju2T;
	Jugada ju3Pa;
	Jugada ju4L;
	Jugada ju5S;
	
	@BeforeEach
	void setUp() {
		juego = new Juego();
		ju1Pi = new Piedra();
		ju2T = new Tijera();
		ju3Pa = new Papel();
		ju4L = new Lagarto();
		ju5S = new Spock();
	}
	
	@Test
	void testRevisaJugada() {
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju1Pi, ju2T));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju1Pi, ju3Pa));
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju1Pi, ju4L));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju1Pi, ju5S));
		
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju3Pa, ju1Pi));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju3Pa, ju2T));
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju3Pa, ju5S));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju3Pa, ju4L));
		
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju2T, ju3Pa));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju2T, ju1Pi));
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju2T, ju4L));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju2T, ju5S));
		
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju4L, ju3Pa));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju4L, ju1Pi));
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju4L, ju5S));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju4L, ju2T));
		
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju5S, ju2T));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju5S, ju4L));
		assertEquals("Gano el jugador 1", juego.revisarJugada(ju5S, ju1Pi));
		assertEquals("Gano el jugador 2", juego.revisarJugada(ju5S, ju3Pa));
		
		assertEquals("Empate", juego.revisarJugada(ju1Pi, ju1Pi));
		assertEquals("Empate", juego.revisarJugada(ju2T, ju2T));
		assertEquals("Empate", juego.revisarJugada(ju3Pa, ju3Pa));
		assertEquals("Empate", juego.revisarJugada(ju4L, ju4L));
		assertEquals("Empate", juego.revisarJugada(ju5S, ju5S));
	}

}
