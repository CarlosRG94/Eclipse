package pruebaInter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;

public class Jframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
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
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 450, 300);
		setSize(500, 600);
		setTitle("Ventana de inicio");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(234, 10, 15, 15);
		panel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
				new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)), "", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel newLabel = new JLabel("");
		newLabel.setHorizontalAlignment(SwingConstants.CENTER);
		newLabel.setIcon(new ImageIcon("C:\\Users\\carli\\eclipse-workspace\\PruebaInter\\src\\pruebaInter\\imapru.jpg"));
		newLabel.setBackground(new Color(0,255,255));
		panel_1.add(newLabel);
		
		JLabel lblNewLabel = new JLabel("Hola");
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Acepta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog dialogo = new Dialog(Jframe.this);
				dialogo.setVisible(true);
				dispose();
			}
		});
		panel_1.add(btnNewButton);
		
		
	}
	
}
