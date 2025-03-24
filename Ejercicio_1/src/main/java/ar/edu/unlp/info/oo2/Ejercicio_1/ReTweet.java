package ar.edu.unlp.info.oo2.Ejercicio_1;

public class ReTweet implements Posteo{
	
	private Posteo origen;
	
	public ReTweet(Posteo origen) {
		this.origen = origen;
	}
	
	public boolean conoceUsuario(Usuario usu) { //pregunta si el usuario conoce al posteo actual, sino le pregunta a su retweet si el usuario lo conoce de forma recursiva
		return usu.conocePosteo(this) || origen.conoceUsuario(usu);
	}

	public Posteo getOrigen() {
		return origen;
	}
}
