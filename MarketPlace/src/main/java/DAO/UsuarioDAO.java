/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Conexion;
import InterfazDAO.IUsuarioDAO;
import com.mycompany.marketplace.Usuario;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author as
 */
public class UsuarioDAO implements IUsuarioDAO {
    @Override
	public boolean registrar(Usuario p) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO usuario values (NULL,'"+p.getNombre()+"','"+p.getCedula()+"','"+p.getCorreo()+"','"+p.getCelular()+"','"+p.getContrasena()+"','"+p.getSaldo()+"')";
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
			System.out.println("Error: Clase UsuarioDAO, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Usuario> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM usuario";
		
		List<Usuario> listaUsuario= new ArrayList<Usuario>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c=new Usuario();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setCedula(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
                                c.setSaldo(rs.getInt(7));
				listaUsuario.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase UsuarioDAO, método obtener");
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
        
        @Override
	public List<Usuario> filtro(String cedula, String contrasena) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM usuario WHERE cedula like \""+cedula+"\" and contrasena like \""+contrasena+"\"";
		          System.out.println(sql);
		List<Usuario> listaUsuario= new ArrayList<Usuario>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c=new Usuario();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setCedula(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
                                c.setSaldo(rs.getInt(7));
				listaUsuario.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase UsuarioDAO, método Filtro");
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
        
        @Override
	public List<Usuario> obtenerSaldo(String cedula) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM usuario WHERE cedula like \""+cedula+"\"";
		          System.out.println(sql);
		List<Usuario> listaUsuario= new ArrayList<Usuario>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c=new Usuario();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setCedula(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
                                c.setSaldo(rs.getInt(7));
				listaUsuario.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase UsuarioDAO, método ObtenerSaldo");
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
        
        @Override
        public List<Usuario> actualizar(int saldo, String cedula) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="UPDATE usuario SET saldo='"+saldo+"'" +" WHERE cedula='"+cedula+"'";
		          System.out.println(sql);
		List<Usuario> listaUsuario= new ArrayList<Usuario>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c=new Usuario();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setCedula(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
                                c.setSaldo(rs.getInt(7));
				listaUsuario.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase UsuarioDAO, método ObtenerSaldo");
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
        
/*
	@Override
	public boolean actualizar(Usuario u) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE usuario SET saldo='"+u.getSaldo()+"'" +" WHERE cedula="+u.getCedula();
                System.out.println(sql);
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {		
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		return actualizar;
	}
 */
        
        @Override
	public List<Usuario> filtroQR(String cedula) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM usuario WHERE cedula like \""+cedula+"\"";
		          System.out.println(sql);
		List<Usuario> listaUsuario= new ArrayList<Usuario>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c=new Usuario();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setCedula(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
                                c.setSaldo(rs.getInt(7));
				listaUsuario.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase UsuarioDAO, método Filtro");
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
        
/*
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

