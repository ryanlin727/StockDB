package StockDB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DBsearchWin extends JPanel {
	public searchresult srresult;
	public searchkey srkey; //�ۦ��J����r������
	public searchCenterBlock srcenter; 
	public searchNorthBlock srnorth;//�ثe�ϥΤU�ԬO����ܬd��
	
	public DBsearchWin()
	{	
//		srkey = new searchkey();
//		this.add(srkey, BorderLayout.NORTH);
		
		srnorth=new searchNorthBlock();
		this.add(srnorth, BorderLayout.NORTH);
		
		srcenter = new searchCenterBlock();
		this.add(srcenter, BorderLayout.CENTER);
		
		srresult = new searchresult();
		this.add(srresult, BorderLayout.SOUTH);

	}
}
