package StockDB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DBsearchWin extends JPanel {
	searchresult srresult;
	searchCenterBlock srcenter; 
	searchNorthBlock srnorth;
	tabPanel parent;
	public DBsearchWin(tabPanel p)
	{	
		parent=p;
		
		srnorth=new searchNorthBlock(this);
		this.add(srnorth, BorderLayout.NORTH);
		
		srcenter = new searchCenterBlock(this);
		this.add(srcenter, BorderLayout.CENTER);
		
		srresult = new searchresult(this);
		this.add(srresult.jScrollPane, BorderLayout.SOUTH);

	}
}
