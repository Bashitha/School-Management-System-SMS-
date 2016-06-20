/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leshan
 */
public class DBConnection {
    
    private Connection conn;
	private static DBConnection dbConnection;
	private DBConnection()throws ClassNotFoundException,SQLException{
		if(conn==null){
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/SMS","root","bashitha");
		}
	}
	
	public static DBConnection getDBConnection()throws SQLException,ClassNotFoundException{
		if(dbConnection==null){
			dbConnection=new DBConnection();
		}
		return dbConnection;
	}
	
	public Connection getConnection()throws ClassNotFoundException,SQLException{
		return conn;	
	}
    
}
