package Tutorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FirstTextField;
	private JTextField SecondTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task2 frame = new Task2();
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
	public Task2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstLabel = new JLabel("FirstNum:");
		firstLabel.setBounds(79, 10, 67, 13);
		contentPane.add(firstLabel);
		
		JLabel secondLabel = new JLabel("SecondNum:");
		secondLabel.setBounds(79, 35, 85, 12);
		contentPane.add(secondLabel);
		
		FirstTextField = new JTextField();
		FirstTextField.setBounds(163, 7, 96, 18);
		contentPane.add(FirstTextField);
		FirstTextField.setColumns(10);
		
		SecondTextField = new JTextField();
		SecondTextField.setBounds(163, 32, 96, 18);
		contentPane.add(SecondTextField);
		SecondTextField.setColumns(10);
		
		JLabel Ans = new JLabel("Ans:");
		Ans.setBounds(79, 101, 112, 12);
		contentPane.add(Ans);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNum = Double.parseDouble(FirstTextField.getText());
				double secondNum = Double.parseDouble(SecondTextField.getText());
				double add = firstNum + secondNum;
				Ans.setText("Addition: " + add);
				System.out.println(add);
			}
		});
		add.setBounds(79, 57, 44, 20);
		contentPane.add(add);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNum = Double.parseDouble(FirstTextField.getText());
				double secondNum = Double.parseDouble(SecondTextField.getText());
				double sub = firstNum - secondNum;
				Ans.setText("Substraction: " + sub);
				System.out.println(sub);
			}
		});
		sub.setBounds(133, 57, 44, 20);
		contentPane.add(sub);
		
		JButton mul = new JButton("x");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNum = Double.parseDouble(FirstTextField.getText());
				double secondNum = Double.parseDouble(SecondTextField.getText());
				double mul = firstNum * secondNum;
				Ans.setText("Multiplication: " + mul);
				System.out.println(mul);
			}
		});
		mul.setBounds(187, 57, 44, 20);
		contentPane.add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNum = Double.parseDouble(FirstTextField.getText());
				double secondNum = Double.parseDouble(SecondTextField.getText());
				double div = firstNum / secondNum;
				Ans.setText("Division: " + div);
				System.out.println(div);
			}
		});
		div.setBounds(241, 57, 44, 20);
		contentPane.add(div);

	}

}
