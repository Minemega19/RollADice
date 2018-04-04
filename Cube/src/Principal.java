import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame{

	
	public Principal() {

		this.setTitle("Menu Bataille Naval");
	    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		this.add(new NorthClass(), BorderLayout.NORTH);
		this.add(new MiddleClass(), BorderLayout.CENTER);
		this.add(new EastClass(), BorderLayout.WEST);
		this.add(new SouthClass(), BorderLayout.SOUTH);
		repaint();
		this.setVisible(true);
		

	}
	public static void main(String[] args) {	
		new Principal();
	}
}
