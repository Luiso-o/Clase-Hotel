package ClaseOrdenador;

public class Hotel {
	
	private String nombre;
	private int numHabitaciones;
	private int numPlantas;
	private int superficie;
	
	public Hotel(String nombre, int numHabitaciones, int numPlantas, int superficie) {
	
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.numPlantas = numPlantas;
		this.superficie = superficie;
		
	}
	
//Getters y Setters------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumPlantas() {
		return numPlantas;
	}

	public void setNumPlantas(int numeroPlantas) {
		this.numPlantas = numeroPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
//--------------------------------------------------------------------------------------------
		
	public String CalculaMantenimiento() {
		
		int sueldo=1500;
		int maxHabitaciones=20;
		float calculoPersonal=(float)numHabitaciones/maxHabitaciones;
		calculoPersonal=(float)Math.ceil(calculoPersonal);
		int calculoCoste=(int)calculoPersonal*sueldo;
		
		return "Necesitarás " + (int)calculoPersonal + " trabajador/es destinados al mentenimiento "
			+ " del hotel\ny deberás pagar " + calculoCoste + " euros mensuales en Mantenimiento\n";
		
	}

	public String toString() {
		
		return "El Hotel " + nombre + "\nnumero de Habitaciones= " + numHabitaciones +
			"\nNumero de plantas= " + numPlantas + "\nSuperficie=" + superficie + " metros cuadrados\n";
	}
	
	
}
