package Clases;

import java.util.ArrayList;

public class visitante {

	String nombre, passPaciente;
	ArrayList <paciente> listadoPacientes = new ArrayList();

	public visitante(String nombre, String passPaciente, ArrayList<paciente> listadoPacientes) {
		super();
		this.nombre = nombre;
		this.passPaciente = passPaciente;
		this.listadoPacientes = listadoPacientes;
	}

	public ArrayList<paciente> getListadoPacientes() {
		return listadoPacientes;
	}

	public void setListadoPacientes(ArrayList<paciente> listadoPacientes) {
		this.listadoPacientes = listadoPacientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassPaciente() {
		return passPaciente;
	}

	public void setPassPaciente(String passPaciente) {
		this.passPaciente = passPaciente;
	}
	
}
