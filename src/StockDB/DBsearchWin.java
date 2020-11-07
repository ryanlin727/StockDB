package StockDB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DBsearchWin extends JPanel {
	public searchresult srresult;
	public searchkey srkey; //自行輸入關鍵字的版本
	public searchCenterBlock srcenter; 
	public searchNorthBlock srnorth;//目前使用下拉是選單選擇查詢
	
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
