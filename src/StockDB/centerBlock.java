package StockDB;

import java.awt.*;

public class centerBlock extends Panel {
	public buttonBlock btnBlock;
	public inputTextArea inTextArea;
	DBinputWin parent;
	centerBlock(DBinputWin p)
	{
		parent=p;
		
		this.setLayout(new BorderLayout());
		btnBlock=new buttonBlock(this);
		this.add(btnBlock, BorderLayout.SOUTH);
		
		inTextArea = new inputTextArea(this);
		this.add(inTextArea.inTextArea, BorderLayout.CENTER);
		
		
	}
}
