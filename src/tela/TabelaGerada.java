package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Repositorio.Adicionar;

import java.awt.event.ActionListener;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class TabelaGerada extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaGerada frame = new TabelaGerada();
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
	public TabelaGerada() {
		
		
		setTitle("TABELA FINAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 197);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"COLOCA\u00C7\u00C3O", "TIME", "ABATES", "TOTAL"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(78);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(61);
		scrollPane.setViewportView(table);
		Collections.sort(Repositorio.Adicionar.tabela);
		for(int i = 0; i < Repositorio.Adicionar.tabela.size(); i++) {
			
			if(Adicionar.Empate(Adicionar.tabela.get(i).getTotal(),Adicionar.tabela.get(i).getID())) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object [] {"EMPATE",Adicionar.tabela.get(i).getTime(),Adicionar.tabela.get(i).getAbates(),Adicionar.tabela.get(i).getTotal(),0});
				scrollPane.setViewportView(table);
			}
			else {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object [] {i+1+"º",Adicionar.tabela.get(i).getTime(),Adicionar.tabela.get(i).getAbates(),Adicionar.tabela.get(i).getTotal(),0});
				scrollPane.setViewportView(table);
			}
		}
		scrollPane.setViewportView(table);
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaP exibir = new TelaP();
				exibir.setVisible(true);
				exibir.setLocationRelativeTo(null);
				exibir.setResizable(false);
				dispose();
				exibir.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(166, 219, 107, 31);
		contentPane.add(btnNewButton);
	}
}
