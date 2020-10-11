package StockDB;

import java.awt.*;

public class buttonBlock extends Panel{
	public enterButton enButton;
	public clearButton clButton;
	buttonBlock()
	{
		this.setLayout(new FlowLayout());
		enButton = new enterButton();
		this.add(enButton);
		clButton = new clearButton();
		this.add(clButton);
	}
}
