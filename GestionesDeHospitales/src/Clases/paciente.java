package Clases;

public class paciente {

	
	String nombre, idPaciente, passReferencia, descPatologia, passPaciente, cama, antecedentesPersonales, stringAntecedentesFamiliares;
	boolean recibeVisitas, dependiente, hostil, posibleAutolesion, paleativo, antecedentesFamiliares;
	public paciente(String nombre, String idPaciente, String passReferencia, String descPatologia, String passPaciente,
			boolean recibeVisitas) {
		this.nombre = nombre;
		this.idPaciente = idPaciente;
		this.passReferencia = passReferencia;
		this.descPatologia = descPatologia;
		this.passPaciente = passPaciente;
		this.recibeVisitas = recibeVisitas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getPassReferencia() {
		return passReferencia;
	}
	public void setPassReferencia(String passReferencia) {
		this.passReferencia = passReferencia;
	}
	public String getDescPatologia() {
		return descPatologia;
	}
	public void setDescPatologia(String descPatologia) {
		this.descPatologia = descPatologia;
	}
	public String getPassPaciente() {
		return passPaciente;
	}
	public void setPassPaciente(String passPaciente) {
		this.passPaciente = passPaciente;
	}
	public boolean isRecibeVisitas() {
		return recibeVisitas;
	}
	public void setRecibeVisitas(boolean recibeVisitas) {
		this.recibeVisitas = recibeVisitas;
	}
	
	

	
	
}
