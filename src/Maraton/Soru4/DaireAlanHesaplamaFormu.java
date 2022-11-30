package Maraton.Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textYaricap;
	private JLabel lblSonuc;
	Daire daire = new Daire();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
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
	public DaireAlanHesaplamaFormu() {
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
		
		textYaricap = new JTextField();
		textYaricap.setBounds(233, 39, 130, 26);
		frame.getContentPane().add(textYaricap);
		textYaricap.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lütfen yarıçapı giriniz");
		lblNewLabel.setBounds(38, 44, 183, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(38, 201, 221, 16);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String alan = daire.daireAlan(Double.valueOf(textYaricap.getText()));
				
				lblSonuc.setText(alan); 
			}
		});
		btnNewButton.setBounds(213, 105, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
