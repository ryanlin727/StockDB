package StockDB;

import java.awt.*;

public class northBlock extends Panel {
	
		mainbrandComboBox comboBox1;
		maintypeComboBox comboBox2;
		mainsizeComboBox comboBox3;
		mainactionComboBox comboBox4;
		DBinputWin parent;
		northBlock(DBinputWin p)
		{
			parent=p;
			
			this.setLayout(new FlowLayout());
			
			comboBox1=new mainbrandComboBox(this);
			this.add(comboBox1.brandComboBox);
			comboBox2=new maintypeComboBox(this);
			this.add(comboBox2.typeComboBox);
			comboBox3=new mainsizeComboBox(this);
			this.add(comboBox3.sizeComboBox);
			comboBox4=new mainactionComboBox(this);
			this.add(comboBox4.actionComboBox);
		}
		
}
