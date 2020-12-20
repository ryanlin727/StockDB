package StockDB;

import java.awt.event.*;

import javax.swing.JTextArea;

public class clearButton extends DBbutton{
	buttonBlock parent;
	clearButton(buttonBlock p)
	{
		parent=p;
		this.setLabel("清除輸入");	
	}
	public void doSomthing() {
		parent.parent.parent.noBlock.comboBox1.brandComboBox.setSelectedIndex(0);
		parent.parent.parent.noBlock.comboBox2.typeComboBox.setSelectedIndex(0);
		parent.parent.parent.noBlock.comboBox3.sizeComboBox.setSelectedIndex(0);
		parent.parent.parent.noBlock.comboBox4.actionComboBox.setSelectedIndex(0);
		parent.parent.inTextArea.inTextArea.setText("請在此輸入數量");
		parent.parent.parent.repaint();
	}		 
}
