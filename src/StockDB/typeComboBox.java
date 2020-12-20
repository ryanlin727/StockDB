package StockDB;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class typeComboBox implements ItemListener {
	String ComboBoxVal;
	JComboBox typeComboBox = new JComboBox();
	searchNorthBlock parent;
	typeComboBox(searchNorthBlock p)
	{
		parent=p;
		
		parent.comboBox1.brandComboBox.addItemListener(this); 
		typeComboBox.removeAllItems();
		typeComboBox.addItem("請選擇系列");
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			String itemSize = (String) e.getItem();
			if(parent.comboBox1.brandComboBox.getSelectedItem()!="請選擇廠牌")
			{
				try
				{
					BufferedReader reader = null;
					typeComboBox.removeAllItems();
					typeComboBox.addItem("請選擇系列");
					ComboBoxVal = (String) parent.comboBox1.brandComboBox.getSelectedItem();
					try{
						reader = new BufferedReader(new InputStreamReader(new FileInputStream("./"+ComboBoxVal+"/type.txt"),"UTF-8"));
						String str = null;
						while ((str = reader.readLine()) != null) 
						{
							typeComboBox.addItem(str);
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
				typeComboBox.removeAllItems();
				typeComboBox.addItem("請選擇系列");
			}
		}
		
	}
}
