package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	double firstnumber;
	double lastnumber;
	double result;
	String operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 282, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
			
		});
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="+";
			}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="-";

			}
		});
		
		JButton btnMultiple = new JButton("x");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="*";

			}
		});
		
		JButton btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="/";

			}
		});
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				lastnumber=Double.parseDouble(txtDisplay.getText());
				if(operation=="+")
				{
					result=firstnumber+lastnumber;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);

				}
				else if(operation=="-")
				{
					result=firstnumber-lastnumber;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);

				}
				else if(operation=="*")
				{
					result=firstnumber*lastnumber;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);

				}
				else if(operation=="/")
				{
					result=firstnumber/lastnumber;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
		});
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		
		JButton btnPoint = new JButton(".");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn0, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPoint)
							.addGap(8)
							.addComponent(btnMultiple)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDevide, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(txtDisplay, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
						.addComponent(btn6, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn5, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn4, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPlus)
						.addComponent(btnMinus))
					.addGap(17))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(202, Short.MAX_VALUE)
					.addComponent(btnEquals)
					.addGap(23))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtDisplay, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnClear))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn6)
						.addComponent(btn5)
						.addComponent(btn4)
						.addComponent(btnPlus))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn3)
						.addComponent(btn2)
						.addComponent(btn1)
						.addComponent(btnMinus))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDevide))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn0)
								.addComponent(btnPoint)
								.addComponent(btnMultiple))))
					.addGap(18)
					.addComponent(btnEquals)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
