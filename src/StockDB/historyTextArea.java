package StockDB;

import java.awt.Panel;

import javax.swing.*;

public class historyTextArea extends Panel {
	historyTextArea()
	{
		JTextArea jTextArea = new JTextArea();
	    jTextArea.setLineWrap(true);
	    JScrollPane jScrollPane = new JScrollPane(jTextArea);
	    jTextArea.setText("歷史10筆輸入紀錄");
	    
	    this.add(jTextArea);
	}
}
