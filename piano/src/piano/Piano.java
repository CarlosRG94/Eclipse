package piano;

import javax.sound.sampled.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Piano extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	TocarNotas notas = new TocarNotas();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano frame = new Piano();
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
	public Piano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.DARK_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnDo = new JButton("DO");
		btnDo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playDo();
			}
		});
		btnDo.setBounds(10, 11, 56, 239);
		contentPane.add(btnDo);

		JButton btnRe = new JButton("RE");
		btnRe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playRe();
			}
		});
		btnRe.setBounds(82, 11, 56, 239);
		contentPane.add(btnRe);

		JButton btnMi = new JButton("MI");
		btnMi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playMi();
			}
		});
		btnMi.setBounds(157, 11, 56, 239);
		contentPane.add(btnMi);

		JButton btnFa = new JButton("FA");
		btnFa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playFa();
			}
		});
		btnFa.setBounds(234, 11, 56, 239);
		contentPane.add(btnFa);

		JButton btnSol = new JButton("SOL");
		btnSol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playSol();
			}
		});
		btnSol.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnSol.setBounds(313, 11, 56, 239);
		contentPane.add(btnSol);

		JButton btnLa = new JButton("LA");
		btnLa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playLa();
			}
		});
		btnLa.setBounds(391, 11, 56, 239);
		contentPane.add(btnLa);

		JButton btnSi = new JButton("SI");
		btnSi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.playSi();

			}
		});
		btnSi.setBounds(468, 11, 56, 239);
		contentPane.add(btnSi);

	}

}
