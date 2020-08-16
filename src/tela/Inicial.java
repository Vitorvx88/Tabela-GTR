package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Repositorio.Adicionar;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textQuedas;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(335, 210, 89, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Come\u00E7ar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textQuedas.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Os campos estão em branco");
				}
				else {
					String valor1 = textQuedas.getText();
					if(Adicionar.soConterNumeros(valor1)) {
						if(Repositorio.Adicionar.soConterNumeros(valor1)) {
							int valor2 = Integer.parseInt(valor1);
							if(valor2 >0) {
								if(valor2<4) {
									Repositorio.Adicionar.setNumber(valor2);
									TelaP exibir = new TelaP();
									exibir.setVisible(true);
									exibir.setLocationRelativeTo(null);
									exibir.setResizable(false);
									dispose();
								}
								else {
									JOptionPane.showMessageDialog(null,"O maximo de Quedas são 3!");
									textQuedas.setText("");
								}
							}
							else {
								JOptionPane.showMessageDialog(null,"Não podem ter números negativos");
								textQuedas.setText("");
							}
						}
						else {
							JOptionPane.showMessageDialog(null,"Não pode conter letras, apenas números!");
							textQuedas.setText("");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Só pode haver números e não podem ser negativos");
						textQuedas.setText("");
					}
				}
			}
		});
		btnNewButton_1.setBounds(151, 133, 113, 40);
		contentPane.add(btnNewButton_1);
		
		textQuedas = new JTextField();
		textQuedas.setBounds(182, 102, 44, 20);
		contentPane.add(textQuedas);
		textQuedas.setColumns(10);
		
		lblNewLabel = new JLabel("QUEDAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(156, 40, 138, 32);
		contentPane.add(lblNewLabel);
	}
}
