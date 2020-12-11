
public class Recreativos {

	public static int pintaMenu() {
		
		//guardar un nuevo juego
		//poner puntuacion a un juego
		//ver todos los juegos
		
		
	}
	
	
	
	
	public static void guardarJuego(Juego vJuegos[]) {
		
	}
	
	
	public static void ponerPuntuacionJuego(Juego vjuegos[]) {
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		String vNombres[] = new String[100];
		Juego vJuegos[]= new Juego[100]; //vector para guardar hasta 100 juegos
		
		Juego juego1 = new Juego("CiberPunk");
		Juego juego2 = new Juego("Los Sims");
		Juego juego3 = new Juego("Fifa");
		
		vJuegos[0]=juego1;
		vJuegos[1]=juego2;
		vJuegos[2]=juego3;
		vJuegos[3]=new Juego("Tetris");
		
		vJuegos[2].setMultijugadores(true);
		vJuegos[2].ponerRecord(100);
		
		for (int i=0;i<vJuegos.length;i++) {
			if (vJuegos[i]!=null && vJuegos[i].isMultijugadores()== true ) { // solo muestra los multijugador
			System.out.println(vJuegos[i].toString());
			}
		}
		
		
		System.out.println(juego1.toString());
		System.out.println(vJuegos[0]);
		
		
	

	}

}
