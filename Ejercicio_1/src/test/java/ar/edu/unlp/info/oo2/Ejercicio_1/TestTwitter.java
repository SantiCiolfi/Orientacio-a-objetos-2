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
	
	
	
	@BeforeEach
	void setUp(){
		twi = new Twitter();
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
		
		assertTrue (usuarios.isEmpty());
	}
	
	@Test
	void testUsuarioConNombreRepetido() {
		twi.altaUsuario("pepe");
		twi.altaUsuario("pepe");
		
		assertEquals(twi.getUsuarios().size(), 1);
	}

}
