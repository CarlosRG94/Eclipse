package pagar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setForeground(new Color(128, 255, 255));
		setTitle("Ventana1");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Seguro que quiere continuar con la compra?");
		lblNewLabel.setHorizontalAlignment((SwingConstants.CENTER));
		lblNewLabel.setFont(new Font("Tahcma", Font.BOLD, 15));
		lblNewLabel.setBounds(32,48,360,91);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("CANCELAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBackground(new Color(255,128,128));
		button.setBounds(32,188,137,41);
		contentPane.add(button);
		
		JButton buttonp = new JButton("PAGAR");
		buttonp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pagar In = new Pagar();
				In.setVisible(true);
			}
		});
		buttonp.setBackground(new Color(128,255,128));
		buttonp.setBounds(255,188,149,41);
		contentPane.add(buttonp);
		
		
	}

}
