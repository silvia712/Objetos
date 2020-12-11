
public class Juego {

	private String nombre;
	private int record;
	private boolean multijugadores;
	
public Juego(String nombre) { // constructor solo recibe nombre
	
	this.nombre=nombre; // this para guardar el nombre que reciba
	record=0; // o tambien podemos poner this.record=0
	multijugadores=false;
}

public void ponerRecord(int puntacion) {
	record=puntacion;	
}



public String getNombre() { 
	return nombre;
}

public void setNombre(String nombre) { // si no creamos SET no se podra cambiar nombre al juego
	this.nombre = nombre;
}

public int getRecord() {
	return record;
}

public void setRecord(int record) {
	this.record = record;
}

public boolean isMultijugadores() {
	return multijugadores;
}

public void setMultijugadores(boolean multijugadores) {
	this.multijugadores = multijugadores;
}

@Override // desde Source
public String toString() {
	return "Juego [nombre=" + nombre + ", record=" + record + ", multijugadores=" + multijugadores + "]";
}	









}




