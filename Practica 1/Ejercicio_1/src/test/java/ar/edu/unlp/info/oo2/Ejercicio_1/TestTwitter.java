package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTwitter {
	
	Twitter twi;
	Usuario usu1;
	Usuario usu2;
	Usuario usu3;
	Tweet t1;
	Tweet t2;
	Tweet t3;
	Usuario u1;
	Usuario u2;
	Usuario u3;
	Usuario u4;
	
	@BeforeEach
	void setUp(){
		twi = new Twitter();
		t1 = new Tweet();
		t2 = new Tweet();
		t3 = new Tweet();
		u1 = new Usuario("usu1");
		u2 = new Usuario("usu2");
		u3 = new Usuario("usu3");
		u4 = new Usuario("usu4");
	}
	
	@Test
	void testAltaUsuarios() {
		twi.altaUsuario("pepe");
		twi.altaUsuario("ramon");
		twi.altaUsuario("julio");
		
		ArrayList<Usuario> usuarios = twi.getUsuarios();
		assertEquals( usuarios.get(0).getScreenName(), "pepe");
		assertEquals( usuarios.get(1).getScreenName(), "ramon");
		assertEquals( usuarios.get(2).getScreenName(), "julio");
	}
	
	@Test
	void testBajaUsuarios() {
		twi.altaUsuario("pepe");
		twi.altaUsuario("ramon");
		twi.altaUsuario("julio");
		
		twi.bajaUsuario("pepe");
		twi.bajaUsuario("ramon");
		twi.bajaUsuario("julio");
		
		ArrayList<Usuario> usuarios = twi.getUsuarios();
		
		assertTrue(usuarios.isEmpty());
	}
	
	@Test
	void testUsuarioConNombreRepetido() {
		twi.altaUsuario("pepe");
		twi.altaUsuario("pepe");
		
		assertEquals(twi.getUsuarios().size(), 1);
	}
	
	@Test
	void testBajaEnCascada() {
		twi.altaUsuario(u1);
		twi.altaUsuario(u2);
		twi.altaUsuario(u3);
		twi.altaUsuario(u4);
		
		u1.tweetear(t1);
		u2.reTweetear(t1);
		
		twi.bajaUsuario(u1);
		
		assertEquals(twi.getUsuarios().size(), 3);
		
		assertTrue(u2.getPosteos().isEmpty());
	}
}
