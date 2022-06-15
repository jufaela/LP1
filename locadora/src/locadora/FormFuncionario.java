package locadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FormFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private Funcionario V1;
	ArrayList listaFuncionario;//declara a lista
	private JButton listar;
	private JTextField ano_nasc;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFuncionario frame = new FormFuncionario();
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
	public FormFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel labelnome = new JLabel("Nome");
		GridBagConstraints gbc_labelnome = new GridBagConstraints();
		gbc_labelnome.insets = new Insets(0, 0, 5, 5);
		gbc_labelnome.gridx = 1;
		gbc_labelnome.gridy = 1;
		contentPane.add(labelnome, gbc_labelnome);
		
		nome = new JTextField();
		GridBagConstraints gbc_nome = new GridBagConstraints();
		gbc_nome.insets = new Insets(0, 0, 5, 0);
		gbc_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_nome.gridx = 3;
		gbc_nome.gridy = 1;
		contentPane.add(nome, gbc_nome);
		nome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		cpf = new JTextField();
		GridBagConstraints gbc_cpf = new GridBagConstraints();
		gbc_cpf.insets = new Insets(0, 0, 5, 0);
		gbc_cpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_cpf.gridx = 3;
		gbc_cpf.gridy = 2;
		contentPane.add(cpf, gbc_cpf);
		cpf.setColumns(10);
		
		listaFuncionario = new ArrayList<Funcionario>();//cria a lista
		
		JButton Registrar = new JButton("Registrar");
		Registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				V1 = new Funcionario(nome.getText(), Integer.parseInt(cpf.getText()),  Integer.parseInt(ano_nasc.getText()));// aqui cria um funcionario 
				listaFuncionario.add(V1); //add as informações dele na lista
				//System.out.println("Nome: " + V1.getNome() + "\nCPF: " + V1.getCpf());
				nome.setText("");
				cpf.setText("");
				ano_nasc.setText("");
				
			}
		});
		
		lblNewLabel_1 = new JLabel("Ano Nasc.");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		ano_nasc = new JTextField();
		GridBagConstraints gbc_ano_nasc = new GridBagConstraints();
		gbc_ano_nasc.insets = new Insets(0, 0, 5, 0);
		gbc_ano_nasc.fill = GridBagConstraints.HORIZONTAL;
		gbc_ano_nasc.gridx = 3;
		gbc_ano_nasc.gridy = 3;
		contentPane.add(ano_nasc, gbc_ano_nasc);
		ano_nasc.setColumns(10);
		GridBagConstraints gbc_Registrar = new GridBagConstraints();
		gbc_Registrar.insets = new Insets(0, 0, 5, 0);
		gbc_Registrar.gridx = 3;
		gbc_Registrar.gridy = 7;
		contentPane.add(Registrar, gbc_Registrar);
		
		listar = new JButton("Listar");//aqui é o botão com a função para listar os funcionarios
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0 ; i< listaFuncionario.size(); i++) {
					V1 = (Funcionario)listaFuncionario.get(i);
					System.out.println("nome: " + V1.getNome()+"\nCPF:"+ V1.getCpf()+"\nAno de Nascimento: "+V1.getAno_nasc());
				}
			}
		});
		GridBagConstraints gbc_listar = new GridBagConstraints();
		gbc_listar.gridx = 3;
		gbc_listar.gridy = 8;
		contentPane.add(listar, gbc_listar);
	}

}
