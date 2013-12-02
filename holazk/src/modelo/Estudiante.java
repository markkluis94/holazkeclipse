package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
private String nombre;
private int edad;
private String apellido;
private String direccion;




public Estudiante(String nombre, int edad, String apellido, String direccion) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.apellido = apellido;
	this.direccion = direccion;
}



public Estudiante() {
	super();
	// TODO Auto-generated constructor stub
}
@Id
@Column(name="nombre")
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Column(name="edad")
public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}
@Column(name="apellido")
public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}

@Column(name="direccion")
public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}

}
