package ar.edu.unlp.info.oo2.Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String screenName;
	private ArrayList<Tweet> tweets = new ArrayList<>();
	
	public Usuario (String screenName) {
		this.screenName = screenName;
	}
	
	public void Tweetear (String mensaje) {
		boolean publicado;
		
		Tweet t = new Tweet();
		publicado = t.escribirTweet(mensaje);
		if(publicado) {
			System.out.println("Tweet publicado con exito");
			tweets.add(t);
		}
		else {
			System.out.println("Tweet no publicado");
			t=null;
		}
	}
	
	public void reTweetear (Tweet origen) {
		Tweet t = new Tweet(origen);
		tweets.add(t);
	}
	
	public void borradoEnCascadaDeTweets () {
		for (Tweet t : tweets) {
			t = null;
		}
		this.tweets.clear();
	}

	public String getScreenName() {
		return screenName;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

}
