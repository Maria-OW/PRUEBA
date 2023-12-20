package infrastructure.persistence;

import java.util.ArrayList;

import modelos.Usuario;

import modelos.Usuario;

public interface IPersistencia {
	
	void guardar(Usuario newUsuario);
	
	ArrayList<Usuario> listarUsuarios();
	Usuario getUsuarioPorId(String id);
	
	Usuario update(Usuario usuario);
	
	void delete(String id);

	Usuario update(String usuario);

}
