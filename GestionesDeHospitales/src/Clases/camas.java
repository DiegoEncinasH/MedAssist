package Clases;

public class camas {

	//numero de camas
	String planta, habitacion;
	boolean camaContagioso, ocupado, equipacionEmergencias;
	public camas(String planta, String habitacion, boolean camaContagioso, boolean ocupado) {
		this.planta = planta;
		this.habitacion = habitacion;
		this.camaContagioso = camaContagioso;
		this.ocupado = ocupado;
	}
	public String getPlanta() {
		return planta;
	}
	public void setPlanta(String planta) {
		this.planta = planta;
	}
	public String getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}
	public boolean isCamaContagioso() {
		return camaContagioso;
	}
	public void setCamaContagioso(boolean camaContagioso) {
		this.camaContagioso = camaContagioso;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
	
	
		
}
