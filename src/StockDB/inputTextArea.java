package StockDB;

import java.awt.*;
import javax.swing.*;

public class inputTextArea extends Panel {
	inputTextArea()
	{
		JTextArea inTextArea = new JTextArea();
		inTextArea.setLineWrap(true);
		inTextArea.setText("�Цb����J�ƶq");
    
		this.add(inTextArea);
	}
}
