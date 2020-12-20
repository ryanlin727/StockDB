package StockDB;

import java.awt.*;
import javax.swing.*;

public class actionComboBox{
	JComboBox actionComboBox = new JComboBox();
	searchNorthBlock parent;
	actionComboBox(searchNorthBlock p)
	{
		parent=p;
		
		actionComboBox.addItem("請選擇動作");
		actionComboBox.addItem("出售");
		actionComboBox.addItem("進貨");
		actionComboBox.addItem("出借");
		actionComboBox.addItem("還貨");

	}
}
