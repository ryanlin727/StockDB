package StockDB;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
//http://yhhuang1966.blogspot.com/2014/05/java-swing-jtabbedpane.html
public class tabPanel implements ChangeListener {
	public JLabel currentTab;
	public JTabbedPane Tab;
	
	DBmainWin parent;
	tabPanel(DBmainWin p)
	{
		parent = p;
		JTabbedPane Tab=new JTabbedPane(JTabbedPane.TOP);
		Tab.add("輸入模式",new DBinputWin());
	    Tab.add("查詢模式",new DBsearchWin());
	    Tab.add("客戶資料",new JPanel());
	    Tab.addChangeListener(this);
	    
		Container cp=parent.getContentPane();

	    cp.add(Tab,BorderLayout.CENTER);
	    
	}


	public void stateChanged(ChangeEvent e) 
	{
		JTabbedPane Tab=(JTabbedPane) e.getSource();
		int index=Tab.getSelectedIndex();
	}
}
