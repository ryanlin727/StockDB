package StockDB;

import java.awt.*;

import javax.swing.*;

public class mainactionComboBox {

	JComboBox actionComboBox = new JComboBox();
	northBlock parent;
	mainactionComboBox(northBlock p)
	{
		parent=p;
		
		actionComboBox.addItem("請選擇動作");
		actionComboBox.addItem("出售");
		actionComboBox.addItem("進貨");
		actionComboBox.addItem("出借");
		actionComboBox.addItem("還貨");

	}
}
