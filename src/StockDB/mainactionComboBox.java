package StockDB;

import java.awt.*;

import javax.swing.*;

public class mainactionComboBox extends Panel {

	public static JComboBox actionComboBox = new JComboBox();
	mainactionComboBox()
	{
		
		actionComboBox.addItem("�п�ܰʧ@");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�i�f");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�ٳf");
		
		this.setLayout(new FlowLayout());
		this.add(actionComboBox);
	}
}
