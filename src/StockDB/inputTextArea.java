package StockDB;

import java.awt.*;
import javax.swing.*;

public class inputTextArea extends Panel {
	public static JTextArea inTextArea = new JTextArea();
	inputTextArea()
	{
		inTextArea.setText("請在此輸入數量");
    
		this.add(inTextArea);
	}
}
