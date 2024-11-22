package pagar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Pagar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Pagar dialog = new Pagar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Pagar() {
		setBounds(100, 100, 450, 300);
		setTitle("Ventana de pago");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel newLabel = new JLabel("Selecciona un método de pago:");
			newLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			newLabel.setBounds(90, 25, 221, 28);
			contentPanel.add(newLabel);
			
			JRadioButton newRadioBtn = new JRadioButton("Paypal");
			newRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
			newRadioBtn.setBounds(90, 74, 109, 29);
			contentPanel.add(newRadioBtn);
			
			JRadioButton newRadioBtn1 = new JRadioButton("Tarjeta de crédito");
			newRadioBtn1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			newRadioBtn1.setBounds(90, 130, 169, 29);
			contentPanel.add(newRadioBtn1);
			 
			JRadioButton newRadioBtn2 = new JRadioButton("Taquilla");
			newRadioBtn2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			newRadioBtn2.setBounds(90, 193, 109, 29);
			contentPanel.add(newRadioBtn2);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(newRadioBtn);
			bg.add(newRadioBtn1);
			bg.add(newRadioBtn2);
			
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
