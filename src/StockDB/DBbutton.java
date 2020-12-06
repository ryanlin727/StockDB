package StockDB;

import java.awt.*;
import java.awt.event.*;

public class DBbutton extends Button {
	DBbutton()
	{
		this.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				doSomthing();
			}
		});
	}

	public void doSomthing() {
		// TODO Auto-generated method stub
		
	}
}
