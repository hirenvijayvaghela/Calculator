package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField result_textField;

	System.out.println("Hello World");
	double first,second,result;
	String operator,answer;
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
		frame.setBounds(100, 100, 228, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		result_textField = new JTextField();
		result_textField.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		result_textField.setBounds(16, 18, 200, 59);
		frame.getContentPane().add(result_textField);
		result_textField.setColumns(10);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number=result_textField.getText() + btn_1.getText();
				result_textField.setText(Number);
			}
		});
		btn_1.setBounds(16, 135, 50, 44);
		frame.getContentPane().add(btn_1);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_4.getText();
				result_textField.setText(Number);
			}
		});
		btn_4.setBounds(16, 176, 50, 44);
		frame.getContentPane().add(btn_4);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_7.getText();
				result_textField.setText(Number);
			}
		});
		btn_7.setBounds(16, 218, 50, 44);
		frame.getContentPane().add(btn_7);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_dot.getText();
				result_textField.setText(Number);
			}
		});
		btn_dot.setBounds(16, 260, 50, 44);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_B = new JButton("\u2190");
		btn_B.setFont(new Font("Wingdings", Font.BOLD, 13));
		btn_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				
				if(result_textField.getText().length()>0)
				{
					StringBuilder sb=new StringBuilder(result_textField.getText());
					sb.deleteCharAt(result_textField.getText().length()-1);
					backspace=sb.toString();
					result_textField.setText(backspace);
				}
			}
		});
		btn_B.setBounds(16, 89, 50, 44);
		frame.getContentPane().add(btn_B);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_textField.setText(null);
			}
		});
		btn_C.setBounds(67, 89, 50, 44);
		frame.getContentPane().add(btn_C);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_0.getText();
				result_textField.setText(Number);
			}
		});
		btn_0.setBounds(67, 260, 50, 44);
		frame.getContentPane().add(btn_0);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_8.getText();
				result_textField.setText(Number);
			}
		});
		btn_8.setBounds(67, 218, 50, 44);
		frame.getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_5.getText();
				result_textField.setText(Number);
			}
		});
		btn_5.setBounds(67, 176, 50, 44);
		frame.getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_2.getText();
				result_textField.setText(Number);
			}
		});
		btn_2.setBounds(67, 135, 50, 44);
		frame.getContentPane().add(btn_2);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_00.getText();
				result_textField.setText(Number);
			}
		});
		btn_00.setBounds(116, 89, 50, 44);
		frame.getContentPane().add(btn_00);
		
		JButton btn_equals = new JButton("=");
		btn_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(result_textField.getText());
				switch(operator)
				{
				case "+": result=first+second; answer=String.format("%.2f",result);result_textField.setText(answer);  break;
				case "-": result=first-second; answer=String.format("%.2f",result);result_textField.setText(answer);break;
				case "*": result=first*second; answer=String.format("%.2f",result);result_textField.setText(answer);break;
				case "/": result=first/second; answer=String.format("%.2f",result);result_textField.setText(answer);break;
				case "%": result=first%second; answer=String.format("%.2f",result);result_textField.setText(answer);break;
				default : System.out.println("Please enter valid input");
				}
				
			}
		});
		btn_equals.setBounds(116, 260, 50, 44);
		frame.getContentPane().add(btn_equals);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_9.getText();
				result_textField.setText(Number);
			}
		});
		btn_9.setBounds(116, 218, 50, 44);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_6.getText();
				result_textField.setText(Number);
			}
		});
		btn_6.setBounds(116, 176, 50, 44);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=result_textField.getText() + btn_3.getText();
				result_textField.setText(Number);
			}
		});
		btn_3.setBounds(116, 135, 50, 44);
		frame.getContentPane().add(btn_3);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(result_textField.getText());
				result_textField.setText("");
				operator="+";
			}
		});
		btn_plus.setBounds(166, 89, 50, 44);
		frame.getContentPane().add(btn_plus);
		
		JButton btn_percentage = new JButton("%");
		btn_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(result_textField.getText());
				result_textField.setText("");
				operator="%";
			}
		});
		btn_percentage.setBounds(166, 260, 50, 44);
		frame.getContentPane().add(btn_percentage);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(result_textField.getText());
				result_textField.setText("");
				operator="/";
			}
		});
		btn_divide.setBounds(166, 218, 50, 44);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(result_textField.getText());
				result_textField.setText("");
				operator="*";
			}
		});
		btn_multiply.setBounds(166, 176, 50, 44);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(result_textField.getText());
				result_textField.setText("");
				operator="-";
			}
		});
		btn_minus.setBounds(166, 135, 50, 44);
		frame.getContentPane().add(btn_minus);
	}
}
