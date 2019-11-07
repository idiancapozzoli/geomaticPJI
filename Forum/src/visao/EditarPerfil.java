package visao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import controle.UsuarioDAO;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class EditarPerfil {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtNick;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	
	public EditarPerfil() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 395);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton btnIrPerfil = new JButton("Ir para perfil");
		btnIrPerfil.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnIrPerfil);
		btnIrPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblPerfil = new JLabel("EDITAR PERFIL");
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
		GridBagLayout gbl_panel_2_1 = new GridBagLayout();
		gbl_panel_2_1.columnWidths = new int[]{126, 126, 126, 126, 0};
		gbl_panel_2_1.rowHeights = new int[]{128, 128, 0};
		gbl_panel_2_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2_1.setLayout(gbl_panel_2_1);
		
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setForeground(Color.WHITE);
		lblNome.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		panel_2_1.add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		txtNome.setText(PaginaInicial.usuarioLogado.getNome());
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 0;
		panel_2_1.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.fill = GridBagConstraints.BOTH;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 2;
		gbc_lblEmail.gridy = 0;
		panel_2_1.add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText(PaginaInicial.usuarioLogado.getEmail());
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmail.gridx = 3;
		gbc_txtEmail.gridy = 0;
		panel_2_1.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNick = new JLabel("NICK:");
		lblNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblNick.setForeground(new Color(255, 255, 255));
		lblNick.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_lblNick = new GridBagConstraints();
		gbc_lblNick.fill = GridBagConstraints.BOTH;
		gbc_lblNick.insets = new Insets(0, 0, 0, 5);
		gbc_lblNick.gridx = 0;
		gbc_lblNick.gridy = 1;
		panel_2_1.add(lblNick, gbc_lblNick);
		
		txtNick = new JTextField();
		txtNick.setText(PaginaInicial.usuarioLogado.getNick());
		GridBagConstraints gbc_txtNick = new GridBagConstraints();
		gbc_txtNick.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNick.insets = new Insets(0, 0, 0, 5);
		gbc_txtNick.gridx = 1;
		gbc_txtNick.gridy = 1;
		panel_2_1.add(txtNick, gbc_txtNick);
		txtNick.setColumns(10);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setForeground(new Color(255, 255, 255));
		lblTelefone.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.fill = GridBagConstraints.BOTH;
		gbc_lblTelefone.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelefone.gridx = 2;
		gbc_lblTelefone.gridy = 1;
		panel_2_1.add(lblTelefone, gbc_lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setText(PaginaInicial.usuarioLogado.getTelefone());
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 3;
		gbc_txtTelefone.gridy = 1;
		panel_2_1.add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_2_2, BorderLayout.SOUTH);
		panel_2_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnEditarPerfil = new JButton("Salvar Perfil");
		panel_2_2.add(btnEditarPerfil);
		btnEditarPerfil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				if(txtNick.getText().isEmpty() || txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() || txtTelefone.getText().isEmpty()) {
				
				}else {
					PaginaInicial.usuarioLogado.setNome(txtNome.getText());
					PaginaInicial.usuarioLogado.setNick(txtNick.getText());
					PaginaInicial.usuarioLogado.setEmail(txtEmail.getText());
					PaginaInicial.usuarioLogado.setTelefone(txtTelefone.getText());
					UsuarioDAO usuarioDAO = new UsuarioDAO();
					usuarioDAO.editarUsuario();
					
					Perfil perfil = new Perfil();
					frame.setVisible(false);
					perfil.abrePerfil();
				}
			}
		});
		btnEditarPerfil.setBackground(new Color(255, 255, 255));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Perfil perfil = new Perfil();
				frame.setVisible(false);
				perfil.abrePerfil();
			}
		});
		panel_2_2.add(btnCancelar);
	}

	public void abreEditarPerfil() {
		frame.setVisible(true);
		
	}

}
