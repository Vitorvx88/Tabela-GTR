package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Repositorio.Adicionar;



public class TelaP extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Adicionar ad = new Adicionar();
	private JPanel contentPane;
	private JTextField textTag;
	public String nul="";
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaP frame = new TelaP();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaP() {dispose();
		setTitle("Tabela GTR GAMING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		dispose();
		JButton ApagarID = new JButton("Remover");
		ApagarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
					Adicionar.tabela.remove(table.getModel().getRowCount());
					TelaP exibir = new TelaP();
					exibir.setResizable(false);
					exibir.setVisible(true);
					exibir.setLocationRelativeTo(null);

					dispose();
				}
				catch(Exception c) {
					ID exibir = new ID();
					exibir.setVisible(true);
					exibir.setResizable(false);
					exibir.setLocationRelativeTo(null);
					dispose();
				}
			}
		});dispose();
		ApagarID.setBounds(21, 195, 87, 31);
		contentPane.add(ApagarID);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 11, 441, 173);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Time", "Abates", "Total"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(0).setMinWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.getColumnModel().getColumn(2).setPreferredWidth(54);
		table.getColumnModel().getColumn(3).setPreferredWidth(48);
		scrollPane.setViewportView(table);
		

		
		for(int i = 0; i < Repositorio.Adicionar.tabela.size(); i++) {
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.addRow(new Object [] {Repositorio.Adicionar.tabela.get(i).getID(),Adicionar.tabela.get(i).getTime(),Adicionar.tabela.get(i).getAbates(),Adicionar.tabela.get(i).getTotal(),0});
			scrollPane.setViewportView(table);
		}
		scrollPane.setViewportView(table);
		
		textTag = new JTextField();
		textTag.setColumns(10);
		textTag.setBounds(182, 219, 142, 20);
		contentPane.add(textTag);
		
		JLabel lblNewLabel_2 = new JLabel("TAG do Time");
		lblNewLabel_2.setBounds(208, 202, 87, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton Adicionar = new JButton("CADASTRAR");
		Adicionar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER){
					Adicionar.requestFocus();
					}
			}
		});
		Adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String time = textTag.getText();
					time = time.toUpperCase();
					int quedas=Repositorio.Adicionar.getNumber();
					if(textTag.getText().equals("")){
						JOptionPane.showMessageDialog(null,"A Tag do time não pode ficar em branco");
					}
					
					else {
						boolean busca = Repositorio.Adicionar.Verificar(time);
						if(busca!=true) {
							if(quedas>0&&quedas<4) {
								
								
								Repositorio.Adicionar.Setar(time);
								ad.setIndex(quedas);
								
								if(quedas==1) {
									Repositorio.Adicionar.setLb("Ùnica Queda");
									Dados exibir = new Dados();
									exibir.setVisible(true);
									exibir.setResizable(false);
									exibir.setLocationRelativeTo(null);
									dispose();
								}
								else if(quedas==2) {
									Repositorio.Adicionar.setLb1("Primeira Queda");
									Repositorio.Adicionar.setLb("Segunda Queda");
									Dados exibir = new Dados();
									exibir.setVisible(true);
									exibir.setLocationRelativeTo(null);
									exibir.setResizable(false);
									
									Dados2 exibir2 = new Dados2();
									exibir2.setVisible(true);
									exibir2.setLocationRelativeTo(null);
									exibir2.setResizable(false);
									dispose();
								}
								else {
									Repositorio.Adicionar.setLb2("Primeira Queda");
									Repositorio.Adicionar.setLb1("Segunda Queda");
									Repositorio.Adicionar.setLb("Terceira Queda");
									Dados exibir = new Dados();
									exibir.setVisible(true);
									exibir.setResizable(false);
									exibir.setLocationRelativeTo(null);
									
									Dados2 exibir2 = new Dados2();
									exibir2.setVisible(true);
									exibir2.setLocationRelativeTo(null);
									exibir2.setResizable(false);
									
									Dados3 exibir3 = new Dados3();
									exibir3.setVisible(true);
									exibir3.setLocationRelativeTo(null);
									exibir3.setResizable(false);
									dispose();
								}	
							}
							else
								JOptionPane.showMessageDialog(null,"O máximo de quedas é 3!");
						}
						else
							JOptionPane.showMessageDialog(null,"Esse time já tá cadastrado!");
					}
				}
				catch(Exception c){
					JOptionPane.showMessageDialog(null, "Verifique se 'TAG' ou 'QUEDAS' estão preenchidos corretamente!");
				}
			
			}
		});
		Adicionar.setBounds(182, 248, 142, 41);
		contentPane.add(Adicionar);
		
		JButton Sair = new JButton("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Sair.setBounds(20, 250, 87, 37);
		contentPane.add(Sair);
		
		JButton GerarTabela = new JButton("GerarTabela");
		GerarTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					TabelaGerada exibir = new TabelaGerada();
					exibir.setVisible(true);
					exibir.setResizable(false);
					exibir.setLocationRelativeTo(null);
				}
				catch(Exception c) {
					
				}
			}
		});
		GerarTabela.setBounds(368, 202, 109, 54);
		contentPane.add(GerarTabela);
		
		JLabel lblQUEDASSSS = new JLabel("");
		lblQUEDASSSS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQUEDASSSS.setBounds(85, 250, 122, 31);
		contentPane.add(lblQUEDASSSS);
	}
}
