package tfg.servicioAplicacion;

import java.util.List;

import tfg.modelo.Alumno;
import tfg.modelo.Usuario;

public interface SAUsuario {
	public void crear(Usuario usuario);
	public void sobrescribir(Usuario usuario);
	public Usuario leer(String email);
	public Usuario leer(int id);
	public List<Usuario> leerTodos();
	public List<Alumno> leerMatriculadosAsignatura(int idAsignatura);
	public List<Alumno> leerNoMatriculadosAsignatura(int idAsignatura);
}
