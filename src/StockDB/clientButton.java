package StockDB;

import java.awt.event.*;

public class clientButton extends DBbutton{
	clientButton()
	{
		this.setLabel("�}�l�d��");
		this.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				doSomthing();
			}
		});
	}
	public void doSomthing()
	{
		
	}
}
