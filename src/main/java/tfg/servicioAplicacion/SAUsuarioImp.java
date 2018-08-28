package tfg.servicioAplicacion;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import tfg.modelo.Alumno;
import tfg.modelo.Usuario;
import tfg.repositorio.RepositorioUsuario;

@Service("saUsuario")
public class SAUsuarioImp implements SAUsuario {
	@Autowired
	private RepositorioUsuario repositorioUsuario;
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Transactional
	@Override
	public void crear(Usuario usuario) {
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		repositorioUsuario.save(usuario);
	}
	
	@Override
    public void sobrescribir(Usuario usuario) {
		repositorioUsuario.save(usuario);
    }
	
	@Override
	public Usuario leer(String email) {
		return repositorioUsuario.findByEmail(email);
	}

	@Override
	public Usuario leer(int id) {
		return repositorioUsuario.findById(id);
	}
	
	@Override
	public List<Usuario> leerTodos() {
		return repositorioUsuario.findAll();
	}
	
	@Override
	public List<Alumno> leerMatriculadosAsignatura(int idAsignatura){
		return repositorioUsuario.findByAsignatura(idAsignatura);
	}
	
	@Override
	public List<Alumno> leerNoMatriculadosAsignatura(int idAsignatura){
		return repositorioUsuario.findByNotAsignatura(idAsignatura);
	}
}
