package StockDB;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class sizeComboBox extends Panel implements ItemListener{
	public String ComboBoxVal;
	public static JComboBox sizeComboBox = new JComboBox();
	sizeComboBox()
	{
		StockDB.typeComboBox.typeComboBox.addItemListener(this); 
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
			try
			{
				BufferedReader reader = null;
				
				ComboBoxVal = (String) StockDB.typeComboBox.typeComboBox.getSelectedItem();
				
				sizeComboBox.removeAllItems();
				sizeComboBox.addItem("請選擇尺寸");

				try{
					reader = new BufferedReader(new InputStreamReader(new FileInputStream("./"+StockDB.typeComboBox.ComboBoxVal+"/"+ComboBoxVal+".txt"),"UTF-8"));
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
	}
}
