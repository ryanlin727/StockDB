package StockDB;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JComboBox;

public class DBmainWin extends Frame {
	Dimension size=new Dimension(500,500);
	public DBcomboBox comboBox;
	public enterButton enButton;
	public clearButton clButton;
	public historyTextArea hiTextArea;
	DBmainWin()
	{
		this.setSize(size);
		comboBox=new DBcomboBox();
		
		this.setLayout(new FlowLayout());
		this.add(comboBox);
		
		enButton = new enterButton();
		this.add(enButton);
		clButton = new clearButton();
		this.add(clButton);
		
		hiTextArea = new historyTextArea();
		this.add(hiTextArea);
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		this.setTitle("庫存紀錄系統");
		this.setVisible(true);
	}


}
