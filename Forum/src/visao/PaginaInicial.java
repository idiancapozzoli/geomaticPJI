package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

import controle.UsuarioDAO;
import modelo.Usuario;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPasswordField;

public class PaginaInicial {

	private JFrame frame;
	private JTextField txtNick;
	public static Usuario usuarioLogado;
	private JPasswordField txtSenha;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicial window = new PaginaInicial();
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
	public PaginaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(100, 100, 439, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 5));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblBemVindoAo = new JLabel("Bem Vindo ao F\u00F3rum GeoMatic");
		panel.add(lblBemVindoAo);
		lblBemVindoAo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBemVindoAo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPginaInicial = new JLabel("P\u00E1gina Inicial");
		lblPginaInicial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPginaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPginaInicial, BorderLayout.SOUTH);
		
		JLabel lblErroDeLogin = new JLabel("Erro de login: senha e/ou nick incorretos!");
		lblErroDeLogin.setForeground(Color.WHITE);
		frame.getContentPane().add(lblErroDeLogin);
		lblErroDeLogin.setVisible(false);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 5, 1));
		
		JLabel lblNick = new JLabel("Nick:");
		lblNick.setForeground(Color.WHITE);
		panel_4.add(lblNick);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		panel_4.add(lblSenha);
		
		txtNick = new JTextField();
		panel_4.add(txtNick);
		txtNick.setColumns(15);
		
		txtSenha = new JPasswordField();
		panel_4.add(txtSenha);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_1);
		
		JButton btnLogin = new JButton("Fazer Login");
		panel_1.add(btnLogin);
		btnLogin.setBackground(Color.LIGHT_GRAY);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioLogado = usuarioDAO.fazerLogin(txtNick.getText(),txtSenha.getText());
			
				if (usuarioLogado != null) {
					Perfil perfil = new Perfil();
					frame.setVisible(false);
					perfil.abrePerfil();
				}else{
					lblErroDeLogin.setVisible(true);
				}
				
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_3);
		
		JLabel lblAindaNo = new JLabel("Ainda n\u00E3o \u00E9 membro do f\u00F3rum?");
		lblAindaNo.setForeground(Color.WHITE);
		panel_3.add(lblAindaNo);
		
		JButton btnCadastrese = new JButton("Cadastre-se");
		btnCadastrese.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnCadastrese);
		
		btnCadastrese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro = new Cadastro();
				frame.setVisible(false);
				cadastro.abreCadastro();
				
			}
		});
	}
	
	public void abrePaginaInicial() {
		frame.setVisible(true);
	}

}

