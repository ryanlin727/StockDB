
package StockDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class brandComboBox{
	String ComboBoxVal;
	JComboBox brandComboBox = new JComboBox();
	searchNorthBlock parent;
	brandComboBox(searchNorthBlock p)
	{	
		parent=p;
		
		brandComboBox.addItem("�п�ܼt�P");
		
		BufferedReader reader = null;// https://dotblogs.com.tw/cylcode/2018/09/21/170510
		try{
		  reader = new BufferedReader(new InputStreamReader(new FileInputStream("./brand.txt"),"UTF-8"));
		  String str = null;
		  while ((str = reader.readLine()) != null) 
		  {
			brandComboBox.addItem(str);
		  }
		} catch (FileNotFoundException e) {
		  e.printStackTrace();
		} catch (IOException e) {
		  e.printStackTrace();
		} finally {
		  try {
		    reader.close();
		  } catch (IOException e) {
		    e.printStackTrace();
		  }
		}
	}
	
}
