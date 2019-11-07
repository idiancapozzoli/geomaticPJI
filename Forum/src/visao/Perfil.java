package visao;

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

import controle.UsuarioDAO;
import modelo.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Perfil {
	private JFrame frame;

	/**
	 * Create the application.
	 */
	public Perfil() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel.add(panel_1);
		
		JButton btnIrForum = new JButton("Ir para f\u00F3rum");
		btnIrForum.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnIrForum);
		btnIrForum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Forum forum = new Forum(PaginaInicial.usuarioLogado);
				frame.setVisible(false);
				forum.abreForum();
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaginaInicial paginaInicial = new PaginaInicial();
				frame.setVisible(false);
				paginaInicial.abrePaginaInicial();
			}
		});
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnLogout.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnLogout);
		
		JLabel lblPerfil = new JLabel("PEFIL");
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPerfil);
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_2_1);
		panel_2_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setForeground(Color.WHITE);
		lblNome.setBackground(new Color(0, 0, 205));
		panel_2_1.add(lblNome);
		
		JLabel lblNick = new JLabel("NICK:");
		lblNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblNick.setForeground(new Color(255, 255, 255));
		lblNick.setBackground(new Color(0, 0, 205));
		panel_2_1.add(lblNick);

		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBackground(new Color(0, 0, 205));
		panel_2_1.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setForeground(new Color(255, 255, 255));
		lblTelefone.setBackground(new Color(0, 0, 205));
		panel_2_1.add(lblTelefone);
		
		JLabel lblNomeUsuario = new JLabel(PaginaInicial.usuarioLogado.getNome());
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeUsuario.setForeground(new Color(255, 255, 255));
		lblNomeUsuario.setBackground(new Color(0, 0, 205));
		panel_2_1.add(lblNomeUsuario);
		
		JLabel lblnickusuario = new JLabel(PaginaInicial.usuarioLogado.getNick());
		lblnickusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblnickusuario.setForeground(new Color(255, 255, 255));
		panel_2_1.add(lblnickusuario);
		
		JLabel lblemailusuario = new JLabel(PaginaInicial.usuarioLogado.getEmail());
		lblemailusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblemailusuario.setForeground(new Color(255, 255, 255));
		panel_2_1.add(lblemailusuario);
		
		JLabel lbltelefoneusuario = new JLabel(PaginaInicial.usuarioLogado.getTelefone());
		lbltelefoneusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lbltelefoneusuario.setForeground(new Color(255, 255, 255));
		panel_2_1.add(lbltelefoneusuario);
		
		
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_2_2, BorderLayout.SOUTH);
		
	
		
		JButton btnEditarPerfil = new JButton("Editar Perfil");
		btnEditarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarPerfil editarPerfil = new EditarPerfil();
				frame.setVisible(false);
				editarPerfil.abreEditarPerfil();
				
			}
		});
		
		JButton btnExcluirPerfil = new JButton("Excluir Perfil");
		btnExcluirPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				usuarioDAO.excluirUsuario();
				
				PaginaInicial paginaInicial = new PaginaInicial();
				frame.setVisible(false);
				paginaInicial.abrePaginaInicial();
			}
		});
		panel_2_2.add(btnExcluirPerfil);
		panel_2_2.add(btnEditarPerfil);
		
		JButton btnPesquisarUsurios = new JButton("Pesquisar Usu\u00E1rios");
		btnPesquisarUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PesquisarPerfil pesquisa= new PesquisarPerfil();
				frame.setVisible(false);
				pesquisa.abrePesquisarPerfil();
			}
		});
		panel_2_2.add(btnPesquisarUsurios);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(3, 3, 10, 0));
		
		JButton btnMeusTopicos = new JButton("Meus T\u00F3picos");
		btnMeusTopicos.setBackground(Color.LIGHT_GRAY);
		btnMeusTopicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_3.add(btnMeusTopicos);
		
		JButton btnMeusComentarios = new JButton("Meus coment\u00E1rios");
		btnMeusComentarios.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnMeusComentarios);
		
		JButton btnTodos = new JButton("Todos");
		btnTodos.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnTodos);
	}

	public void abrePerfil() {
		frame.setVisible(true);		
		
	}

}

