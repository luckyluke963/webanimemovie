package animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	
	
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(29, 24, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAnimal = new JLabel("Animal");
		lblAnimal.setBounds(29, 72, 46, 14);
		contentPane.add(lblAnimal);
		
		txtName = new JTextField();
		txtName.setBounds(85, 21, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JComboBox cbbAnimal = new JComboBox();
		cbbAnimal.setModel(new DefaultComboBoxModel(new String[] {"Cat", "Dog", "Pig"}));
		cbbAnimal.setBounds(85, 68, 86, 22);
		contentPane.add(cbbAnimal);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setBounds(201, 24, 231, 198);
		contentPane.add(lblHinh);
		
		//hiển thị dòng hello
		JLabel lblHello = new JLabel("");
		lblHello.setBounds(29, 203, 202, 14);
		contentPane.add(lblHello);
			
		JButton btnSayHello = new JButton("Say Hello");
		btnSayHello.setBounds(80, 128, 91, 23);
		contentPane.add(btnSayHello);
		
		btnSayHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(cbbAnimal.getSelectedItem().toString()){
				case "Cat":
					Cat c= new Cat(txtName.getText(),"Cat.jpg");
					lblHello.setText(c.getName()+" says " +c.sayHello());
					lblHinh.setIcon(new ImageIcon("src/animals/"+ c.getImage()));
					break;
				case "Dog":
					Dog d= new Dog(txtName.getText(),"Dog.jpg");
					lblHello.setText(d.getName()+" says " +d.sayHello());
					lblHinh.setIcon(new ImageIcon("src/animals/"+ d.getImage()));	
					break;
				case "Pig":
					Pig p= new Pig(txtName.getText(),"Pig.jpg");
					lblHello.setText(p.getName()+" says " +p.sayHello());
					lblHinh.setIcon(new ImageIcon("src/animals/"+ p.getImage()));
					break;
				
				}
			}
		});
	
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	  */
}
