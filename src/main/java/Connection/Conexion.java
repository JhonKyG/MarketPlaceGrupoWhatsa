/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author as
 */
public class Conexion {
    public static Connection conectar() throws ClassNotFoundException {
		
        
        
                Connection con = null;
		
		String password = "root";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/marketplace?user=" + usuario
				+ "&password=" + password+"&autoReconnect=true&useSSL=false";
                
		try {
                    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
                    Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}
