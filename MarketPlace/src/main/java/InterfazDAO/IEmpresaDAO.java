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


import com.mycompany.marketplace.Empresa;
import java.util.List;


public interface IEmpresaDAO {
    public boolean registrar(Empresa e);
    public List<Empresa> obtener();
    public List<Empresa> filtro(String usuario, String contrasena);
 	//public boolean actualizar(Persona p);
	//public boolean eliminar(Persona p);
        
}
