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


import com.mycompany.marketplace.Producto;
import java.util.List;


public interface IProductoDAO {
    public boolean registrar(Producto p);
    public List<Producto> obtener();
    public List<Producto> filtro(String nombre);
 	//public boolean actualizar(Persona p);
	//public boolean eliminar(Persona p);
        
}
