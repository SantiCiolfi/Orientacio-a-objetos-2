package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTweet {

	Tweet t;
	Tweet rt;
	
	@BeforeEach
	void setUp(){
		t = new Tweet();
		rt = new Tweet(t);
	}
	
	@Test
	void testEscribirTweet() {
		assertTrue(t.escribirTweet("Texto Ejemplo"));

		assertFalse(t.escribirTweet(""));
		
		assertFalse(t.escribirTweet(null));
		
		assertFalse(t.escribirTweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate."));
		
		assertFalse(rt.escribirTweet(""));
		
		assertFalse(rt.escribirTweet("Texto Ejemplo"));
		
		assertFalse(rt.escribirTweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate."));
	}
	
	

}
