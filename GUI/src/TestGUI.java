import java.awt.*;
import javax.swing.*;
public class TestGUI extends JFrame {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	//Components
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLenght,txtWidth,txtArea,txtPerimeter;
	
	public TestGUI () {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Properties for Components
		lblLength = new JLabel("Enter the length:",SwingConstants.CENTER);
		lblWidth = new JLabel("Enter the width:",SwingConstants.CENTER);
		lblArea = new JLabel("Area:",SwingConstants.CENTER);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.CENTER);
		//TextFields
		//txtLength = new JTextField(10);
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);add(txtLenght);
		add(lblWidth);add(txtWidth);
		add(lblArea);add(txtArea);
		add(lblPerimeter);add(txtPerimeter);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();
	}

}
