package StockDB;

import java.awt.*;
import javax.swing.*;

public class actionComboBox extends Panel {
	actionComboBox()
	{
		JComboBox actionComboBox = new JComboBox();
		actionComboBox.addItem("�п�ܰʧ@");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�i�f");
		actionComboBox.addItem("�X��");
		actionComboBox.addItem("�ٳf");
		
		this.setLayout(new FlowLayout());
		this.add(actionComboBox);
	}
}
