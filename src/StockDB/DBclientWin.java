package StockDB;

import java.awt.*;
import javax.swing.*;

public class DBclientWin extends JPanel {
	public clientButton clButton;
	DBclientWin()
	{
		JTextArea inTextArea = new JTextArea();
		inTextArea.setLineWrap(true);
		inTextArea.setText("請在此輸入客戶資料");
		inTextArea.setSize(400,50);
		this.add(inTextArea, BorderLayout.NORTH);
		
		clButton = new clientButton();
		this.add(clButton, BorderLayout.CENTER);
		
		JTextArea reTextArea = new JTextArea();
		reTextArea.setLineWrap(true);
		reTextArea.setText("客戶資料\n\n\n\n\n\n\n\n\n\n");
		reTextArea.setSize(470,50);
		this.add(reTextArea, BorderLayout.SOUTH);
	}
}
