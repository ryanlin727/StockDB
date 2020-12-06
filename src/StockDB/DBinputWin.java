package StockDB;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class DBinputWin extends JPanel {

	public centerBlock ceBlock;
	public northBlock noBlock;
	public historyTextArea hiTextArea;
	DBinputWin()
	{
		
		noBlock=new northBlock();
		this.add(noBlock, BorderLayout.NORTH);
		
		ceBlock=new centerBlock(this);
		this.add(ceBlock, BorderLayout.CENTER);
		
		hiTextArea = new historyTextArea();
		this.add(hiTextArea, BorderLayout.SOUTH);
	}
}
