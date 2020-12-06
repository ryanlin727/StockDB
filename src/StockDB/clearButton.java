package StockDB;

import java.awt.event.*;

import javax.swing.JTextArea;

public class clearButton extends DBbutton{
	buttonBlock parent;
//	mainbrandComboBox parent;
	clearButton(buttonBlock p)
	{
		parent=p;
		this.setLabel("²M°£¿é¤J");	
	}
	public void doSomthing() {
		StockDB.mainbrandComboBox.brandComboBox.setSelectedIndex(0);
		StockDB.mainsizeComboBox.sizeComboBox.setSelectedIndex(0);
		StockDB.maintypeComboBox.typeComboBox.setSelectedIndex(0);
		StockDB.mainactionComboBox.actionComboBox.setSelectedIndex(0);
		StockDB.inputTextArea.inTextArea.setText("");
	}		 
}
