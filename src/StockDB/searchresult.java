package StockDB;

import java.awt.*;
import javax.swing.*;

public class searchresult{
	JTextArea jTextArea = new JTextArea(10,50);
	JScrollPane jScrollPane = new JScrollPane(jTextArea);
	DBsearchWin parent;
	searchresult(DBsearchWin p)
	{
		parent=p;
		
		jScrollPane.setBounds(10,10,200,100);
	    jTextArea.setLineWrap(true);
	    jTextArea.setText("¬d¸ßµ²ªG");
	    jTextArea.setEditable(false);
	    
	}
}



