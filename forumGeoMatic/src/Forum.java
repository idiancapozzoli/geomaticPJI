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
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class Forum {

	private JFrame frame;
	private JTable table;
	private Usuario usuario;

	/**
	 * Create the application.
	 */
	public Forum(Usuario usuario) {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblFrum = new JLabel("F\u00D3RUM");
		lblFrum.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblFrum);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 205));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Alguem me ajuda a resolver...", "@teressan_pedro"},
				{"Poderiam me informar quando...", "@idian"},
				{"Por obsequio seria possivel...", "@SrIta"},
				{"Qaundo sr\u00E1 divulgado o gaba...", "@fulano"},
				{"Como faz para increver a ...", "@EscolaJardins"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setEnabled(false);
		table.setBackground(Color.WHITE);
		panel_1.add(table, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		JButton btnAddTopico = new JButton("Adcionar Topico");
		btnAddTopico.setBackground(new Color(0, 0, 205));
		panel_2.add(btnAddTopico);
		btnAddTopico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaTopico telaTopico = new TelaTopico(usuario);
				frame.setVisible(false);
				telaTopico.abreTelaTopico();
			}
		});
		
		JButton btnNavegarForum = new JButton("Navegar Pelo F\u00F3rum");
		btnNavegarForum.setBackground(new Color(0, 0, 205));
		panel_2.add(btnNavegarForum);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 205));
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnVoltarPerfil = new JButton("Voltar");
		btnVoltarPerfil.setBackground(new Color(0, 0, 205));
		panel_3.add(btnVoltarPerfil);
		btnVoltarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Perfil perfil= new Perfil(usuario);
				frame.setVisible(false);
				perfil.abrePerfil();
			}
		});
	}
	
	public void abreForum() {
		frame.setVisible(true);		
		
	}

}
