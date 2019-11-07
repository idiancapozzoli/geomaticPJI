package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

import controle.UsuarioDAO;
import modelo.Usuario;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class Cadastro {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtDataDeNascimento;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtNick;
	private JPanel panel_2;
	private JButton btnCadastrar;
	private JPasswordField passwordField;
	private JLabel lblNome;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblNasc;
	private JLabel lblNick;
	private JLabel lblSenha;
	private JLabel lblErroTodosCampos;
	private JButton btnCancelar;

	
	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		BorderLayout borderLayout = (BorderLayout) frame.getContentPane().getLayout();
		borderLayout.setVgap(10);
		borderLayout.setHgap(15);
		frame.setBounds(100, 100, 509, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CADASTRO NO F\u00D3RUM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblInformeSeusDados = new JLabel("Informe seus dados para continuar:");
		lblInformeSeusDados.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformeSeusDados.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblInformeSeusDados, BorderLayout.NORTH);
		
		lblErroTodosCampos = new JLabel("ERRO! Todos campos devem estar preenchidos.");
		panel.add(lblErroTodosCampos, BorderLayout.SOUTH);
		lblErroTodosCampos.setForeground(new Color(0, 0, 0));
		lblErroTodosCampos.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 10, 10));
		
		lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		panel_1.add(lblNome);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		panel_1.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Nome");
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email:");
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.WHITE);
		panel_1.add(lblTelefone);
		
		lblNasc = new JLabel("Data de Nascimento:");
		lblNasc.setForeground(Color.WHITE);
		panel_1.add(lblNasc);
		
		txtTelefone = new JTextField();
		panel_1.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtDataDeNascimento = new JTextField();
		panel_1.add(txtDataDeNascimento);
		txtDataDeNascimento.setColumns(10);
		
		lblNick = new JLabel("Nick:");
		lblNick.setForeground(Color.WHITE);
		lblNick.setBackground(Color.WHITE);
		panel_1.add(lblNick);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBackground(Color.WHITE);
		panel_1.add(lblSenha);
		
		txtNick = new JTextField();
		panel_1.add(txtNick);
		txtNick.setColumns(10);
		
		passwordField = new JPasswordField();
		panel_1.add(passwordField);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(1);
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(192, 192, 192));
		panel_2.add(btnCadastrar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				PaginaInicial paginaInicial = new PaginaInicial();
				paginaInicial.abrePaginaInicial();
			}
		});
		panel_2.add(btnCancelar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNick.getText().isEmpty() || passwordField.getText().isEmpty() || txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtDataDeNascimento.getText().isEmpty()) {
					lblErroTodosCampos.setVisible(true);
				}else {
					Usuario usuario = new Usuario(txtNome.getText(),txtNick.getText(),txtEmail.getText(),txtTelefone.getText(),passwordField.getText());
					
					UsuarioDAO usuarioDAO = new UsuarioDAO();
					usuarioDAO.insereUsuario(usuario);
					frame.setVisible(false);
					PaginaInicial paginaInicial = new PaginaInicial();
					paginaInicial.abrePaginaInicial();
					
				}
			}
		});
	}
	
	public void abreCadastro() {
		frame.setVisible(true);
	}
}
