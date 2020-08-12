package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tabela.Adicionar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Dados2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAbates;
	private JTextField textPosicao;
	private Adicionar ad = new Adicionar();
	public String lb = Adicionar.getLb1();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dados2 frame2 = new Dados2();
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
	public Dados2() {
	
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
		
		textAbates = new JTextField();
		textAbates.setColumns(10);
		textAbates.setBounds(39, 61, 47, 20);
		contentPane.add(textAbates);
		
		JLabel lblNewLabel_1 = new JLabel("POSI\u00C7\u00C3O");
		lblNewLabel_1.setBounds(125, 39, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		textPosicao = new JTextField();
		textPosicao.setColumns(10);
		textPosicao.setBounds(125, 61, 52, 20);
		contentPane.add(textPosicao);
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textAbates.getText().equals("")&&textPosicao.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Os campos estão em branco");
				}
				else {
					String valor1 = textAbates.getText();
					String valor2 = textPosicao.getText();
					
					if(Adicionar.soConterNumeros(valor1) && Adicionar.soConterNumeros(valor2)) {
						int abates=(Integer.parseInt(valor1));
						int quedas=(Integer.parseInt(valor2));

						if((abates >0) && (quedas >0)) {
							ad.setAbates(abates);
							ad.setQueda1(quedas);
							dispose();
						}
						else
							JOptionPane.showMessageDialog(null,"Não podem ter números negativos"); 
							textAbates.setText(""); textPosicao.setText("");
					}
					else
						JOptionPane.showMessageDialog(null, "Só pode haver números e não podem ser negativos");
						textAbates.setText(""); textPosicao.setText("");
				}
			}
			
		});
		btnNewButton.setBounds(250, 11, 89, 30);
		contentPane.add(btnNewButton);
		dispose();
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
			
		});
		Cancelar.setBounds(250, 62, 89, 30);
		contentPane.add(Cancelar);
		
		JLabel lbQuedas = new JLabel(lb);
		lbQuedas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbQuedas.setBounds(39, 0, 155, 31);
		contentPane.add(lbQuedas);
	}
}
