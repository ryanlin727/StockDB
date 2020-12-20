package StockDB;

import java.awt.*;
import javax.swing.*;

public class inputTextArea{
	JTextArea inTextArea = new JTextArea();
	centerBlock parent;
	inputTextArea(centerBlock p)
	{
		parent=p;
		
		inTextArea.setText("請在此輸入數量");
	}
}
