package ar.edu.unlp.info.oo2.Ejercicio_1;

public class Tweet implements Posteo{
	
	private String mensaje;

	public void escribirTweet (String mensaje) {
		boolean verificado = false;
			verificado = this.verificarMensaje(mensaje);
			if(verificado) {
				this.mensaje = mensaje;
			}
	}
	
	private boolean verificarMensaje(String mensaje) {
		return ((mensaje != null) && ((mensaje.length() >= 1) && (mensaje.length() <= 280)));
	}

	public String getMensaje() {
		return mensaje;
	}

	public boolean conoceUsuario(Usuario usu) {
		return usu.conocePosteo(this); //pregunta si el tweet pertenece al usuario a eliminar
	}

}
