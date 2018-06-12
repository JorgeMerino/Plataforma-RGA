package tfg.servicioAplicacion;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import tfg.excepcion.ExcepcionPeticionHTTP;
import tfg.modelo.Alumno;
import tfg.modelo.Asignatura;
import tfg.modelo.Insignia;
import tfg.modelo.Reto;
import tfg.modelo.Variable;

public interface SAGamificacion {
	public void iniciarSesionGamificacion() throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void crearUsuario(Alumno alumno) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void crearGrupo(Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void crearJuego(Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP, ExcepcionPeticionHTTP;
	public void crearAchievement(Insignia insignia, Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP, ExcepcionPeticionHTTP;
	public void crearTablero(Asignatura asignatura, Variable variable) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void cogerAchievement(Insignia insignia, Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP, ExcepcionPeticionHTTP;
	public void cogerTablero(Asignatura asignatura, Variable variable) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP, ExcepcionPeticionHTTP;
	public void cogerTableroVersionMejorada(Asignatura asignatura, Variable variable, Alumno alumno) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void insertarUsuarioEnGrupo(Alumno alumno, Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void exportarResultados(Reto reto, String resultados) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	/*public List<Insignia> getInsignias(int idUsuario);
	public int getPuntuacion(int idUsuario);
	public void setVariable(String nombre, int valor, int idUsuario);
	public void eliminarUsuario(Alumno alumno)throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void eliminarJuego(Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void eliminarAsignatura(Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
	public void eliminarAchievement(Insignia insignia, Asignatura asignatura) throws ClientProtocolException, IOException, ExcepcionPeticionHTTP;
*/}
