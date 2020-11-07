package StockDB;

import java.awt.*;

public class centerBlock extends Panel {
	public buttonBlock btnBlock;
	public inputTextArea inTextArea;
	
	centerBlock()
	{
		
		this.setLayout(new BorderLayout());
		btnBlock=new buttonBlock();
		this.add(btnBlock, BorderLayout.SOUTH);
		
		inTextArea = new inputTextArea();
		this.add(inTextArea, BorderLayout.CENTER);
		
		
	}
}
