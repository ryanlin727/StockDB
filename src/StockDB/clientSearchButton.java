package StockDB;

import java.awt.event.*;
import java.sql.*;

public class clientSearchButton extends DBbutton{
	clientNorthBlock parent;
	Connection conn = null;
	PreparedStatement stmt = null;
	clientSearchButton(clientNorthBlock p)
	{
		parent=p;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded!");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("找不到驅動程式類別");
			e.printStackTrace();
		}
		
		this.setLabel("開始查詢");
	}
	
	private Connection getConnection() throws SQLException {
		  String serverName = "localhost";
		  String database = "StockDB";
		  String url = "jdbc:mysql://" + serverName + "/" + database;
		  String user = "root";
		  String password = "1234";
		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StockDB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","1234");
		  return conn;
	}
	
	public void doSomthing()
	{
		try
		{
			   conn = getConnection();
			   String sql;
	           sql = "SELECT * FROM customers";
	           ResultSet rs = null;
	           int flag=0;
	           String str=parent.plateTextArea.getText();
	           
	           if(str.length()==0)
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM customers ORDER BY last_time");
	        	   rs = stmt.executeQuery();
	        	   
	           }
	           else
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM customers WHERE license_plate = ?");
	        	   stmt.setString(1,(String)parent.plateTextArea.getText());
	        	   rs = stmt.executeQuery();
	           }
	           parent.parent.clresult.reTextArea.setText("");
	           while (rs.next())
	           {
	        	   	String license_plate  = rs.getString("license_plate");
		            String mileages = rs.getString("mileages");
		            String phone_number = rs.getString("phone_number");
		            String last_time = rs.getString("last_time");
	                
	                if(flag==0)
	                {
	                	parent.parent.clresult.reTextArea.setText(license_plate + " " + mileages + " " + phone_number  + " " + last_time);
	                	flag=1;
	                }
	                else
	                	parent.parent.clresult.reTextArea.setText(parent.parent.clresult.reTextArea.getText()+ "\n" +license_plate + " " + mileages + " " + phone_number  + " " + last_time);
	                
	                System.out.print(license_plate+" ");
		            System.out.print(mileages+" ");
		            System.out.print(phone_number+" ");
		            System.out.print(last_time+" ");
		            System.out.print("\n");
	           }
	           rs.close();
	           stmt.close();
	           conn.close();
	           parent.parent.repaint();
		} 
		catch (SQLException e)
		{
			   e.printStackTrace();
		}
	}
}
