
public class gato_principal {

	public static void main(String[] args) {
		
	//CREAMOS LOS OBJETOS (gatitos) con las mismas caracteristicas que hemos creado en la clase
	// nombreDeLaClase nombre(que queramos que tenga el objeto) =new nombreConstructor ();
		
		Gato minin1=new Gato(); // parametros por defecto
		Gato minin2=new Gato("isidoro",5,4); //parametros recibidos
		Gato minin3=new Gato();
								
		
	// para visualizar alguna (o todas) las propiedades de Gato, en el MAIN pondremos:
	// nombreDelObjeto.toString 
								
		System.out.println("Datos primer gatito: " + minin1.toString());
		System.out.println("Datos segundo gatito: " + minin2.toString());
		System.out.println(" ");
		
		//probando GETTERS
		System.out.println("Nombre primer gatito: " + minin1.getNombre()); // solo dira el nombre
		System.out.println("Vidas segundo gatito: " + minin2.getVidas()); // solo dira las vidas
		System.out.println(" ");
		
		//probando SETTERS
		minin3.setColor("color");
		System.out.println("El color de minin3 es "+ minin3.getColor());
		
	}

}


