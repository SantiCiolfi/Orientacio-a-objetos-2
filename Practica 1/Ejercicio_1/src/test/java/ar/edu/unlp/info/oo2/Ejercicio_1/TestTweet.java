package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTweet {

	Tweet t;
	ReTweet rt;
	Usuario u;
	
	@BeforeEach
	void setUp(){
		u = new Usuario("pepe");
		t = new Tweet();
		rt = new ReTweet(t);
	}
	
	@Test
	void testEscribirTweet() {
		t.escribirTweet("");
		assertNull(t.getMensaje());
		
		t.escribirTweet("El desarrollo de software requiere planificación, diseño, implementación y pruebas. Es clave seguir buenas prácticas, como escribir código limpio y reutilizable. Además, el trabajo en equipo y la comunicación efectiva son esenciales para lograr proyectos exitosos y mantener la calidad del software.");
		assertNull(t.getMensaje());
		
		t.escribirTweet("Prueba de tweet");
		assertEquals("Prueba de tweet", t.getMensaje());
	}
	
	@Test
	void testCrearReTweet() {
		assertEquals(t, rt.getOrigen());
	}
	
	@Test
	void testConoceUsuario() {
		u.tweetear(t);
		assertTrue(rt.conoceUsuario(u));
	}
}
