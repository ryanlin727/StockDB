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
			System.out.println("�䤣���X�ʵ{�����O");
			e.printStackTrace();
		}
		
		this.setLabel("�}�l�d��");
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
	
	public void doSomthing() {
		int count = 0;
		
		try
		{
			   conn = getConnection();
			   String sql;
	           sql = "SELECT * FROM tires";
	           ResultSet rs = null;
	           int flag=0;
	           
	           if(StockDB.brandComboBox.brandComboBox.getSelectedItem()=="�п�ܼt�P")
	           {
	        	   StockDB.searchresult.jTextArea.setText("�п�ܬd�߱���");
	           }
	           else if(StockDB.typeComboBox.typeComboBox.getSelectedItem()=="�п�ܨt�C")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(StockDB.sizeComboBox.sizeComboBox.getSelectedItem()=="�п�ܤؤo")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)StockDB.typeComboBox.typeComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(StockDB.actionComboBox.actionComboBox.getSelectedItem()=="�п�ܰʧ@")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? AND size = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)StockDB.brandComboBox.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)StockDB.typeComboBox.typeComboBox.getSelectedItem());
	        	   stmt.setString(3,(String)StockDB.sizeComboBox.sizeComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(StockDB.actionComboBox.actionComboBox.getSelectedItem()!="�п�ܰʧ@")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? AND size = ? AND action = ? ORDER BY in_warehouse_time");
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
	                String model = rs.getString("model");
	                String size = rs.getString("size");
	                int amount = rs.getInt("amount");
	                String action = rs.getString("action");
	                String in_warehouse_time = rs.getString("in_warehouse_time");
	                
	                if(flag==0)
	                {
	                	StockDB.searchresult.jTextArea.setText(brand + " " + model + " " + size + " " + amount + " " + action + " " + in_warehouse_time);
	                	flag=1;
	                }
	                else
	                	StockDB.searchresult.jTextArea.setText(StockDB.searchresult.jTextArea.getText()+ "\n" +brand + " " + size + " " + model + " " + amount + " " + action + " " + in_warehouse_time);
	                
	                if(action.equals("�X��"))
	                	count-=amount;
	                else
	                	count+=amount;
	                
	                System.out.print(brand+" ");
	                System.out.print(model+" ");
	                System.out.print(size+" ");
	                System.out.print(amount+" ");
	                System.out.print(action+" ");
	                System.out.print(in_warehouse_time+" ");
	                System.out.print("\n");
	           }
	           StockDB.searchresult.jTextArea.setText(StockDB.searchresult.jTextArea.getText() + "\n" + "�����j�M�ŦX���󪺮w�s�q�٦�" + count);
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


