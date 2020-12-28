package StockDB;

import java.awt.*;

import javax.swing.JTextArea;

public class clientNorthBlock extends Panel {
	DBclientWin parent;
	clientSearchButton clsrButton;
	JTextArea plateTextArea = new JTextArea(1,50);
	clientNorthBlock(DBclientWin p)
	{
		parent=p;
		
		plateTextArea.setLineWrap(true);
		plateTextArea.setText("請在此輸入車牌");
		this.add(plateTextArea);
		
		clsrButton = new clientSearchButton(this);
		this.add(clsrButton);
	}
}
