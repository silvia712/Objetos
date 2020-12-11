
public class Gato {

	private String nombre;
	private int vidas;
	private int numPatas;
	
	
	public Gato() { //constructor
		
		nombre="Juan";
		vidas=7;
		numPatas=4;		
	}
	
	public Gato(String nombre,int vidas,int numPatas) {
		this.nombre=nombre;
		this.vidas=vidas;
		this.numPatas=numPatas;	
	}	
	
	
	
	public String getNombre() {
		
		return nombre.toUpperCase();
	}
	
	
	public void setNombre(String nombre) {
		this.nombre =nombre;
	
	}
	
	}
	
	
	
}
