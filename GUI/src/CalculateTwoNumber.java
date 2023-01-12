import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(48, 28, 125, 30);
		contentPane.add(lblNumber1);
		
		JLabel lblNewLabel = new JLabel("Enter Number 2");
		lblNewLabel.setBounds(48, 85, 125, 23);
		contentPane.add(lblNewLabel);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(200, 22, 139, 43);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(200, 76, 139, 43);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(48, 120, 91, 43);
		contentPane.add(lblOperator);
		
		final JComboBox OpChanger = new JComboBox();
		OpChanger.setBounds(200, 130, 139, 23);
		contentPane.add(OpChanger);
		OpChanger.addItem("+");
		OpChanger.addItem("-");
		OpChanger.addItem("*");	
		OpChanger.addItem("/");
		contentPane.add(OpChanger);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblResult.setBounds(343, 320, 77, 43);
		contentPane.add(lblResult);
		
		final JRadioButton onedigit = new JRadioButton("1 Digit");
		onedigit.setBounds(200, 195, 109, 23);
		contentPane.add(onedigit);
		
		final JRadioButton twodigit = new JRadioButton("2 Digit");
		twodigit.setBounds(200, 221, 109, 23);
		contentPane.add(twodigit);
		
		JLabel lblShowDialog = new JLabel("Option to show");
		lblShowDialog.setBounds(48, 267, 103, 14);
		contentPane.add(lblShowDialog);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Show Result at DialogBox");
		chckbxNewCheckBox.setBounds(201, 263, 172, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);
		
		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum =0;
				String operator;
				//JButton
				if(e.getSource()==btnOk) {
					num1 =Double.parseDouble(txtNumber1.getText());
					num2 =Double.parseDouble(txtNumber2.getText());
					//JCombobox
					operator = (String) OpChanger.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
					    sum = num1-num2;
					if(operator.equals("*"))
					    sum = num1*num2;
					if(operator.equals("/"))
					    sum = num1/num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(onedigit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if (twodigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					lblResult.setText(String.format(frmNumber.format(sum)));
					 if(chckbxNewCheckBox.isSelected())
						 JOptionPane.showMessageDialog(null,(frmNumber.format(sum)),"Result",JOptionPane.INFORMATION_MESSAGE);
					 else lblResult.setText((frmNumber.format(sum)));
					

					
				}
			}
		});
		btnOk.setBounds(104, 390, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(250, 390, 89, 23);
		contentPane.add(btnExit);
		
		JLabel rdbOp = new JLabel("How to show digit");
		rdbOp.setBounds(48, 183, 91, 14);
		contentPane.add(rdbOp);
		

		
		
		
	}
}
