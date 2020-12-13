package StockDB;

import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class historyTextArea extends Panel {
	public static JTextArea jTextArea = new JTextArea(10,50);
	public static JScrollPane jScrollPane = new JScrollPane(jTextArea);
	
	public static Connection conn = null;
	public static PreparedStatement stmt = null;
	
	historyTextArea()
	{
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
		
		jScrollPane.setBounds(10,10,200,100);
	    jTextArea.setLineWrap(true);
	    jTextArea.setText("歷史輸入紀錄");
	    
	    history();
	    
	    
	    
	    this.add(jScrollPane);
	}

	private static Connection getConnection() throws SQLException {
		  String serverName = "localhost";
		  String database = "StockDB";
		  String url = "jdbc:mysql://" + serverName + "/" + database;
		  String user = "root";
		  String password = "1234";
		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StockDB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","1234");
		  return conn;
	}
	
	public static void history() {
		try
	    {
	    	conn = getConnection();
	    	ResultSet rs = null;
			stmt=conn.prepareStatement("SELECT * FROM tires ORDER BY in_warehouse_time DESC limit 10");
			rs=stmt.executeQuery();
			int flag=0;
			
			StockDB.historyTextArea.jTextArea.setText("");
	        while (rs.next())
	        {
	        	String brand  = rs.getString("brand");
	            String model = rs.getString("model");
	            String size = rs.getString("size");
	            int amount = rs.getInt("amount");
	            String action = rs.getString("action");
	            String in_warehouse_time = rs.getString("in_warehouse_time");
	            if(flag==0)
	            {
	            	StockDB.historyTextArea.jTextArea.setText(brand + " " + size + " " + model + " " + amount + " " + action + " " + in_warehouse_time);
	            	flag=1;
	            }
	            else
	            	StockDB.historyTextArea.jTextArea.setText(StockDB.historyTextArea.jTextArea.getText()+ "\n" +brand + " " + size + " " + model + " " + amount + " " + action + " " + in_warehouse_time);
	            System.out.print(brand+" ");
	            System.out.print(size+" ");
	            System.out.print(model+" ");
	            System.out.print(amount+" ");
	            System.out.print(action+" ");
	            System.out.print(in_warehouse_time+" ");
	            System.out.print("\n");
	        }
			
		} catch (SQLException e) 
	    {
			e.printStackTrace();
		}
	}
}