
	public class Persona {

		private String nombre;
		private String dni;
		private int edad;
		private char sexo;
		private double peso;
		private double altura;
		
		private final char HOMBRE= 'H'; // CONSTANTE private final. En mayusculas
		private final char MUJER= 'M'; // CONSTANTE
		private final int SOBREPESO=1;
		private final int PESOIDEAL=0;
		private final int BAJOPESO=-1;
	
	public Persona(){
		
		this.nombre="";
		this.dni="";
		this.edad=0;
		this.sexo=HOMBRE;
		this.peso=0;
		this.altura=0;
	}
	

	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public char getHOMBRE() {
		return HOMBRE;
	}


	public char getMUJER() {
		return MUJER;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + ", HOMBRE=" + HOMBRE + ", MUJER=" + MUJER + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 


