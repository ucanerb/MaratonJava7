package Maraton.Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdörtgenCevreHesaplamaFormu {

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
					DikdörtgenCevreHesaplamaFormu window = new DikdörtgenCevreHesaplamaFormu();
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
	public DikdörtgenCevreHesaplamaFormu() {
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
		lblNewLabel.setBounds(17, 50, 230, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("İkinci kenar uzunluğunu giriniz");
		lblNewLabel_1.setBounds(17, 85, 241, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(37, 183, 221, 16);
		frame.getContentPane().add(lblSonuc);
		
		textAkenari = new JTextField();
		textAkenari.setBounds(303, 45, 130, 26);
		frame.getContentPane().add(textAkenari);
		textAkenari.setColumns(10);
		
		textBkenari = new JTextField();
		textBkenari.setColumns(10);
		textBkenari.setBounds(303, 80, 130, 26);
		frame.getContentPane().add(textBkenari);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cevre = dörtgen.dörtgenÇevre(Double.valueOf(textAkenari.getText()), Double.valueOf(textBkenari.getText()));
				
				lblSonuc.setText(cevre); 
			}
		});
		btnNewButton.setBounds(245, 145, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
