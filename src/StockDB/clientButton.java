package StockDB;

import java.awt.event.*;

public class clientButton extends DBbutton{
	clientButton()
	{
		this.setLabel("�T�w��J");
		this.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				doSomthing();
			}
		});
	}
	private void doSomthing()
	{
		
	}
}
