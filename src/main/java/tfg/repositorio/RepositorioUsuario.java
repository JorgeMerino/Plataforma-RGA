package tfg.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tfg.modelo.Alumno;
import tfg.modelo.Usuario;

@Repository("repositorioUsuario")
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {
	
	// READ
	Usuario findByEmail(String email);
	
	Usuario findById(int id);
	
	@Query("SELECT u FROM Usuario as u ORDER BY u.apellidos ASC")
	List<Usuario> findAll();
	
	// READ	
	//Consulta de Entidades con relaciones ManyToMany
	@Query("SELECT alumno FROM Alumno alumno JOIN alumno.alumnosAsignaturas r JOIN r.asignatura asignatura WHERE asignatura.id = :idAsignatura ORDER BY alumno.apellidos ASC")
	List<Alumno> findByAsignatura(@Param("idAsignatura") int idAsignatura);
	
	//Consulta de Entidades con relaciones ManyToMany
	@Query(value = "SELECT alumnoNoMatriculado FROM Alumno alumnoNoMatriculado WHERE alumnoNoMatriculado.id NOT IN (SELECT alumno FROM Alumno alumno JOIN alumno.alumnosAsignaturas r JOIN r.asignatura asignatura WHERE asignatura.id = :idAsignatura ORDER BY alumno.apellidos ASC)")
	List<Alumno> findByNotAsignatura(@Param("idAsignatura") int idAsignatura);
}
