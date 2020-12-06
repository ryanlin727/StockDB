package StockDB;

import java.awt.*;

public class northBlock extends Panel {
	
		public mainbrandComboBox comboBox1;
		public maintypeComboBox comboBox2;
		public mainsizeComboBox comboBox3;
		public mainactionComboBox comboBox4;
		northBlock()
		{
			this.setLayout(new FlowLayout());
			
			comboBox1=new mainbrandComboBox();
			this.add(comboBox1);
			comboBox2=new maintypeComboBox();
			this.add(comboBox2);
			comboBox3=new mainsizeComboBox();
			this.add(comboBox3);
			comboBox4=new mainactionComboBox();
			this.add(comboBox4);
		}
		
}
