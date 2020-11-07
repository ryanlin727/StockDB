package StockDB;

import java.awt.*;

public class searchNorthBlock extends Panel {

	public brandComboBox comboBox1;
	public typeComboBox comboBox2;
	public sizeComboBox comboBox3;
	public static actionComboBox comboBox4;
	searchNorthBlock()
	{
		this.setLayout(new FlowLayout());
		
		comboBox1=new brandComboBox();
		this.add(comboBox1);
		comboBox2=new typeComboBox();
		this.add(comboBox2);
		comboBox3=new sizeComboBox();
		this.add(comboBox3);
		comboBox4=new actionComboBox();
		this.add(comboBox4);
	}
}
