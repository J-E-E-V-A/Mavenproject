package com.mvcdemo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
	    public Person getDetails(int personId){
	        Person emp=new Person();
	        String sql="select * from employee where empId=?";
	        try {
	            PreparedStatement sts=JdbcConnection.getconnect().prepareStatement(sql);
	            sts.setInt(1, personId);
	            ResultSet details=sts.executeQuery();
	            while(details.next()) {
	                emp.setPersonContact(details.getString("personcontact"));
	                emp.setPersonId(details.getInt("personId"));
	                emp.setPersonName(details.getString("personName"));
	            }
	            
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return emp;
	        
	    }



	}

