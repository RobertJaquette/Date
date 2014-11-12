package MainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.ScrollPane;
import javax.swing.JTextField;

public class Date {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Date window = new Date();
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
	public Date() {
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 29, 130, 100);
		panel_3.add(panel);
		panel.setLayout(null);
		
		JLabel lblYear = new JLabel("        Year");
		lblYear.setBounds(0, 83, 46, 14);
		panel.add(lblYear);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(78, 80, 52, 20);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2009", "2010", "2011 ", "2012 ", "2013 ", "2014", " 2015", "2016", "2017 ", "2018", "2019"}));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(90, 0, 37, 20);
		panel.add(comboBox_3);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JLabel lblMonth = new JLabel("       Month ");
		lblMonth.setBounds(0, 39, 54, 14);
		panel.add(lblMonth);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(26, 3, 19, 14);
		panel.add(lblDay);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(87, 36, 43, 20);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 Jan", "2 Feb", "3 Mar", "4 April", "5 May", "6 June", "7 July", "8 Aug", "9 Sept", "10 Oct", "11  Nov", "12 Dec"}));
		
		textField = new JTextField();
		textField.setBounds(297, 62, 86, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblDateGiven = new JLabel("Date Given");
		lblDateGiven.setBounds(304, 37, 79, 14);
		panel_3.add(lblDateGiven);
	}
}
