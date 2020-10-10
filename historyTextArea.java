package StockDB;

import java.awt.Panel;

import javax.swing.*;

public class historyTextArea extends Panel {
	historyTextArea()
	{
		JTextArea jTextArea = new JTextArea();
	    jTextArea.setLineWrap(true);
	    JScrollPane jScrollPane = new JScrollPane(jTextArea);
	    jTextArea.setText("¾ú¥v10µ§¿é¤J¬ö¿ý");
	    
	    this.add(jTextArea);
	}
}
