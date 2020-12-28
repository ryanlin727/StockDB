package StockDB;

import java.awt.*;

import javax.swing.JTextArea;

public class clientCenterBlock extends Panel {
	DBclientWin parent;
	clientEnterButton clenButton;
	JTextArea mileTextArea = new JTextArea(1,50);
	clientCenterBlock(DBclientWin p)
	{
		parent=p;
		
		mileTextArea.setLineWrap(true);
		mileTextArea.setText("請在此輸入里程");
		this.add(mileTextArea, BorderLayout.SOUTH);
		
		clenButton = new clientEnterButton(this);
		this.add(clenButton);
	}
}
