package StockDB;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class DBinputWin extends JPanel {

	centerBlock ceBlock;
	northBlock noBlock;
	historyTextArea hiTextArea;
	tabPanel parent;
	DBinputWin(tabPanel p)
	{
		parent=p;
		
		noBlock=new northBlock(this);
		this.add(noBlock, BorderLayout.NORTH);
		
		ceBlock=new centerBlock(this);
		this.add(ceBlock, BorderLayout.CENTER);
		
		hiTextArea = new historyTextArea(this);
		this.add(hiTextArea.jScrollPane, BorderLayout.SOUTH);
	}
}
