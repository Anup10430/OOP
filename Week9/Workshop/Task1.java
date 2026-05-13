package Workshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task1 frame = new Task1();
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
	public Task1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel username = new JLabel("Username:");
		username.setBounds(41, 32, 75, 12);
		contentPane.add(username);
		
		a = new JTextField();
		a.setBounds(143, 29, 96, 18);
		contentPane.add(a);
		a.setColumns(10);
		
		JLabel password = new JLabel("Password:");
		password.setBounds(41, 66, 71, 12);
		contentPane.add(password);
		
		b = new JTextField();
		b.setBounds(143, 63, 96, 18);
		contentPane.add(b);
		b.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = a.getText();
				String password = b.getText();
				if(username.equals("admin") && password.equals("admin")) {
					JOptionPane.showMessageDialog(null, "Login Successful! Welcome Admin");
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
					a.setText("");
					b.setText("");
				}
			}
		});
		btnNewButton.setBounds(82, 91, 84, 20);
		contentPane.add(btnNewButton);

	}
}
