package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Calculator;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private Calculator calculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		this.calculator = new Calculator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Calculer");
		
		btnNewButton.setBounds(163, 195, 117, 29);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(113, 93, 61, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(256, 93, 61, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Chiffre A");
		lblNewLabel.setBounds(113, 68, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblChiffreB = new JLabel("Chiffre B");
		lblChiffreB.setBounds(256, 68, 61, 16);
		contentPane.add(lblChiffreB);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Double> result = calculator.CalculateSquareRoots(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()));
					
					ShowResult(result);
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
	
	public void ShowResult(ArrayList<Double> result) {
		JOptionPane.showMessageDialog(this, result);
	}
}
