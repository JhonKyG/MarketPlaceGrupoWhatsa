/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Conexion;
import InterfazDAO.IEmpresaDAO;
import com.mycompany.marketplace.Empresa;

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
public class EmpresaDAO implements IEmpresaDAO {
    @Override
	public boolean registrar(Empresa em) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO empresa values (NULL,'"+em.getNombre()+"','"+em.getNit()+"','"+em.getCorreo()+"','"+em.getCelular()+"','"+em.getContrasena()+"')";
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
			System.out.println("Error: Clase EmpresaDAO, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Empresa> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM empresa ORDER BY ID";
		
		List<Empresa> listaEmpresa= new ArrayList<Empresa>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Empresa c=new Empresa();
				c.setIdEmpresa(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setNit(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
				listaEmpresa.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase EmpresaDAO, método obtener");
			e.printStackTrace();
		}
		
		return listaEmpresa;
	}
        
        @Override
	public List<Empresa> filtro(String nit, String contrasena) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM empresa WHERE nit like \""+nit+"\" and contrasena like \""+contrasena+"\"";
		          System.out.println(sql);
		List<Empresa> listaEmpresa= new ArrayList<Empresa>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Empresa c=new Empresa();
				c.setIdEmpresa(rs.getInt(1));
				c.setNombre(rs.getString(2));
                                c.setNit(rs.getString(3));
				c.setCorreo(rs.getString(4));
                                c.setCelular(rs.getString(5));
                                c.setContrasena(rs.getString(6));
				listaEmpresa.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (Exception e) {
			System.out.println("Error: Clase EmpresaDAO, método Filtro");
			e.printStackTrace();
		}
		
		return listaEmpresa;
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

