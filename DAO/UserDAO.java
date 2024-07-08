package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.UserDTO;
import Utilities.DBUtilities;

public class UserDAO {
	
	 Connection connection=DBUtilities.getConnection();
	
	public String getMaxid() {
	    PreparedStatement prep=DBUtilities.getPreparedStatement(connection, "select * from user where user_id=(select max(user_id) from user)");
	    String id=null;
	    try {
	      ResultSet rs=prep.executeQuery();
	      if(rs.next()) {
	        id=rs.getString("user_id");
	      }
	      else {
	        System.out.println("Resultset error!");
	      }
	    } catch (SQLException e) {
	      System.out.println("Can't get max id!");
	    }
	    
	    if(id==null) {
	       id="uid_0001";
	    }
	    return id;
	  }
	
	public boolean customerInsertion(UserDTO user) {
		  
	    PreparedStatement checkAcc=DBUtilities.getPreparedStatement(connection, "select * from user where email='"+user.getEmail()+"'");
	    try {
	      ResultSet rs=checkAcc.executeQuery();
	      if(rs.next()) {
	        System.out.println("account already exists");
	        return false;
	      }
	      else {
	        PreparedStatement customerInset=DBUtilities.getPreparedStatement(connection, "INSERT INTO user  (user_id, name, c_email, c_password, c_address, c_phone) VALUES ('"+user.getU_id()+"','"+user.getU_name()+"', '"+user.getEmail()+"', '"+user.getPassword()+"', '"+user.getLocation()+"')");
	        try {
	          customerInset.execute();          
	          System.out.println("Customer account Insertion success!");
	          return true;
	        }
	        catch (SQLException e) {
	          System.out.println("Customer account Insertion error : "+e);
	        }
	      }
	    }
	    catch (SQLException e) {
	      System.out.println("customerInsertion error! "+e);
	    }
	    return false;

	  }
	
}
