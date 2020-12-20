package StockDB;

import java.awt.*;

public class searchCenterBlock extends Panel {
	searchButton srButton;
	DBsearchWin parent;
	searchCenterBlock(DBsearchWin p)
	{
		parent=p;
		
		this.setLayout(new FlowLayout());
		srButton = new searchButton(this);
		this.add(srButton);
	}
}
