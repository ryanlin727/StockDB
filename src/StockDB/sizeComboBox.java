package StockDB;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class sizeComboBox implements ItemListener{
	String ComboBoxVal;
	JComboBox sizeComboBox = new JComboBox();
	searchNorthBlock parent;
	sizeComboBox(searchNorthBlock p)
	{
		parent=p;
		
		parent.comboBox2.typeComboBox.addItemListener(this); 
		sizeComboBox.removeAllItems();
		sizeComboBox.addItem("請選擇尺寸");
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			String itemSize = (String) e.getItem();
			if(parent.comboBox2.typeComboBox.getSelectedItem()!="請選擇系列")
			{
				try
				{
					BufferedReader reader = null;

					ComboBoxVal = (String) parent.comboBox2.typeComboBox.getSelectedItem();

					sizeComboBox.removeAllItems();
					sizeComboBox.addItem("請選擇尺寸");

					try{
						reader = new BufferedReader(new InputStreamReader(new FileInputStream("./"+parent.comboBox2.ComboBoxVal+"/"+ComboBoxVal+".txt"),"UTF-8"));
						String str = null;
						while ((str = reader.readLine()) != null) 
						{
							sizeComboBox.addItem(str);
						}
					} catch (FileNotFoundException event) {
						event.printStackTrace();
					} catch (IOException event) {
						event.printStackTrace();
					} finally {
						try {
							reader.close();
						} catch (IOException event) {
							event.printStackTrace();
						}
					}
				}
				catch(Exception ex){}  
			}
			else
			{
				sizeComboBox.removeAllItems();
				sizeComboBox.addItem("請選擇尺寸");
			}
		}  
	}
}
