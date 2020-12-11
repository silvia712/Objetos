
// NOMBRE
// ATRIBUTOS - (privado)
// METODOS + (publico)


public class Perro { //ATRIBUTOS de la clase. Siempre PRIVATE

	private String nombre;
	private int edad;
	private boolean vacunado;	


public Perro() { // CONSTRUCTOR: inicializamos variables.Por defecto,sin parametros
	
	nombre=" ";
	edad=0;
	vacunado=false;
}

public Perro(String nombre,int edad,int vacunado) { // constructor donde pasan los datos
	
	this.nombre=nombre;
	this.edad=0;
	this.vacunado=false;
	
}
public Perro(String nombre) { // otro constructor que solo recibe nombre
	
	this.nombre=nombre;
	this.edad=0;
	this.vacunado=false;
	
}



public String getNombre() {//Source
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public boolean isVacunado() {
	return vacunado;
}

public void setVacunado(boolean vacunado) {
	this.vacunado = vacunado;
}


public void cumpleanos() {
	
	if (edad>15) {
		System.out.println("adios perro");
	}else {
		edad++;
	}
}

public void ponerVacuna() {
	if (vacunado=false) {
		vacunado=true;
		
	}else {
		System.out.println("ya esta vacucando");
		
	}
	
	
public String toString() {
	
	String perro="";
	perro=nombre + edad + vacunado;
	return perro;
	
}
	
	

}

}
