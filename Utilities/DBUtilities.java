package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtilities {
	public static DBUtilities getUtilities() {
	    return new DBUtilities();
	  }
	  
	  public static Connection getConnection() {
	    Connection connection=null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Driver okay!");
	      try {
	        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dataing?autoReconnet=true&useSSL=false","root","root");
	        System.out.println("Connection secure!");
	      }
	      catch (Exception e) {
	        System.out.println("Connection error : "+e);
	      }
	    }
	    catch (Exception e) {
	      System.out.println("Driver error : "+e);
	    }
	    return connection;
	  }
	  
	  public static PreparedStatement getPreparedStatement(Connection connection, String query) {
		  PreparedStatement preStat=null;
		    try {
		      preStat=connection.prepareStatement(query);
		      
		    }
		    catch (Exception e) {
		      System.out.println("Preparestatement error: "+e);
		    }
		    return preStat;
		  }
	  
	  public static ResultSet getResultSet(PreparedStatement preStat) {
		    ResultSet resultSet=null;
		    try {
		      resultSet=preStat.executeQuery();
		      System.out.println("Resultset executed!");
		    }
		    catch (Exception e) {
		      System.out.println("Resultset error : "+e);
		    }
		    return resultSet;
		  }
}
