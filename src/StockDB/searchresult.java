package StockDB;

import java.awt.*;
import javax.swing.*;

public class searchresult extends Panel {
	public static JTextArea jTextArea = new JTextArea(10,50);
	public static JScrollPane jScrollPane = new JScrollPane(jTextArea);
	searchresult()
	{
		
		jScrollPane.setBounds(10,10,200,100);
	    jTextArea.setLineWrap(true);
	    jTextArea.setText("¬d¸ßµ²ªG");
	    
	    this.add(jScrollPane);
	}
}



