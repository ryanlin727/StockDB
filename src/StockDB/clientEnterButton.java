package StockDB;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class clientEnterButton extends DBbutton{
	clientCenterBlock parent;
	Connection conn = null;
	PreparedStatement stmt = null;
	clientEnterButton(clientCenterBlock p)
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
		
		this.setLabel("更新資料");
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
	           sql = "UPDATE customers SET mileages = ? WHERE license_plate = ?";
	           String time=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	           String str=parent.mileTextArea.getText();
	           
	           if(str.length()!=0)
	           {
	        	   stmt=conn.prepareStatement("UPDATE customers SET mileages = ? , last_time = ? WHERE license_plate = ?");
	        	   stmt.setString(1,(String)parent.mileTextArea.getText());
	        	   stmt.setString(2,time);
	        	   stmt.setString(3,(String)parent.parent.clnorth.plateTextArea.getText());
	        	   stmt.executeUpdate();
	        	   parent.parent.clresult.client();
	           }
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
