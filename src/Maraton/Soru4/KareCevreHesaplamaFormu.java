package Maraton.Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreHesaplamaFormu {

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
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Kenar uzunluğu giriniz");
		lblNewLabel.setBounds(48, 47, 159, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(48, 205, 201, 16);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cevre = kare.kareÇevre(Double.valueOf(textKare.getText()));
				
				lblSonuc.setText(cevre); 
			}
		});
		btnHesapla.setBounds(249, 136, 117, 29);
		frame.getContentPane().add(btnHesapla);
		
		textKare = new JTextField();
		textKare.setBounds(249, 42, 130, 26);
		frame.getContentPane().add(textKare);
		textKare.setColumns(10);
	}

}
