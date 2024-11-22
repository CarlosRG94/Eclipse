package interfazXml;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VistaXML extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaXML frame = new VistaXML();
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
	public VistaXML() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(9,1,0,5));

		setContentPane(contentPane);
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document document = builder.parse("C:\\Users\\carli\\eclipse-workspace\\interfazXml\\src\\interfazXml\\EjemploVid.xml");
			
			document.getDocumentElement().normalize();
			NodeList listaEnlaces = document.getElementsByTagName("pagina");
			
			for (int temp = 0; temp < listaEnlaces.getLength(); temp++) {
				
				Element element = (Element) listaEnlaces.item(temp);;
				if(element.getNodeType()==Node.ELEMENT_NODE) {
					JButton boton = new JButton(element.getElementsByTagName("nombre").item(0).getTextContent());
					contentPane.add(boton);
					JLabel descripcion = new JLabel(element.getElementsByTagName("descripcion").item(0).getTextContent());
					contentPane.add(descripcion);
					JLabel etiqueta = new JLabel(element.getElementsByTagName("url").item(0).getTextContent());
					contentPane.add(etiqueta);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
