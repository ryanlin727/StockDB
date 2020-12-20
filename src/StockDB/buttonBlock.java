package StockDB;

import java.awt.*;

public class buttonBlock extends Panel{
	enterButton enButton;
	clearButton clButton;
	centerBlock parent;
	buttonBlock(centerBlock p)
	{
		parent=p;
		this.setLayout(new FlowLayout());
		enButton = new enterButton(this);
		this.add(enButton);
		clButton = new clearButton(this);
		this.add(clButton);
	}
}
