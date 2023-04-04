package ClaseOrdenador;

import java.util.ArrayList;

public class App_Hoteles {

	public static void main(String[] args) {
		
		ArrayList<Hotel>hoteles=new ArrayList<Hotel>();
		
		Hotel hotel1=new Hotel("Estrella", 20, 7, 8000);
		Hotel hotel2=new Hotel("Las Caba�as", 10, 6, 10000);
		Hotel hotel3=new Hotel("Cascada", 15, 2, 1000);
		Hotel hotel4=new Hotel("Costa Bonita", 18, 8, 12000);
		
		hoteles.add(hotel1);
		hoteles.add(hotel2);
		hoteles.add(hotel3);
		hoteles.add(hotel4);
		
//----------------------------------------------------------------------------------		
		int menu=MetodosHotel.pideInt("A que opcion deseas acceder?\n\n"
				+ "0-Salir de la aplicacion\n1-nuevo Hotel\n2-Eliminar Hotel\n"
				+ "3-Buscar Hotel\n4-Modificar un Hotel\n5-Mostrar lista de Hoteles");
		
		while(menu>=1 && menu<=5) {
		
			switch(menu) {
			
				case 1:
				
					creaHotel(hoteles,MetodosHotel.pideString("Escribe el nombre del hotel:"));
					
						menu=MetodosHotel.pideInt("Desea realizar otra tarea?");
						
							break;
							
				case 2:
			
					eliminarHotel(hoteles,MetodosHotel.pideString("Escribe el nombre del hotel:"));
					
						menu=MetodosHotel.pideInt("Desea realizar otra tarea?");
					
							break;
							
				case 3:
			
					verHotel(hoteles,MetodosHotel.pideString("Escribe el nombre del hotel:"));
					
						menu=MetodosHotel.pideInt("Desea realizar otra tarea?");
					
							break;
							
				case 4:
			
					modificarHotel(hoteles,MetodosHotel.pideString("Escribe el nombre del hotel:"));
					
						menu=MetodosHotel.pideInt("Desea realizar otra tarea?");
					
							break;
							
				case 5:
			
					MetodosHotel.mostrarLista(hoteles);
					
						menu=MetodosHotel.pideInt("Desea realizar otra tarea?");
					
							break;
			}
			
		}
		
		System.out.println("Has salido del progama");	
	}
	
	static void creaHotel(ArrayList<Hotel>hoteles,String nombre) {
		
		int indice=verificaHotel(hoteles,nombre);
		
			if(indice==-1) {
				
				Hotel nuevo=new Hotel(nombre,MetodosHotel.pideInt("Cuantas habitaciones tiene?"),
						MetodosHotel.pideInt("Cuantas plantas tiene?"),
						MetodosHotel.pideInt("Cual es su superficie?"));
				
					hoteles.add(nuevo);
					
						System.out.println(nuevo.toString() +"\n"+ nuevo.CalculaMantenimiento() +
								"\nHemos dado de alta este hotel :)");
				
			}else {
				
				System.out.println("El nombre de este hotel consta en la base de datos");
				
			}
	}
	
	static void eliminarHotel(ArrayList<Hotel>hoteles,String nombre) {
		
		int indice=verificaHotel(hoteles, nombre);
		
			if (indice==-1) {
				
				System.out.println("El hotel no se encuentra en la base de datos");
				
			}else {
				
				System.out.println(hoteles.get(indice));
				
					hoteles.remove(indice);
				
						System.out.println("El hotel " + nombre + " ha sido eliminado de la base de datos");
			}
	}
	
	static void verHotel(ArrayList<Hotel>hoteles,String nombre) {
		
		int indice=verificaHotel(hoteles, nombre);
		
			if (indice==-1) {
				
				String opcion=MetodosHotel.pideString("El hotel no se encuentra en la base de datos, deseas crearlo?");
				
					if(opcion.equalsIgnoreCase("Si")) {
						creaHotel(hoteles,nombre);
					}
				
			}else {
				
				System.out.println("\n"+hoteles.get(indice));
			
			}
		
		
	}
	
	static int verificaHotel(ArrayList<Hotel>hoteles,String nombre) {
		
		int indice=-1;
		int contador=0;

		while(contador<hoteles.size() && indice==-1){

			if(hoteles.get(contador).getNombre().equalsIgnoreCase(nombre)){
				
				
				indice=contador;
				
			}
	
				contador++;
		
				}
		
					return indice;
				}

	static void modificarHotel(ArrayList<Hotel>hoteles,String nombre) {
		
		int indice=verificaHotel(hoteles,nombre);
		
			if (indice==-1) {
				
				String opcion=MetodosHotel.pideString("El hotel no se encuentra en la base de datos, deseas crearlo?");
				
					if(opcion.equalsIgnoreCase("Si")) {
						creaHotel(hoteles,nombre);
					}
				
			}else {
				
				for(int i=0; i<=4; i++) {
					
					switch(i) {
					
						case 1:
							
							String elige=MetodosHotel.pideString("Desea cambiar el nombre?");
							
								if(elige.equalsIgnoreCase("Si")) {
							
									hoteles.get(indice).setNombre(MetodosHotel.pideString("Introduce el nuevo nombre"));
								}
								
									break;
										
						case 2:
							
							elige=MetodosHotel.pideString("Desea cambiar el numero de habitaciones");
							
								if(elige.equalsIgnoreCase("Si")) {
						
									hoteles.get(indice).setNumHabitaciones(MetodosHotel.pideInt("Introduce el numero de habitaciones"));
								
								}
								
									break;
						
						
						case 3:
							
							elige=MetodosHotel.pideString("Desea cambiar el numero de plantas?");
							
								if(elige.equalsIgnoreCase("Si")) {
					
									hoteles.get(indice).setNumPlantas(MetodosHotel.pideInt("Introduce el numero de plantas"));
							
								}
								
									break;
									
									
						case 4:
							
							elige=MetodosHotel.pideString("Desea cambiar la superficie?");
							
								if(elige.equalsIgnoreCase("Si")) {
					
									hoteles.get(indice).setSuperficie(MetodosHotel.pideInt("Introduce la nueva superficie"));
							
								}
								
									break;
									
					} 	
				}
			}
			
					System.out.println("Con las modificaciones tu hotel a quedado asi:\n\n"+hoteles.get(indice)+"\n"+hoteles.get(indice).CalculaMantenimiento());
			
		}
	
	}
