package Maraton.Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdörtgenAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textAkenari;
	private JTextField textBkenari;
	private JLabel lblSonuc;
	Dikdörtgen dörtgen = new Dikdörtgen();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdörtgenAlanHesaplamaFormu window = new DikdörtgenAlanHesaplamaFormu();
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
	public DikdörtgenAlanHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("İlk kenar uzunluğunu giriniz");
		lblNewLabel.setBounds(19, 30, 241, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textAkenari = new JTextField();
		textAkenari.setBounds(312, 25, 85, 26);
		frame.getContentPane().add(textAkenari);
		textAkenari.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("İkinci kenar uzunluğunu giriniz");
		lblNewLabel_1.setBounds(19, 81, 241, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		 lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(19, 201, 262, 16);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alan = dörtgen.dörtgenAlan((Double.valueOf(textAkenari.getText())), Double.valueOf(textBkenari.getText()));
				
				lblSonuc.setText(alan); 
				
				
			}
		});
		btnNewButton.setBounds(254, 132, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		textBkenari = new JTextField();
		textBkenari.setBounds(312, 76, 85, 26);
		frame.getContentPane().add(textBkenari);
		textBkenari.setColumns(10);
	}

}
