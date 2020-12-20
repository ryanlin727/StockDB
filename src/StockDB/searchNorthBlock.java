package StockDB;

import java.awt.*;

public class searchNorthBlock extends Panel {

	brandComboBox comboBox1;
	typeComboBox comboBox2;
	sizeComboBox comboBox3;
	actionComboBox comboBox4;
	DBsearchWin parent;
	
	searchNorthBlock(DBsearchWin p)
	{
		parent=p;
		this.setLayout(new FlowLayout());
		
		comboBox1=new brandComboBox(this);
		this.add(comboBox1.brandComboBox);
		comboBox2=new typeComboBox(this);
		this.add(comboBox2.typeComboBox);
		comboBox3=new sizeComboBox(this);
		this.add(comboBox3.sizeComboBox);
		comboBox4=new actionComboBox(this);
		this.add(comboBox4.actionComboBox);
	}
}
