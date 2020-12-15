package StockDB;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class mainsizeComboBox extends Panel implements ItemListener {
	public String ComboBoxVal;
	public static JComboBox sizeComboBox = new JComboBox();
	mainsizeComboBox()
	{
		StockDB.maintypeComboBox.typeComboBox.addItemListener(this); 
		sizeComboBox.removeAllItems();
		sizeComboBox.addItem("請選擇尺寸");
		
		this.setLayout(new FlowLayout());
		this.add(sizeComboBox);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			String itemSize = (String) e.getItem();
			if(StockDB.maintypeComboBox.typeComboBox.getSelectedItem()!="請選擇系列")
			{
				try
				{
					BufferedReader reader = null;

					ComboBoxVal = (String) StockDB.maintypeComboBox.typeComboBox.getSelectedItem();

					sizeComboBox.removeAllItems();
					sizeComboBox.addItem("請選擇尺寸");

					try{
						reader = new BufferedReader(new InputStreamReader(new FileInputStream("./"+StockDB.maintypeComboBox.ComboBoxVal+"/"+ComboBoxVal+".txt"),"UTF-8"));
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
