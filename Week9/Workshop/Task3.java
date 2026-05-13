package Workshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Task3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField d;
	private JTextField sem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task3 frame = new Task3();
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
	public Task3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstname = new JLabel("FirstName:");
		firstname.setBounds(62, 25, 74, 12);
		contentPane.add(firstname);
		
		a = new JTextField();
		a.setBounds(169, 22, 96, 18);
		contentPane.add(a);
		a.setColumns(10);
		
		JLabel lastname = new JLabel("LastName:");
		lastname.setBounds(62, 53, 74, 12);
		contentPane.add(lastname);
		
		JLabel address = new JLabel("Address:");
		address.setBounds(62, 81, 74, 12);
		contentPane.add(address);
		
		JLabel contactnum = new JLabel("ContactNum:");
		contactnum.setBounds(62, 109, 74, 12);
		contentPane.add(contactnum);
		
		b = new JTextField();
		b.setBounds(169, 50, 96, 18);
		contentPane.add(b);
		b.setColumns(10);
		
		c = new JTextField();
		c.setBounds(169, 78, 96, 18);
		contentPane.add(c);
		c.setColumns(10);
		
		d = new JTextField();
		d.setBounds(169, 106, 96, 18);
		contentPane.add(d);
		d.setColumns(10);
		
		sem = new JTextField();
		sem.setBounds(169, 134, 96, 18);
		contentPane.add(sem);
		sem.setColumns(10);
		
		JLabel semester = new JLabel("Semester:");
		semester.setBounds(62, 137, 74, 12);
		contentPane.add(semester);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = a.getText();
				String lastname = b.getText();
				String address = c.getText();
				String contactnum = d.getText();
				String semester =  sem.getText();
				
//				try {
//					BufferedWriter bw = new BufferedWriter(new FileWriter("data.csv"));
//					bw.write("First Name: " + firstname + "," + " Last Name: " + lastname + "," + " Address: " + address + "," + " Contact Number: " + contactnum + "," + " Semester: " +semester);
//			        bw.close();
//			        System.out.println("Student data written to data.csv");
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
				content c1 = new content (firstname, lastname, address, contactnum, semester);
				//content c2 = new content()
				try {
					c1.write("dtaa.csv");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//System.out.println("Student data written to data.csv");
				System.out.println("Student data written to dtaa.csv");
			}
		});
		btnNewButton.setBounds(93, 162, 84, 20);
		contentPane.add(btnNewButton);

	}

}
