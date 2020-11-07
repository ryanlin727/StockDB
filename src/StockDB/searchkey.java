package StockDB;

import java.awt.*;
import javax.swing.*;

public class searchkey extends Panel {
	searchkey()
	{
		JTextArea jTextArea = new JTextArea();
		jTextArea.setLineWrap(true);
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jTextArea.setSize(450,450);;
		jTextArea.setText("¿é¤J¬d¸ßÃöÁä¦r");
    
		this.add(jTextArea);
    }
}
