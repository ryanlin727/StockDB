package StockDB;

import java.awt.*;

import javax.swing.*;

public class mainactionComboBox {

	JComboBox actionComboBox = new JComboBox();
	northBlock parent;
	mainactionComboBox(northBlock p)
	{
		parent=p;
		
		actionComboBox.addItem("�п�ܰʧ@");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�i�f");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�ٳf");

	}
}
