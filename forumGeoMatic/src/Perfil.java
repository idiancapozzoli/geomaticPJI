import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;

public class Perfil {

	private static Usuario usuario;
	private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public Perfil(Usuario usuario) {
		this.usuario=usuario;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JButton btnIrForum = new JButton("Ir para f\u00F3rum");
		panel_1.add(btnIrForum);
		btnIrForum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Forum forum = new Forum(usuario);
				frame.setVisible(false);
				forum.abreForum();
			}
		});
		
		JButton btnIrPerfil = new JButton("Ir para perfil");
		panel_1.add(btnIrPerfil);
		btnIrPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblPerfil = new JLabel("PEFIL");
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPerfil);
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_2_1);
		panel_2_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblNomeUsuario = new JLabel(usuario.getNome());
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeUsuario.setForeground(new Color(255, 255, 255));
		lblNomeUsuario.setBackground(new Color(0, 0, 205));
		panel_2_1.add(lblNomeUsuario);
		
		JLabel lblnickusuario = new JLabel(usuario.getNick());
		lblnickusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblnickusuario.setForeground(new Color(255, 255, 255));
		panel_2_1.add(lblnickusuario);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_2_2);
		
		table = new JTable();
		panel_2_2.add(table);
		
		JButton btnTestee = new JButton("Foto de Perfil");
		btnTestee.setBackground(new Color(0, 0, 205));
		panel_2_2.add(btnTestee);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(3, 3, 10, 0));
		
		JButton btnMeusTopicos = new JButton("Meus T\u00F3picos");
		btnMeusTopicos.setBackground(new Color(0, 0, 205));
		btnMeusTopicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_3.add(btnMeusTopicos);
		
		JButton btnMeusComentarios = new JButton("Meus coment\u00E1rios");
		btnMeusComentarios.setBackground(new Color(0, 0, 205));
		panel_3.add(btnMeusComentarios);
		
		JButton btnTodos = new JButton("Todos");
		btnTodos.setBackground(new Color(0, 0, 205));
		panel_3.add(btnTodos);
	}

	public void abrePerfil() {
		frame.setVisible(true);		
		
	}

}
