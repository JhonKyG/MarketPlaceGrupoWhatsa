/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDAO;

/**
 *
 * @author as
 */


import com.mycompany.marketplace.Usuario;
import java.util.List;


public interface IUsuarioDAO {
    public boolean registrar(Usuario p);
    public List<Usuario> obtener();
    public List<Usuario> filtro(String usuario, String contrasena);
    public List<Usuario> obtenerSaldo(String usuario);
    public List<Usuario> filtroQR(String usuario);
    public List<Usuario> actualizar(int saldo, String cedula);
    
	//public boolean eliminar(Persona p);
        
}
