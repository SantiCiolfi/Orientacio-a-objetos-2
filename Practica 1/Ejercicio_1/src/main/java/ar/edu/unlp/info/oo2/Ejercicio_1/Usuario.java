package ar.edu.unlp.info.oo2.Ejercicio_1;

import java.util.ArrayList;

public class Usuario{
	
	private String screenName;
	private ArrayList<Posteo> posteos = new ArrayList<>();
	
	public Usuario (String screenName) {
		this.screenName = screenName;
	}
	
	public void tweetear (String mensaje) {
		Tweet t = new Tweet();
		t.escribirTweet(mensaje);
		posteos.add(t);
	}
	
	public void tweetear (Tweet t) {
		posteos.add(t);
	}
	
	public void reTweetear (Posteo origen) {
		ReTweet t = new ReTweet(origen);
		posteos.add(t);
	}

	public String getScreenName() {
		return screenName;
	}

	public ArrayList<Posteo> getPosteos() {
		return this.posteos;
	}

	public void borrarTweetsDe(Usuario u) {
		this.posteos.removeIf(p -> p.conoceUsuario(u)); //le pregunta a todos sus posteos si conocen a algun posteo de el usuario a eliminar y si da true elimina ese posteo
	}
	
	public boolean conocePosteo(Posteo p) {
		return this.posteos.contains(p); //pregunta si el usuario a eliminar conoce a el posteo actual
	}
}
