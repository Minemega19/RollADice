import java.awt.*;

import javax.swing.*;

public class NorthClass extends JPanel{

	public NorthClass(){
		JRadioButton quatre = new JRadioButton();
		JRadioButton huit = new JRadioButton();
		JLabel quatreText = new JLabel("4");
		JLabel huitText = new JLabel("8");

		//this.setLayout(new BorderLayout());
		this.setLayout(new FlowLayout());
		this.add(quatre);
		this.add(quatreText);
		this.add(huit);
		this.add(huitText);

	}
}
