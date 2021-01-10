package StockDB;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class clientresult{
	DBclientWin parent;
	JTextArea reTextArea = new JTextArea(10,50);
	JScrollPane jScrollPane = new JScrollPane(reTextArea);
	Connection conn = null;
	PreparedStatement stmt = null;
	clientresult(DBclientWin p)
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
		
		reTextArea.setLineWrap(true);
		reTextArea.setText("客戶資料");
		reTextArea.setEditable(false);
		
		client();
	    
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
	
	public void client() {
		try
	    {
	    	conn = getConnection();
	    	ResultSet rs = null;
			stmt=conn.prepareStatement("SELECT * FROM customers ORDER BY last_time DESC");
			rs=stmt.executeQuery();
			int flag=0;
			
			this.reTextArea.setText("");
	        while (rs.next())
	        {
	        	String license_plate  = rs.getString("license_plate");
	            String mileages = rs.getString("mileages");
	            String phone_number = rs.getString("phone_number");
	            String last_time = rs.getString("last_time");
	            if(flag==0)
	            {
	            	this.reTextArea.setText(license_plate + " " + mileages + " " + phone_number  + " " + last_time);
	            	flag=1;
	            }
	            else
	            	this.reTextArea.setText(this.reTextArea.getText()+ "\n" +license_plate + " " + mileages + " " + phone_number  + " " + last_time);
	            System.out.print(license_plate+" ");
	            System.out.print(mileages+" ");
	            System.out.print(phone_number+" ");
	            System.out.print(last_time+" ");
	            System.out.print("\n");
	        }
			
		} catch (SQLException e) 
	    {
			e.printStackTrace();
		}
	}
}



