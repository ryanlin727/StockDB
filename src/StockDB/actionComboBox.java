package StockDB;

import java.awt.*;
import javax.swing.*;

public class actionComboBox extends Panel {
	actionComboBox()
	{
		JComboBox actionComboBox = new JComboBox();
		actionComboBox.addItem("請選擇動作");
		actionComboBox.addItem("出售");
		actionComboBox.addItem("進貨");
		actionComboBox.addItem("出借");
		actionComboBox.addItem("還貨");
		
		this.setLayout(new FlowLayout());
		this.add(actionComboBox);
	}
}
