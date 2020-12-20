package StockDB;

import java.sql.*;
import java.time.*;
import java.time.format.*;

public class enterButton extends DBbutton {
	Connection conn = null;
	PreparedStatement stmt = null;
	buttonBlock parent;
	enterButton(buttonBlock p)
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
		
		this.setLabel("確定輸入");
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
		try
		{
			   conn = getConnection();
			   String sql;
	           sql = "INSERT INTO tires(brand,model,size,amount,action,in_warehouse_time)VALUES(?,?,?,?,?,?)";
	           String time=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	           
	           if(parent.parent.parent.noBlock.comboBox4.actionComboBox.getSelectedItem()!="請選擇動作")
	           {
	        	   stmt=conn.prepareStatement("INSERT INTO tires(brand,size,model,amount,action,in_warehouse_time)VALUES(?,?,?,?,?,?)");
	        	   stmt.setString(1,(String)parent.parent.parent.noBlock.comboBox1.brandComboBox.getSelectedItem());
	        	   stmt.setString(3,(String)parent.parent.parent.noBlock.comboBox2.typeComboBox.getSelectedItem());
	        	   stmt.setString(2,(String)parent.parent.parent.noBlock.comboBox3.sizeComboBox.getSelectedItem());
	        	   stmt.setString(4,parent.parent.inTextArea.inTextArea.getText());
	        	   stmt.setString(5,(String)parent.parent.parent.noBlock.comboBox4.actionComboBox.getSelectedItem());
	        	   stmt.setString(6,time);
	        	   stmt.executeUpdate();
	        	   parent.parent.parent.hiTextArea.history();
	           }
	           stmt.close();
	           conn.close();
	           parent.parent.parent.repaint();
		} 
		catch (SQLException e)
		{
			   e.printStackTrace();
		}
	}
}
