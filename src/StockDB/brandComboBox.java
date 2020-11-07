
package StockDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class brandComboBox extends Panel{
	public static String ComboBoxVal;
	public static JComboBox brandComboBox = new JComboBox();

	brandComboBox()
	{	
		brandComboBox.addItem("½Ð¿ï¾Ü¼tµP");
		
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
		
		
		this.setLayout(new FlowLayout());
		this.add(brandComboBox);

	}
	
}
