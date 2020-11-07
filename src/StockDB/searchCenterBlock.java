package StockDB;

import java.awt.*;

public class searchCenterBlock extends Panel {
	public searchButton srButton;
	
	searchCenterBlock()
	{
		this.setLayout(new FlowLayout());
		srButton = new searchButton();
		this.add(srButton);
	}
}
