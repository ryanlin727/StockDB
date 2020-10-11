package StockDB;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JComboBox;

public class DBmainWin extends Frame {
	Dimension size=new Dimension(500,330);
	public DBcomboBox comboBox;
	public centerBlock ceBlock;
	public historyTextArea hiTextArea;
	DBmainWin()
	{
		this.setSize(size);
		comboBox=new DBcomboBox();
		
		this.setLayout(new BorderLayout());
		this.add(comboBox, BorderLayout.NORTH);
		
		ceBlock=new centerBlock();
		this.add(ceBlock, BorderLayout.CENTER);
		
		hiTextArea = new historyTextArea();
		this.add(hiTextArea, BorderLayout.SOUTH);
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		this.setBackground(Color.gray);
		this.setTitle("庫存紀錄系統");
		this.setVisible(true);
	}


}
