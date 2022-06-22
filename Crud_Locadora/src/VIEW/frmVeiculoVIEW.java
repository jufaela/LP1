package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.VeiculoDAO;
import DTO.VeiculoDTO;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmVeiculoVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtPreco;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVeiculoVIEW frame = new frmVeiculoVIEW();
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
	public frmVeiculoVIEW() {
		setResizable(false);
		setTitle("Cadastro de ve\u00EDculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 235, 414, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 67, 414, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cor");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 179, 414, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Ano");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 123, 414, 14);
		contentPane.add(lblNewLabel_5);
		
		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtMarca.setBounds(10, 36, 414, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtModelo.setBounds(10, 92, 414, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtAno.setBounds(10, 148, 414, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtCor.setBounds(10, 204, 414, 20);
		contentPane.add(txtCor);
		txtCor.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtPreco.setBounds(10, 260, 414, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String marca, modelo, cor;
				int ano;
				float preco;
				
				marca = txtMarca.getText();
				modelo = txtModelo.getText();
				cor = txtCor.getText();
				ano = Integer.parseInt(txtAno.getText());
				preco = Float.parseFloat(txtPreco.getText());
				
				VeiculoDTO objveiculodto = new VeiculoDTO();
				objveiculodto.setMarca_veiculo(marca);
				objveiculodto.setModelo_veiculo(modelo);
				objveiculodto.setAno_veiculo(ano);
				objveiculodto.setCor_veiculo(cor);
				objveiculodto.setPreco_veiculo(preco);
				
				VeiculoDAO objveiculodao = new VeiculoDAO();
				objveiculodao.cadastrarVeiculo(objveiculodto);
				
				txtMarca.setText("");
				txtModelo.setText("");
				txtAno.setText("");
				txtCor.setText("");
				txtPreco.setText("");
				
			}
		});
		btnCadastrar.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCadastrar.setBounds(283, 291, 89, 23);
		contentPane.add(btnCadastrar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
				objfrmprincipalview.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(65, 291, 89, 23);
		contentPane.add(btnVoltar);
	}
}
