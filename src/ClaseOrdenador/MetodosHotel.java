package ClaseOrdenador;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosHotel {

	static int pideInt(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextInt();
	}		
	
	static String pideString(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextLine();
	}
	
	static void mostrarLista(ArrayList<Hotel>hoteles) {
		//for each, codigo mas corto que un for normal
		   for(Hotel lista :hoteles) {
			      System.out.println(lista +"\n"+lista.CalculaMantenimiento());
			      
			    }
		
			}
	
}
