package StockDB;

import java.awt.*;
import javax.swing.*;

public class actionComboBox{
	JComboBox actionComboBox = new JComboBox();
	searchNorthBlock parent;
	actionComboBox(searchNorthBlock p)
	{
		parent=p;
		
		actionComboBox.addItem("�п�ܰʧ@");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�i�f");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�ٳf");

	}
}
