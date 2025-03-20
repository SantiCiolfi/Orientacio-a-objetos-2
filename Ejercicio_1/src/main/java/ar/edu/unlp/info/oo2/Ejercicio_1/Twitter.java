package ar.edu.unlp.info.oo2.Ejercicio_1;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios = new ArrayList<>();

	public Twitter(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Twitter() {
		
	}


	public void altaUsuario (String screenName) {
		if(this.validarScreenName(screenName)) {
			Usuario u = new Usuario(screenName);
			this.usuarios.add(u);
		}else {
			System.out.print("Nombre de usuario ya en uso, intente con otro");
		}
		
	}
	
	public void bajaUsuario (String screenName) {
		Usuario u = this.usuarios.stream().filter(usuario -> usuario.getScreenName() == screenName).findFirst().orElse(null);
		u.borradoEnCascadaDeTweets();
		this.usuarios.remove(u);
		u = null;
	}
	
	private boolean validarScreenName(String screenName) {
		return this.usuarios.stream().filter(usuario -> usuario.getScreenName() == screenName).findAny().isEmpty();
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

}
