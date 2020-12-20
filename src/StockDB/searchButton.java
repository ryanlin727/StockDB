package StockDB;

import java.sql.*;

public class searchButton extends DBbutton {
	Connection conn = null;
	PreparedStatement stmt = null;
	searchCenterBlock parent;
	searchButton(searchCenterBlock p)
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
	
	public void doSomthing() {
		int count = 0;
		
		try
		{
			   conn = getConnection();
			   String sql;
	           sql = "SELECT * FROM tires";
	           ResultSet rs = null;
	           int flag=0;
	           
	           if(parent.parent.srnorth.comboBox1.brandComboBox.getSelectedItem()=="請選擇廠牌")
	           {
	        	   parent.parent.srresult.jTextArea.setText("請選擇查詢條件");
	           }
	           else if(parent.parent.srnorth.comboBox2.typeComboBox.getSelectedItem()=="請選擇系列")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)parent.parent.srnorth.comboBox1.brandComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(parent.parent.srnorth.comboBox3.sizeComboBox.getSelectedItem()=="請選擇尺寸")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)parent.parent.srnorth.comboBox1.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)parent.parent.srnorth.comboBox2.typeComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(parent.parent.srnorth.comboBox4.actionComboBox.getSelectedItem()=="請選擇動作")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? AND size = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)parent.parent.srnorth.comboBox1.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)parent.parent.srnorth.comboBox2.typeComboBox.getSelectedItem());
	        	   stmt.setString(3,(String)parent.parent.srnorth.comboBox3.sizeComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           else if(parent.parent.srnorth.comboBox4.actionComboBox.getSelectedItem()!="請選擇動作")
	           {
	        	   stmt=conn.prepareStatement("SELECT * FROM tires WHERE brand = ? AND model = ? AND size = ? AND action = ? ORDER BY in_warehouse_time");
	        	   stmt.setString(1,(String)parent.parent.srnorth.comboBox1.brandComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)parent.parent.srnorth.comboBox2.typeComboBox.getSelectedItem());
	        	   stmt.setString(3,(String)parent.parent.srnorth.comboBox3.sizeComboBox.getSelectedItem());
	        	   stmt.setString(4,(String)parent.parent.srnorth.comboBox4.actionComboBox.getSelectedItem());
	        	   rs = stmt.executeQuery();
	           }
	           parent.parent.srresult.jTextArea.setText("");
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
	                	parent.parent.srresult.jTextArea.setText(brand + " " + model + " " + size + " " + amount + " " + action + " " + in_warehouse_time);
	                	flag=1;
	                }
	                else
	                	parent.parent.srresult.jTextArea.setText(parent.parent.srresult.jTextArea.getText()+ "\n" +brand + " " + model + " " + size + " " + amount + " " + action + " " + in_warehouse_time);
	                
	                if(action.equals("出售"))
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
	           parent.parent.srresult.jTextArea.setText(parent.parent.srresult.jTextArea.getText() + "\n" + "此次搜尋符合條件的庫存量還有" + count);
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


