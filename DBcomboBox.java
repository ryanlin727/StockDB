
package StockDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DBcomboBox extends Panel{
	DBcomboBox()
	{
		JComboBox typeComboBox = new JComboBox();
		typeComboBox.addItem("�������");
		typeComboBox.addItem("����1");
		typeComboBox.addItem("����2");
	    
		JComboBox brandComboBox = new JComboBox();
		brandComboBox.addItem("�t�P���");
		brandComboBox.addItem("�t�P1");
		brandComboBox.addItem("�t�P2");
		
		JComboBox actionComboBox = new JComboBox();
		actionComboBox.addItem("�ʧ@���");
		actionComboBox.addItem("�i�f");
		actionComboBox.addItem("�X�f");
		
		this.setLayout(new GridLayout(2, 2));
		this.add(brandComboBox);
	    this.add(typeComboBox);
	    this.add(actionComboBox);
	}
}
