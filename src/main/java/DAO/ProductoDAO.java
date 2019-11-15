/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Conexion;
import InterfazDAO.IProductoDAO;
import com.mycompany.marketplace.Producto;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author as
 */
public class ProductoDAO implements IProductoDAO {
    @Override
	public boolean registrar(Producto p) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO producto values (NULL,'"+p.getPrecio()+"','"+p.getCategoria()+"','"+p.getDescripcion()+"','"+p.getNombre()+"','"+p.getUrl()+"')";
		      System.out.println("ejecutaré: "+sql);
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
                        System.out.println("listo!!!!");
			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ProductoDAO, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Producto> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM producto";
		
		List<Producto> listaProducto= new ArrayList<Producto>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Producto c=new Producto();
				c.setIdProducto(rs.getInt(1));
				c.setPrecio(rs.getInt(2));
                                c.setCategoria(rs.getString(3));
				c.setDescripcion(rs.getString(4));
                                c.setNombre(rs.getString(5));
                                c.setUrl(rs.getString(6));
				listaProducto.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: ClaseProductoAO, método obtener");
			e.printStackTrace();
		}
		
		return listaProducto;
	}
        
        @Override
	public List<Producto> filtro(String nombre) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM producto WHERE nombre like \"%"+nombre+"%\"";
		
		List<Producto> listaProducto= new ArrayList<Producto>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Producto c=new Producto();
				c.setIdProducto(rs.getInt(1));
				c.setPrecio(rs.getInt(2));
                                c.setCategoria(rs.getString(3));
				c.setDescripcion(rs.getString(4));
                                c.setNombre(rs.getString(5));
                                c.setUrl(rs.getString(6));
				listaProducto.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ProductoDAO, método Filtro");
			e.printStackTrace();
		}
		
		return listaProducto;
	}
        
/*
	@Override
	public boolean actualizar(Persona p) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE PERSONA SET id='"+p.getId()+"', nombres='"+p.getNombre()+"', apellidos='"+p.getApellido()+"'" +" WHERE ID="+p.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}

	@Override
	public boolean eliminar(Persona cliente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM CLIENTE WHERE ID="+cliente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
*/
}

