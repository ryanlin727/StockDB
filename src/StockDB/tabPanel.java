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
		Tab.add("��J�Ҧ�",new DBinputWin());
	    Tab.add("�d�߼Ҧ�",new DBsearchWin());
	    Tab.add("�Ȥ���",new JPanel());
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
