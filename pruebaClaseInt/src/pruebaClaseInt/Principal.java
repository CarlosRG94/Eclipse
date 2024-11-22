package pruebaClaseInt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField contraseña;

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
		setBounds(300, 300, 450, 300);
		setTitle("Ventana principal");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel btPane = new JPanel();
		btPane.setLayout(null);
		btPane.setBounds(0,0,434,261);
		getContentPane().add(btPane);
		
		//Creamos la etiqueta de usuario
		JLabel userlabel = new JLabel("Usuario:");
		userlabel.setBounds(80, 45, 70, 40);
		btPane.add(userlabel);
		
		//Creamos la etiqueta de la contraseña
		JLabel pswlabel = new JLabel("Password:");
		pswlabel.setBounds(80, 100, 70, 40);
		btPane.add(pswlabel);
		
		//Creamos el textfield para escribir el nombre de usuario
		String placeholder="Nombre Usuario";
		
		usuario = new JTextField(20);
		usuario.setText(placeholder);
		usuario.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(usuario.getText().equals(placeholder)) {
					usuario.setText("");
					usuario.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(usuario.getText().isEmpty()) {
					usuario.setText(placeholder);
					usuario.setForeground(Color.GRAY);
				}
				
			}
			
		});
		usuario.setBounds(180, 55, 120, 20);
		btPane.add(usuario);
		
		//Creamos el textpassword para la contraseña
		String placeholderps="Contraseña";
		
		contraseña = new JPasswordField(20);
		contraseña.setText(placeholderps);
		contraseña.setForeground(Color.GRAY);
		contraseña.setEchoChar((char) 0);
		contraseña.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(String.valueOf(contraseña.getPassword()).equals(placeholderps)) {
					contraseña.setText("");
					contraseña.setForeground(Color.BLACK);
					contraseña.setEchoChar('*');
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(contraseña.getPassword().length == 0) {
					contraseña.setText(placeholderps);
					contraseña.setForeground(Color.GRAY);
					contraseña.setEchoChar((char) 0);
				}
				
			}
			
		});
		
		//Creamos un boton para que al pulsar se muestre la contraseña escrita
		JButton showPasswordButton = new JButton("Mostrar");
		showPasswordButton.addActionListener(new ActionListener() {
            private boolean showingPassword = false;
            public void actionPerformed(ActionEvent e) {
                if (showingPassword) {
                    contraseña.setEchoChar('*');
                    showPasswordButton.setText("Mostrar");
                    showingPassword = false;
                } else {
                    contraseña.setEchoChar((char) 0);
                    showPasswordButton.setText("Ocultar");
                    showingPassword = true;
                }
            }
        });
		
		contraseña.setBounds(180, 110, 120, 20);
		showPasswordButton.setBounds(300, 110,90 ,20);
		btPane.add(showPasswordButton);
		btPane.add(contraseña);
		
		//Se crea el boton para aceptar y pasar a la siguiente pantalla
		JButton okButton = new JButton("Aceptar");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((usuario.getText().equals("admin"))&&(String.valueOf(contraseña.getPassword()).equals("1234"))) {
				Inicio In = new Inicio();
				In.setVisible(true);
				}else {
					JOptionPane.showInternalMessageDialog(null, "El usuario o contraseña es incorrecto");
				}
			}
		});
		okButton.setBackground(Color.cyan);
		okButton.setForeground(Color.BLACK);
		okButton.setBounds(100, 200, 90, 30);
		btPane.add(okButton);
		
		//Se crea el boton para no aceptar y salir
		JButton boton_salir = new JButton("Salir");
		boton_salir.setBounds(217, 202, 90, 30);
		boton_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		boton_salir.setBackground(Color.RED);
		boton_salir.setForeground(Color.BLACK);
		btPane.add(boton_salir);
		
	}

}
