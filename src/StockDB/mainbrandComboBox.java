package StockDB;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import javax.swing.*;

public class mainbrandComboBox{
	String ComboBoxVal;
	JComboBox brandComboBox = new JComboBox();
	northBlock parent;
	
	mainbrandComboBox(northBlock p)
	{	
		parent=p;
		
		brandComboBox.addItem("½Ð¿ï¾Ü¼tµP");
		
		BufferedReader reader = null;
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
