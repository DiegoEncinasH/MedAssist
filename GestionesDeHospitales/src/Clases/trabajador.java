package Clases;

import java.util.ArrayList;

public class trabajador {

	
	String nombre, pass;
	ArrayList <camas> listadoCamas = new ArrayList();
	ArrayList <paciente> listadoPacientes = new ArrayList();
	public trabajador(String nombre, String pass, ArrayList<camas> listadoCamas, ArrayList<paciente> listadoPacientes) {
		this.nombre = nombre;
		this.pass = pass;
		this.listadoCamas = listadoCamas;
		this.listadoPacientes = listadoPacientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public ArrayList<camas> getListadoCamas() {
		return listadoCamas;
	}
	public void setListadoCamas(ArrayList<camas> listadoCamas) {
		this.listadoCamas = listadoCamas;
	}
	public ArrayList<paciente> getListadoPacientes() {
		return listadoPacientes;
	}
	public void setListadoPacientes(ArrayList<paciente> listadoPacientes) {
		this.listadoPacientes = listadoPacientes;
	}
	
	
}
