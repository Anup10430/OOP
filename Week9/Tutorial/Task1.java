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

public class Task1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ctextField;

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
		
		JLabel clabel = new JLabel("Celsius:");
		clabel.setBounds(35, 26, 59, 12);
		contentPane.add(clabel);
		
		ctextField = new JTextField();
		ctextField.setBounds(89, 23, 96, 18);
		contentPane.add(ctextField);
		ctextField.setColumns(10);
		
		JLabel faah = new JLabel("Fahernheit:");
		faah.setBounds(35, 95, 111, 12);
		contentPane.add(faah);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c = Double.parseDouble(ctextField.getText());
				double f = (c * 9 / 5) + 32;
				faah.setText("fahrenheit: " + f);
				System.out.println(f);
			}
		});
		btnNewButton.setBounds(62, 53, 84, 20);
		contentPane.add(btnNewButton);	

	}
}
