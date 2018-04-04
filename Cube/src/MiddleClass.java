import java.awt.*;

import javax.swing.*;

public class MiddleClass extends JPanel{
	public MiddleClass(){
		
		JLabel chiffreCentre = new JLabel("0");

		this.setLayout(new BorderLayout());
		this.add(chiffreCentre);
	}
}
