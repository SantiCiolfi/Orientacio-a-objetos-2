package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUsuario {
	
	Usuario usu1;
	Tweet t1;
	Tweet t2;
	Tweet t3;
	
	
	@BeforeEach
	void setUp() {
		usu1 = new Usuario("pepito");

		t1 = new Tweet();
		t2 = new Tweet();
		t3 = new Tweet();
		
	}
	
	@Test
	void testTweetear() {
		usu1.tweetear("esto es un tweet escrito 1");
		usu1.tweetear("esto es un tweet escrito 2");
		usu1.tweetear("esto es un tweet escrito 3");
		
		assertEquals(usu1.getPosteos().size(), 3);
	}
	
	@Test
	void testReTweetear() {
		usu1.reTweetear(t1);
		usu1.reTweetear(t2);
		usu1.reTweetear(t3);
		
		assertEquals(usu1.getPosteos().size(), 3);
	}
	
	@Test
	void testConocePosteo() {
		usu1.tweetear(t1);
		assertTrue(usu1.conocePosteo(t1));
	}
	
	@Test
	void testBorrarTweets() {
		usu1.tweetear(t1);
		
		assertEquals(usu1.getPosteos().size(), 1);
		
		usu1.borrarTweetsDe(usu1);
		
		assertEquals(usu1.getPosteos().size(), 0);

	}
}
