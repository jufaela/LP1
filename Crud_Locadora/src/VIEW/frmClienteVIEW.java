package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.ClienteDAO;
import DTO.ClienteDTO;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmClienteVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClienteVIEW frame = new frmClienteVIEW();
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
	public frmClienteVIEW() {
		setResizable(false);
		setTitle("Cadastro de cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 434, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtNome.setBounds(10, 36, 414, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(0, 67, 434, 14);
		contentPane.add(lblNewLabel_1);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtEndereco.setBounds(10, 92, 414, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome, endereco;
				
				nome = txtNome.getText();
				endereco = txtEndereco.getText();
				
				ClienteDTO objclientedto = new ClienteDTO();
				objclientedto.setNome_cliente(nome);
				objclientedto.setEndereco_cliente(endereco);
				
				ClienteDAO objclientedao = new ClienteDAO();
				objclientedao.cadastrarCliente(objclientedto);
				
				txtNome.setText("");
				txtEndereco.setText("");
				
			}
		});
		btnCadastrar.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCadastrar.setBounds(274, 123, 89, 23);
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
		btnVoltar.setBounds(77, 123, 89, 23);
		contentPane.add(btnVoltar);
	}

}
