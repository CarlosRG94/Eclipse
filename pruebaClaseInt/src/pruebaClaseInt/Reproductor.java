package pruebaClaseInt;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Reproductor extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reproductor dialog = new Reproductor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reproductor() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new GridLayout(3,3));
			getContentPane().add(buttonPane, BorderLayout.CENTER);
			{
				JButton button = new JButton("ON/OFF");
				buttonPane.add(button);
				
				button = new JButton("PLAY");
				buttonPane.add(button);
				
				button = new JButton("RECORD");
				buttonPane.add(button);
				
				button = new JButton("PISTA ANTERIOR");
				buttonPane.add(button);
				
				button = new JButton("PAUSE");
				buttonPane.add(button);
				
				button = new JButton("PISTA POSTERIOR");
				buttonPane.add(button);
				
				button = new JButton("REBOBINAR ATRAS");
				buttonPane.add(button);
				
				button = new JButton("STOP");
				buttonPane.add(button);
				
				button = new JButton("REBOBINAR DELANTE");
				buttonPane.add(button);
			
			
			
				
			}
		}
	}

}
