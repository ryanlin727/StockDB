package StockDB;

import java.awt.*;
import javax.swing.*;

public class searchresult extends Panel {
	searchresult()
	{
		JTextArea jTextArea = new JTextArea();
	    jTextArea.setLineWrap(true);
	    JScrollPane jScrollPane = new JScrollPane(jTextArea);
	    jTextArea.setSize(450,450);;
	    jTextArea.setText("¬d¸ßµ²ªG\n\n\n\n\n\n\n\n\n");
	    
	    this.add(jTextArea);
	}
}



