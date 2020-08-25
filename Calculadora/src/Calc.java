import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField txtResult;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBackground(Color.WHITE);
		txtResult.setEditable(false);
		txtResult.setBounds(0, 0, 323, 59);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setBounds(0, 63, 81, 65);
		contentPane.add(btn7);
		
		button = new JButton("8");
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button.setBounds(81, 63, 81, 65);
		contentPane.add(button);
		
		button_1 = new JButton("9");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_1.setBounds(162, 63, 81, 65);
		contentPane.add(button_1);
		
		button_2 = new JButton("+");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_2.setBounds(244, 63, 81, 65);
		contentPane.add(button_2);
		
		button_3 = new JButton("4");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_3.setBounds(0, 131, 81, 65);
		contentPane.add(button_3);
		
		button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_4.setBounds(81, 131, 81, 65);
		contentPane.add(button_4);
		
		button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_5.setBounds(162, 131, 81, 65);
		contentPane.add(button_5);
		
		button_6 = new JButton("-");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_6.setBounds(244, 131, 81, 65);
		contentPane.add(button_6);
		
		button_7 = new JButton("1");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_7.setBounds(0, 197, 81, 65);
		contentPane.add(button_7);
		
		button_8 = new JButton("2");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_8.setBounds(81, 197, 81, 65);
		contentPane.add(button_8);
		
		button_9 = new JButton("3");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_9.setBounds(162, 197, 81, 65);
		contentPane.add(button_9);
		
		button_10 = new JButton("*");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_10.setBounds(244, 197, 81, 65);
		contentPane.add(button_10);
		
		button_11 = new JButton("0");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_11.setBounds(-2, 264, 81, 65);
		contentPane.add(button_11);
		
		button_12 = new JButton(".");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_12.setBounds(79, 264, 81, 65);
		contentPane.add(button_12);
		
		button_13 = new JButton("/");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_13.setBounds(160, 264, 81, 65);
		contentPane.add(button_13);
		
		button_14 = new JButton("=");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_14.setBounds(242, 264, 81, 65);
		contentPane.add(button_14);
	}
}
