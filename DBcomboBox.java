
package StockDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DBcomboBox extends Panel{
	DBcomboBox()
	{
		JComboBox typeComboBox = new JComboBox();
		typeComboBox.addItem("型號選擇");
		typeComboBox.addItem("型號1");
		typeComboBox.addItem("型號2");
	    
		JComboBox brandComboBox = new JComboBox();
		brandComboBox.addItem("廠牌選擇");
		brandComboBox.addItem("廠牌1");
		brandComboBox.addItem("廠牌2");
		
		JComboBox actionComboBox = new JComboBox();
		actionComboBox.addItem("動作選擇");
		actionComboBox.addItem("進貨");
		actionComboBox.addItem("出貨");
		
		this.setLayout(new GridLayout(2, 2));
		this.add(brandComboBox);
	    this.add(typeComboBox);
	    this.add(actionComboBox);
	}
}
