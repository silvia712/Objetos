package Ejercicio_Password;

import java.util.Random;

import sun.security.util.Length;

public class Password {

	private String contrasena;
	private int longitud;
	
	
	
	public Password(String contrasena, int longitud) { // constructor por defecto
		this.contrasena = "";
		this.longitud = 8;
	}


	public Password(int longitud) {
		
		this.longitud = longitud;
		this.contrasena = "";
	}


	public String getContrasena() {
		return contrasena;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	private void generar_password() {
		
		String minusculas="abcdefghijklmnopqrstuvwxyz";
		String mayusculas= minusculas.toUpperCase();
		String numeros="0123456789";
		
		String posi=minusculas+mayusculas+numeros;
		Random azar=new Random();
		int aleatorio=0;
		
		for (int i=0;i<posi.length();i++) {
			
			aleatorio=azar.nextInt(posi.length());
			contrasena+=posi.substring(aleatorio,aleatorio+1);
		}
		
	
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
