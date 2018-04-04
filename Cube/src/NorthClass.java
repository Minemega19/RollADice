import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NorthClass extends JPanel implements ActionListener{

	public NorthClass(){
		JRadioButton quatre = new JRadioButton();
		JRadioButton huit = new JRadioButton();
		JLabel quatreText = new JLabel("4");
		JLabel huitText = new JLabel("8");
		
		quatre.addActionListener(this);
		huit.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		this.add(quatre);
		this.add(quatreText);
		this.add(huit);
		this.add(huitText);

	}
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getSource());
	}
}