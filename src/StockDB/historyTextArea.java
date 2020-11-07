package StockDB;

import java.awt.*;
import javax.swing.*;

public class historyTextArea extends Panel {
	historyTextArea()
	{
		JTextArea jTextArea = new JTextArea();
	    jTextArea.setLineWrap(true);
	    JScrollPane jScrollPane = new JScrollPane(jTextArea);
	    jTextArea.setSize(450,450);;
	    jTextArea.setText("¾ú¥v¿é¤J¬ö¿ý\n\n\n\n\n\n\n\n\n");
	    
	    this.add(jTextArea);
	}
}
