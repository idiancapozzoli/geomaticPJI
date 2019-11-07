import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;

public class TelaTopico {

	private JFrame frame;
	private JTextField textTitulo;
	private JTextField textTexto;
	private static Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTopico window = new TelaTopico(usuario);
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
	public TelaTopico(Usuario usuario) {
		this.usuario=usuario;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblTpico = new JLabel("T\u00F3pico");
		lblTpico.setForeground(Color.BLACK);
		lblTpico.setBackground(new Color(0, 0, 205));
		lblTpico.setHorizontalAlignment(SwingConstants.CENTER);
		lblTpico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblTpico);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(new Color(0, 0, 205));
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setHgap(15);
		flowLayout.setAlignment(FlowLayout.LEADING);
		panel_1.add(panel_3);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setForeground(Color.WHITE);
		panel_3.add(lblTtulo);
		
		textTitulo = new JTextField();
		panel_3.add(textTitulo);
		textTitulo.setColumns(30);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 205));
		panel_1.add(panel_4);
		
		textTexto = new JTextField();
		panel_4.add(textTexto);
		textTexto.setColumns(35);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_2);
		
		JButton btnAddTopico = new JButton("Adicionar Novo T\u00F3pico");
		btnAddTopico.setBackground(new Color(0, 0, 205));
		panel_2.add(btnAddTopico);
		btnAddTopico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Topico topico = new Topico(textTitulo.getText(), textTexto.getText(), usuario);
				DataStoreTopicos.add(topico);
				Forum forum = new Forum(usuario);
				frame.setVisible(false);
				forum.abreForum();

				}
		});
	}
	
	public void abreTelaTopico() {
		frame.setVisible(true);		
		
	}

}
