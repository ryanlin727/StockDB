package StockDB;

import java.awt.*;
import javax.swing.*;

public class inputTextArea extends Panel {
	inputTextArea()
	{
		JTextArea inTextArea = new JTextArea();
		inTextArea.setLineWrap(true);
		inTextArea.setText("請在此輸入數量");
    
		this.add(inTextArea);
	}
}
