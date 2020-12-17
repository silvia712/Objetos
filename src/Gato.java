

	// 1-CREAMOS LA CLASS (sin el main) y siempre en mayuscula la primera letra

	public class Gato {				

	// 2-DEFINIMOS ATRIBUTOS (propiedades/caracteristicas) de la CLASS "gato" 	
	// (Gato tiene un nombre, vidas, color....). Siempre seran PRIVATE (encapsulamos la propiedad) (simbolo -)
	
		private String nombre; 		
		private int vidas;			
		private int numPatas;
		private String color;
	
	// 3-CREAMOS CONSTRUCTOR: metodo especial que se encarga de dar un estado inicial a nuestro objeto.
	// Inicializamos Gato con: su nombre (si lo sabemos), las vidas, las patas que tiene....
	// El metodo siempre tendra el mismo nombre que la clase.
		
	public Gato() { 						
		nombre="Juan";		// nombre=""; (si no sabemos el nombre)			
		vidas=7;				
		numPatas=4;	
		color="negro";
	}
	
	//Podemos crear tantos constructores como queramos.
	//Una forma rapida para crearlos es desde la pestaña SOURCE (generate constructor using Fields...)
	//Este es otro construtor que recibe los paramentros desde el exterior.
	
	public Gato(String nombre,int vidas,int numPatas) {
		this.nombre=nombre;
		this.vidas=vidas;
		this.numPatas=numPatas;	
		
	}
	
	
	//4- GENERAMOS GETTERS Y SETTERS (desde SOURCE...) para acceder a una propiedad bien para visualizarlo o manipularlo
	// pues al estar las propiedades encapsuladas no podemos hacerlo de otra forma si no es con GET y SET (Seran PUBLIC).
	// SETTERS: para modificar el valor de una propiedad. VOID (no devuelve valor)
	// GETTERS: para acceder o ver el valor de una propiedad . RETURN (siempre va a devolver un valor)

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) { //modificamos el color
		this.color = "gris";
	}

	
	//5-GENERAMOS TO STRING para mostrar los datos (tambien desde SOURCE). Siempre irá la final.

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", vidas=" + vidas + ", numPatas=" + numPatas + ", color=" + color + "]";
	}

	
	
	}
	

	
	
	

