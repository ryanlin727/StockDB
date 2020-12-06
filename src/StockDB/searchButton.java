package StockDB;

import java.sql.*;

public class searchButton extends DBbutton {
	public static Connection conn = null;
	public static PreparedStatement stmt = null;
	
	searchButton()
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
		
		
		
		this.setLabel("開始查詢");
	}
	
	private static Connection getConnection() throws SQLException {
		  String serverName = "localhost";
		  String database = "StockDB";
		  String url = "jdbc:mysql://" + serverName + "/" + database;
		  // 帳號和密碼
		  String user = "root";
		  String password = "1234";
		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StockDB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","1234");
		  return conn;
	}
	
	public void doSomthing() {
		try
		{
			   conn = getConnection();
			   String sql;
	           sql = "SELECT * FROM tires";
	           ResultSet rs = null;
	           
	           if(StockDB.brandComboBox.brandComboBox.getSelectedItem()=="請選擇廠牌")
	           {
	        	   StockDB.searchresult.jTextArea.setText("請選擇查詢條件");
	           }
	           else if(StockDB.typeComboBox.typeComboBox.getSelectedItem()=="請選擇系列")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? ");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(StockDB.sizeComboBox.sizeComboBox.getSelectedItem()=="請選擇尺寸")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? ");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)StockDB.typeComboBox.typeComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(StockDB.actionComboBox.actionComboBox.getSelectedItem()=="請選擇動作")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? AND size = ?");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)StockDB.typeComboBox.typeComboBox.getSelectedItem());
	        	   stmt.setString(3,(String)StockDB.sizeComboBox.sizeComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(StockDB.actionComboBox.actionComboBox.getSelectedItem()!="請選擇動作")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? AND size = ? AND action = ?");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)StockDB.typeComboBox.typeComboBox.getSelectedItem());
	        	   stmt.setString(3,(String)StockDB.sizeComboBox.sizeComboBox.getSelectedItem());
	        	   stmt.setString(4,(String)StockDB.actionComboBox.actionComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           StockDB.searchresult.jTextArea.setText("");
	           while (rs.next())
	           {
	        	   	String brand  = rs.getString("brand");
	                String size = rs.getString("size");
	                String model = rs.getString("model");
	                int amount = rs.getInt("amount");
	                String action = rs.getString("action");
	                String in_warehouse_time = rs.getString("in_warehouse_time");
	                
	                StockDB.searchresult.jTextArea.setText(StockDB.searchresult.jTextArea.getText()+ "\n" +brand + " " + size + " " + model + " " + amount + " " + action + " " + in_warehouse_time);
	                System.out.print(brand+" ");
	                System.out.print(size+" ");
	                System.out.print(model+" ");
	                System.out.print(amount+" ");
	                System.out.print(action+" ");
	                System.out.print(in_warehouse_time+" ");
	                System.out.print("\n");
	           }
	           /*while(rs.next()){
	                String brand  = rs.getString("brand");
	                String size = rs.getString("size");
	                String model = rs.getString("model");
	                int amount = rs.getInt("amount");
	                String action = rs.getString("action");
	                String in_warehouse_time = rs.getString("in_warehouse_time");
	    
	                System.out.print(brand+" ");
	                System.out.print(size+" ");
	                System.out.print(model+" ");
	                System.out.print(amount+" ");
	                System.out.print(action+" ");
	                System.out.print(in_warehouse_time+" ");
	                System.out.print("\n");
	            }*/
	            rs.close();
	            stmt.close();
	            conn.close();
		} 
		catch (SQLException e)
		{
			   e.printStackTrace();
		}
	}
	
}


