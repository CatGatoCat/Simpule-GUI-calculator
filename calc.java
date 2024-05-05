import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private float number = 0;
	private float number2 = 0;
	private int operation =0;
	private String option = "";
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Numbers:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(27, 41, 70, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Operators:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(321, 43, 102, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 1;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton.setBounds(27, 99, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 4;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_1.setBounds(27, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 7;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_2.setBounds(27, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 2;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_3.setBounds(122, 99, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 5;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_1_1.setBounds(122, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 8;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_4.setBounds(122, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 3;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_5.setBounds(213, 99, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 6;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_6.setBounds(213, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 9;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_7.setBounds(213, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("0");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				option = option + 0;
				lblNewLabel.setText(option);
			}
		});
		btnNewButton_8.setBounds(122, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("+");
				option = "";
				operation = 1;
			}
		});
		btnNewButton_9.setBounds(334, 99, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("-");
				option = "";
				operation = 2;
			}
		});
		btnNewButton_10.setBounds(334, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("*");
				option = "";
				operation = 3;
			}
		});
		btnNewButton_11.setBounds(334, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Integer.parseInt(lblNewLabel.getText());
				lblNewLabel.setText("/");
				option = "";
				operation = 4;
			}
		});
		btnNewButton_12.setBounds(334, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 =  new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2=Integer.parseInt(lblNewLabel.getText());
				switch(operation) {
				case 1:
					lblNewLabel.setText(String.valueOf(number+number2));
					break;
				case 2:
					lblNewLabel.setText(String.valueOf(number-number2));
					break;
				case 3:
					lblNewLabel.setText(String.valueOf(number*number2));
					break;
				case 4:
					lblNewLabel.setText(String.valueOf(number/number2));
					break;
					
				default:
				break;
				}
				option = "";
				number=0;
				number =0;
			}
		});
		btnNewButton_13.setBounds(213, 189, 111, 52);
		frame.getContentPane().add(btnNewButton_13);
	}
}
