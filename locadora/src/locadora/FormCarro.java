package locadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCarro extends JFrame {

	private JPanel contentPane;
	private JTextField Marca;
	private JTextField Ano;
	private JTextField Preco;
	private JTextField Modelo;
	private JTextField Placa;
    private Carro C1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCarro frame = new FormCarro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{154, 34, 86, 0};
		gbl_contentPane.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		Modelo = new JTextField();
		GridBagConstraints gbc_Modelo = new GridBagConstraints();
		gbc_Modelo.insets = new Insets(0, 0, 5, 5);
		gbc_Modelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_Modelo.gridx = 1;
		gbc_Modelo.gridy = 0;
		contentPane.add(Modelo, gbc_Modelo);
		Modelo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Marca = new JTextField();
		GridBagConstraints gbc_Marca = new GridBagConstraints();
		gbc_Marca.insets = new Insets(0, 0, 5, 5);
		gbc_Marca.fill = GridBagConstraints.HORIZONTAL;
		gbc_Marca.gridx = 1;
		gbc_Marca.gridy = 1;
		contentPane.add(Marca, gbc_Marca);
		Marca.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ano");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		Ano = new JTextField();
		GridBagConstraints gbc_Ano = new GridBagConstraints();
		gbc_Ano.insets = new Insets(0, 0, 5, 5);
		gbc_Ano.fill = GridBagConstraints.HORIZONTAL;
		gbc_Ano.gridx = 1;
		gbc_Ano.gridy = 2;
		contentPane.add(Ano, gbc_Ano);
		Ano.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		Preco = new JTextField();
		GridBagConstraints gbc_Preco = new GridBagConstraints();
		gbc_Preco.insets = new Insets(0, 0, 5, 5);
		gbc_Preco.fill = GridBagConstraints.HORIZONTAL;
		gbc_Preco.gridx = 1;
		gbc_Preco.gridy = 3;
		contentPane.add(Preco, gbc_Preco);
		Preco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Placa");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		JButton Registrar = new JButton("Registrar");
		Registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				C1 = new Carro(Marca.getText(), Modelo.getText(), Integer.parseInt(Ano.getText()), Placa.getText(), Float.parseFloat(Preco.getText()));//cria o carro com as informações do metodo construtor
				System.out.println("Modelo: " + C1.getModelo() + "\nMarca: " + C1.getMarca() +  "\nAno: " + C1.getAno() + "\nPreço: " + C1.getPreco());//imprime no console
				Marca.setText("");//limpar o formulario dps de inserir informação
				Modelo.setText("");
				Ano.setText("");
				Placa.setText("");
				Preco.setText("");
			}
		});
		
		Placa = new JTextField();
		GridBagConstraints gbc_Placa = new GridBagConstraints();
		gbc_Placa.insets = new Insets(0, 0, 5, 5);
		gbc_Placa.fill = GridBagConstraints.HORIZONTAL;
		gbc_Placa.gridx = 1;
		gbc_Placa.gridy = 4;
		contentPane.add(Placa, gbc_Placa);
		Placa.setColumns(10);
		GridBagConstraints gbc_Registrar = new GridBagConstraints();
		gbc_Registrar.insets = new Insets(0, 0, 0, 5);
		gbc_Registrar.gridx = 1;
		gbc_Registrar.gridy = 8;
		contentPane.add(Registrar, gbc_Registrar);
	}

}
