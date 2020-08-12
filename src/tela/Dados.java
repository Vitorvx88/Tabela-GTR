package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import tabela.Adicionar;
import tabela.Tabela;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Dados extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Adicionar ad = new Adicionar();
	private JPanel contentPane;

	private int total=0;
	private JTextField textAb;
	private JTextField textPs;
	public String lb = Adicionar.getLb();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dados frame2 = new Dados();
					frame2.setVisible(true);
					frame2.setLocation(400,350);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dados() {
	
		
		TelaP exibir1 = new TelaP();
		exibir1.setVisible(true);
		exibir1.setLocation(400,200);
		
		setTitle("Informa\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 365, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABATES");
		lblNewLabel.setBounds(39, 31, 86, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("POSI\u00C7\u00C3O");
		lblNewLabel_1.setBounds(125, 39, 69, 20);
		contentPane.add(lblNewLabel_1);
	
	
	
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(textAb.getText().equals("")&&textPs.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Os campos est�o em branco");
					}
					else {						
						if(Adicionar.soConterNumeros(textAb.getText())&&Adicionar.soConterNumeros(textPs.getText())) {
							int abates=(Integer.parseInt(textAb.getText()));
							int quedas=(Integer.parseInt(textPs.getText()));
							int absa =Integer.parseInt(textAb.getText());
							if((abates >0) && (quedas >0)) {
								abates = (abates + ad.getAbates())*2;
								absa = (absa + ad.getAbates());
								total = total + tabela.Adicionar.Posicao(ad.getQueda1())+tabela.Adicionar.Posicao(ad.getQueda2())+tabela.Adicionar.Posicao(quedas);
								total = total + abates;
								Tabela a1 = new Tabela(tabela.Adicionar.tabela.size(),ad.getSetar(),ad.getIndex(),absa,total);
								Adicionar.Add(a1);
								JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
								ad.setAbates2(0);
								ad.setQueda1(0);
								ad.setQueda2(0);
								
								TelaP exibir = new TelaP();
								exibir.setVisible(true);
								exibir.setLocation(400,200);
								dispose();
								exibir1.setVisible(false);
								dispose();
							}
							else
								JOptionPane.showMessageDialog(null, "N�o podem ter n�meros negativos");
						}
						else 
							JOptionPane.showMessageDialog(null, "S� pode haver n�meros e n�o podem ser negativos!");
					}
				}
				catch(Exception c){					
				}
			}
			
		});
		btnNewButton.setBounds(250, 11, 89, 30);
		contentPane.add(btnNewButton);
		dispose();
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ad.setAbates2(0);
				ad.setQueda1(0);
				ad.setQueda2(0);
				dispose();
				TelaP exibir = new TelaP();
				exibir.setVisible(true);
				exibir.setLocation(400,200);
				dispose();
				exibir1.setVisible(false);
			}
			
		});
		Cancelar.setBounds(250, 62, 89, 30);
		contentPane.add(Cancelar);	
		
		JLabel lblQUEDASSSS = new JLabel(lb);
		lblQUEDASSSS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQUEDASSSS.setBounds(44, 0, 150, 31);
		contentPane.add(lblQUEDASSSS);

		
		textAb = new JTextField();
		textAb.setBounds(39, 72, 49, 20);
		contentPane.add(textAb);
		textAb.setColumns(10);

		
		textPs = new JTextField();
		textPs.setBounds(125, 72, 49, 20);
		contentPane.add(textPs);
		textPs.setColumns(10);
	}
}
