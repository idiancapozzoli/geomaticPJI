package visao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controle.UsuarioDAO;
import modelo.Usuario;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PesquisarPerfil {

	private JFrame frame;
	private JTextField txtPesquisa;
	private ArrayList<String> pesquisa;
	public PesquisarPerfil() {
		initialize();
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
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
		
		JButton btnIrPerfil = new JButton("Ir para perfil");
		btnIrPerfil.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnIrPerfil);
		btnIrPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Perfil perfil = new Perfil();
				frame.setVisible(false);
				perfil.abrePerfil();
			}
		});
		
		JLabel lblPerfil = new JLabel("PESQUISAR PERFIL");
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPerfil);
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 205));
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPesquisar = new JLabel("PESQUISAR:");
		lblPesquisar.setForeground(Color.WHITE);
		panel_3.add(lblPesquisar);
		
		txtPesquisa = new JTextField();
		panel_3.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		panel_3.add(btnPesquisar);
		
		//table = new JTable();
		//table.setBackground(Color.LIGHT_GRAY);
		//panel_2.add(table, BorderLayout.CENTER);
		
		JList lista = new JList();
		lista.setBackground(Color.LIGHT_GRAY);
		panel_2.add(lista, BorderLayout.CENTER);
		
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				pesquisa = usuarioDAO.consultaUsuario(txtPesquisa.getText());
				lista.setListData(pesquisa.toArray());
			}
		});
		
		
		
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void abrePesquisarPerfil() {
		
		frame.setVisible(true);
		
	}

}
