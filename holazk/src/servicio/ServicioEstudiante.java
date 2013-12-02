package servicio;

import modelo.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfazdao.IEstudianteDAO;
@Service
public class ServicioEstudiante {
@Autowired
private IEstudianteDAO e;

public void guardar(Estudiante es){
	e.save(es);
}
}
