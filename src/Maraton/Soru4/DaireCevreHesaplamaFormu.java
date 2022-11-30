package Maraton.Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField textYaricap;
	private JLabel lblNewLabel_1;
	Daire daire = new Daire();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireCevreHesaplamaFormu window = new DaireCevreHesaplamaFormu();
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
	public DaireCevreHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Yarıçapı giriniz");
		lblNewLabel.setBounds(35, 47, 130, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Sonuc");
		lblNewLabel_1.setBounds(35, 185, 257, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textYaricap = new JTextField();
		textYaricap.setBounds(210, 42, 117, 26);
		frame.getContentPane().add(textYaricap);
		textYaricap.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String cevre = daire.daireÇevre(Double.valueOf(textYaricap.getText()));
				
			lblNewLabel_1.setText(cevre); 
			}
		});
		btnNewButton.setBounds(210, 111, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
