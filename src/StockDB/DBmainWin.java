package StockDB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DBmainWin extends JFrame {
	Dimension size=new Dimension(600,380);
	tabPanel tabPanel;
	UI parent;
	DBmainWin(UI p)
	{
		parent=p;
		
		this.setSize(size);
		this.setLayout(new BorderLayout());
		
		tabPanel=new tabPanel(this);
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				DBmainWin.this.dispose();
			}
		});
		

		this.setBackground(Color.gray);
		this.setTitle("®w¦s¬ö¿ý¨t²Î");
		this.setVisible(true);

	}
}
