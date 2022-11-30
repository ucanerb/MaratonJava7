package Maraton.Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textKare;
	private JLabel lblSonuc;
	Kare kare = new Kare();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanHesaplamaFormu window = new KareAlanHesaplamaFormu();
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
	public KareAlanHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Lütfen bir uzunluk giriniz");
		lblNewLabel.setBounds(24, 46, 175, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(34, 193, 289, 16);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String alan = kare.kareAlan(Double.valueOf(textKare.getText()));
		
			lblSonuc.setText(alan); 
		
			}
		});
		btnHesapla.setBounds(251, 118, 117, 29);
		frame.getContentPane().add(btnHesapla);
		
		textKare = new JTextField();
		textKare.setBounds(251, 41, 130, 26);
		frame.getContentPane().add(textKare);
		textKare.setColumns(10);
	}
}
