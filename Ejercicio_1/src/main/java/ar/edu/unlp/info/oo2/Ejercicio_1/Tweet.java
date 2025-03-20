package ar.edu.unlp.info.oo2.Ejercicio_1;

import java.util.Scanner;

public class Tweet {
	private String mensaje;
	private Boolean reTweet = false;
	private Tweet origen;
	
	public Tweet() {
		
	}
	
	public Tweet(Tweet origen) {
		this.origen = origen;
		this.reTweet = true;
	}
	
	public boolean escribirTweet (String mensaje) {
		boolean verificado = false;
		if(!this.reTweet) {
			verificado = this.verificarMensaje(mensaje);
			if(verificado) {
				this.mensaje = mensaje;
				return verificado;
			}
			else
			return verificado;
		}
		else
		return verificado;
	}
	
	private boolean verificarMensaje(String mensaje) {
		return ((mensaje != null) && ((mensaje.length() >= 1) && (mensaje.length() <= 280)));
	}

	public String getMensaje() {
		return mensaje;
	}

	public Boolean getReTweet() {
		return reTweet;
	}

	public Tweet getOrigen() {
		return origen;
	}

}
