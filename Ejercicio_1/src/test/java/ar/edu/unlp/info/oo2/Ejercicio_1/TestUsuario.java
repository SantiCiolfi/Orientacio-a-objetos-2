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
		usu1.Tweetear("esto es un tweet escrito 1");
		usu1.Tweetear("esto es un tweet escrito 2");
		usu1.Tweetear("esto es un tweet escrito 3");
		
		assertEquals(usu1.getTweets().size(), 3);
		
		usu1.Tweetear("");
		usu1.Tweetear("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate.");
		
		assertEquals(usu1.getTweets().size(), 3);
	}
	
	@Test
	void testReTweetear() {
		usu1.reTweetear(t1);
		usu1.reTweetear(t2);
		usu1.reTweetear(t3);
		
		assertEquals(usu1.getTweets().size(), 3);
	}
	
	@Test
	void testBorradoEnCascada() {
		usu1.reTweetear(t1);
		usu1.reTweetear(t2);
		usu1.reTweetear(t3);
		usu1.Tweetear("esto es un tweet escrito 1");
		usu1.Tweetear("esto es un tweet escrito 2");
		usu1.Tweetear("esto es un tweet escrito 3");
		
		assertEquals(usu1.getTweets().size(), 6);
		
		usu1.borradoEnCascadaDeTweets();
		
		assertTrue(usu1.getTweets().isEmpty());
	}
}
