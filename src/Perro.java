
// NOMBRE
// ATRIBUTOS - (privado)
// METODOS + (publico)

import java.util.Random;

public class Perro { 

	private String nombre;
	private int numChip;
	private int edad;
	boolean vacunado;



public Perro() { 
	
	nombre = "";
	edad =0;
	numChip = 0;
}

public Perro(String nombre, int edad) {
	this.nombre = nombre;
	this.edad = edad;
	numChip = 0;
}

public Perro(String nombre, int numChip, int edad) {
	this.nombre = nombre;
	this.numChip = numChip;
	this.edad = edad;
}

public boolean comprobarChip() {
	if(numChip%2 == 0) {
		return true;
	}else {
		return false;
	}
}

public void poneChip() {
	if (numChip != 0) {
		System.out.println("Este perro ya tiene chip");
	}else {
		Random r = new Random();
		this.numChip = r.nextInt(100)+1;
	}
}

public String getNombre() {
	return nombre.toUpperCase();
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNumChip() {
	return numChip;
}

public void setNumChip(int numChip) {
	this.numChip = numChip;
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
}



@Override
public String toString() {
	return  nombre + " ---- Chip=" + numChip + " --- edad=" + edad;
}
























	

	

}

}
