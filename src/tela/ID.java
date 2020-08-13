package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import tabela.Adicionar;
import tabela.AttLista;
import tabela.Tabela;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ID extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ID frame = new ID();
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
	public ID() {
		TelaP exibir1 = new TelaP();
		exibir1.setVisible(true);
		exibir1.setLocationRelativeTo(null);
		exibir1.setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 321, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID n\u00E3o encontrado! Digite manualmente.");
		lblNewLabel.setBounds(40, 11, 233, 24);
		contentPane.add(lblNewLabel);
		
		textID = new JTextField();
		textID.setBounds(127, 59, 35, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(138, 46, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("REMOVER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String IDaux=textID.getText();
					boolean Number=tabela.Adicionar.soConterNumeros(IDaux);
					if(IDaux.equals("")) {
						JOptionPane.showMessageDialog(null, "O campo ID não pode estar em branco!");
					}
					else {
						if(Number) {
							int ID = Integer.parseInt(IDaux);
							boolean VerficID=tabela.Adicionar.buscar(ID);
							if(VerficID) {
								Adicionar.tabela.remove(ID);
			
								for(int i=0; i<Adicionar.tabela.size(); i++) {
									AttLista a1 = new AttLista (Adicionar.att.size()-1,Adicionar.tabela.get(i).getTime(),Adicionar.tabela.get(i).getQuedas(),Adicionar.tabela.get(i).getAbates(),Adicionar.tabela.get(i).getTotal());
									Adicionar.AddTb(a1);
								}
								Adicionar.tabela.removeAll(Adicionar.tabela);
								
								for(int i=0; i< Adicionar.att.size(); i++) {
									Tabela a1 = new Tabela(Adicionar.tabela.size(),Adicionar.att.get(i).getTime(),Adicionar.att.get(i).getQuedas(),Adicionar.att.get(i).getAbates(),Adicionar.att.get(i).getTotal());
									Adicionar.Add(a1);
								}
								Adicionar.att.removeAll(Adicionar.att);
								
								JOptionPane.showMessageDialog(null, "ID removido!");
								exibir1.setVisible(false);
								TelaP exibir = new TelaP();
								exibir.setVisible(true);
								exibir.setResizable(false);
								exibir.setLocationRelativeTo(null);
								dispose();	
								
							}
							else
								JOptionPane.showMessageDialog(null, "Esse ID não existe!");
								textID.setText("");
						}
						else
							JOptionPane.showMessageDialog(null, "Digite o numero de ID corretamente!");
							textID.setText("");
					}
				}
				catch(Exception c) {
					JOptionPane.showMessageDialog(null, "Esse ID não existe!");
				}
			}
		});
		btnNewButton.setBounds(92, 88, 106, 23);
		contentPane.add(btnNewButton);
	}
}
