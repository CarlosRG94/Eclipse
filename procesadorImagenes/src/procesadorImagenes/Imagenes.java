package procesadorImagenes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Imagenes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spn1, spn2;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagenes frame = new Imagenes();
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
	public Imagenes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel btPane = new JPanel();
		btPane.setLayout(null);
		btPane.setBounds(0,0,600,400);
		getContentPane().add(btPane);
		
		//Creamos la etiqueta de usuario
		JLabel pagina = new JLabel("Página");
		pagina.setBounds(30, 20, 70, 40);
		btPane.add(pagina);
		
		//Creamos la etiqueta de la contraseña
		JLabel mgsup = new JLabel("Margen superior");
		mgsup.setBounds(150, 20, 100, 40);
		btPane.add(mgsup);
		
		JLabel mginf = new JLabel("Margen inferior");
		mginf.setBounds(150, 90, 100, 40);
		btPane.add(mginf);
		
		spn1 = new JSpinner(new SpinnerNumberModel(0,0,10,1));
		spn1.setBounds(150, 60, 40, 20);
		ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                repaint(); // Llamar a repaint para actualizar el dibujo de la línea
            }
        };
        spn1.addChangeListener(listener);
		btPane.add(spn1);
		
		spn2 = new JSpinner(new SpinnerNumberModel(0,0,10,1));
		spn2.setBounds(150, 130, 40, 20);
		spn2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                repaint(); // Llamar a repaint para actualizar el dibujo de la línea
            }
        });
		btPane.add(spn2);
		
		comboBox = new JComboBox<>(new String[] {"Horizontal", "Vertical"});
		comboBox.setBounds(400, 30, 100, 20);
		comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint(); // Llamar a repaint para actualizar el dibujo
            }
        });
		btPane.add(comboBox);
		
		JButton boton = new JButton("Inicializar");
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				spn1.setValue(0);
				spn2.setValue(0);
				comboBox.setSelectedIndex(0);
				repaint();
			}
		});
		boton.setBounds(50, 250, 120, 20);
		btPane.add(boton);
		
	}
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawRect(30, 90, 100, 140);
		
		int ms = Integer.parseInt(spn1.getValue().toString());
		int mi = Integer.parseInt(spn2.getValue().toString());
		
		g.setColor(Color.RED);
		g.drawLine(30, 90 + ms, 130, 90+ms);
		g.drawLine(30, 230 - mi, 130, 230-mi);
		
		String direccion = (String) comboBox.getSelectedItem();
		if (direccion.equals("Horizontal")) {
			g.drawRect(300, 120, 200, 100);
		} else {
			g.drawRect(400, 120, 100, 200);
		}
	}
	
}
