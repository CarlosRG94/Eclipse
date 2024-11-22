package raton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Raton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spn;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Raton frame = new Raton();
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
	public Raton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Ventana ratón");

		// Creamos dos paneles uno borderlayout y luego otro gridbaglayout que lo
		// metemos dentro del border en la zona norte
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		JPanel panelGrid = new JPanel(new GridBagLayout());
		contentPane.add(panelGrid, BorderLayout.NORTH);
		// Se crea la constraints que es obligatorio para luego poder situar cada
		// casilla del gridbaglayout
		GridBagConstraints gbc = new GridBagConstraints();

		// Añadimos unos margenes a cada celda con insets y con anchor podemos mover el
		// contenido de la celda a norte sur este y oeste
		gbc.insets = new Insets(10, 40, 5, 40);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 0; // Comenzamos con la columna izquierda posicion 0 del eje x

		gbc.gridy = 0;// Primera fila de la primera columna

		JLabel labelvel = new JLabel("Velocidad del ratón");
		panelGrid.add(labelvel,gbc);
		
		GridBagConstraints gbcspn = new GridBagConstraints();
		gbcspn.insets = new Insets(10, 40, 5, 40);
		gbcspn.anchor = GridBagConstraints.CENTER;
		gbcspn.gridx = 0;
		gbcspn.gridy = 1;// Segunda fila de la primera columna

		spn = new JSpinner(new SpinnerNumberModel(0, 0, 50, 25));
		spn.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				repaint(); // Llamar a repaint para actualizar el dibujo de la línea
			}
		});
		panelGrid.add(spn,gbcspn);

		// Primera fila de segunda columna
		GridBagConstraints gbclbl = new GridBagConstraints();
		gbclbl.insets = new Insets(10, 40, 5, 40);
		gbclbl.anchor = GridBagConstraints.CENTER;
		gbclbl.gridx = 1;
		gbclbl.gridy = 0;
		JLabel labelclick = new JLabel("Botón seleccionado");
		panelGrid.add(labelclick,gbclbl);
		
		GridBagConstraints gbcbox = new GridBagConstraints();
		gbcbox.insets = new Insets(10, 40, 5, 40);
		gbcbox.anchor = GridBagConstraints.CENTER;
		gbcbox.gridx = 1;
		gbcbox.gridy = 1;
		// Segunda fila de la segunda columna
		// Creamos un combo box en el que le pasamos dos string que va a enseñar, al
		// declararlo hay que pasar el tipo de dato ya que es una clase generica
		comboBox = new JComboBox<>(new String[] { "Izquierda", "Derecha" });
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				repaint(); // Llamar a repaint para actualizar el dibujo de la línea
			}
		});
		panelGrid.add(comboBox,gbcbox);

	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawRect(80, 120, 60, 20);

		int ms = Integer.parseInt(spn.getValue().toString());
		if (ms == 0) {
			g.setColor(Color.RED);
			g.fillRect(81, 121, 20, 19);
		} else if (ms == 25) {
			g.setColor(Color.ORANGE);
			g.fillRect(81, 121, 40, 19);
		} else {
			g.setColor(Color.GREEN);
			g.fillRect(81, 121, 59, 19);
		}

		g.setColor(Color.BLUE);
		g.drawRect(250, 110, 120, 170);

		String direccion = (String) comboBox.getSelectedItem();
		if (direccion.equals("Izquierda")) {
			g.fillRect(251, 111, 60, 60);
			g.setColor(Color.GRAY);
			g.fillOval(251, 111, 60, 60);
		} else {
			g.fillRect(310, 111, 60, 60);
			g.setColor(Color.GRAY);
			g.fillOval(310, 111, 60, 60);
		}
	}

}
