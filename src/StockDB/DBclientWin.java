package StockDB;

import java.awt.*;
import javax.swing.*;

public class DBclientWin extends JPanel {
	clientButton clButton;
	DBclientWin()
	{
		JTextArea inTextArea = new JTextArea(1,50);
		inTextArea.setLineWrap(true);
		inTextArea.setText("�Цb����J�Ȥ���");
		this.add(inTextArea, BorderLayout.NORTH);
		
		clButton = new clientButton(this);
		this.add(clButton, BorderLayout.CENTER);
		
		JTextArea reTextArea = new JTextArea(10,50);
		JScrollPane jScrollPane = new JScrollPane(reTextArea);
		reTextArea.setLineWrap(true);
		reTextArea.setText("�Ȥ���");
		reTextArea.setEditable(false);

		this.add(jScrollPane, BorderLayout.SOUTH);
	}
}
