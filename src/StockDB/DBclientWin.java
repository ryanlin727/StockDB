package StockDB;

import java.awt.*;
import javax.swing.*;

public class DBclientWin extends JPanel {
	tabPanel parent;
	clientCenterBlock clcenter; 
	clientNorthBlock clnorth;
	clientresult clresult;
	DBclientWin(tabPanel p)
	{
		parent=p;
		
		clnorth=new clientNorthBlock(this);
		this.add(clnorth, BorderLayout.NORTH);
		
		clcenter = new clientCenterBlock(this);
		this.add(clcenter, BorderLayout.CENTER);
		
		clresult = new clientresult(this);
		this.add(clresult.jScrollPane, BorderLayout.SOUTH);
	}
}
