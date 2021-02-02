
package f1TyreStrategy;

import javax.swing.*;

public class f1frame {

	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame("F1 Graphic");
		frame.setDefaultCloseOperation(3);
		frame.getContentPane().add(new f1panel());
		frame.setSize(500,500);
		frame.setVisible(true);
		

	}

}
