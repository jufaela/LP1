package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import VIEW.tblFuncionarioVIEW;

public class frmPrincipalVIEW extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipalVIEW frame = new frmPrincipalVIEW();
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
	public frmPrincipalVIEW() {
		setResizable(false);
		setTitle("Menu principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que deseja fazer?");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel.setBounds(5, 5, 424, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton btnListarFuncionrio = new JButton("Listar Funcion\u00E1rios");
		btnListarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tblFuncionarioVIEW objtblfuncionarioview = new tblFuncionarioVIEW();
				objtblfuncionarioview.setVisible(true);
				dispose();
		
			}
		});
		btnListarFuncionrio.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnListarFuncionrio.setBounds(250, 46, 151, 23);
		contentPane.add(btnListarFuncionrio);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmClienteVIEW objfrmclienteview = new frmClienteVIEW();
				objfrmclienteview.setVisible(true);
				dispose();
				
			}
		});
		btnCadastrarCliente.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCadastrarCliente.setBounds(27, 88, 151, 23);
		contentPane.add(btnCadastrarCliente);
		
		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tblClienteVIEW objtblclienteview = new tblClienteVIEW();
				objtblclienteview.setVisible(true);
				dispose();
			}
		});
		btnListarClientes.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnListarClientes.setBounds(250, 88, 151, 23);
		contentPane.add(btnListarClientes);
		
		JButton btnCadastrarVeculo = new JButton("Cadastrar Ve\u00EDculo");
		btnCadastrarVeculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVeiculoVIEW objfrmveiculoview = new frmVeiculoVIEW();
				objfrmveiculoview.setVisible(true);
				dispose();
				
			}
		});
		btnCadastrarVeculo.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCadastrarVeculo.setBounds(27, 131, 151, 23);
		contentPane.add(btnCadastrarVeculo);
		
		JButton btnListarVeculos = new JButton("Listar Ve\u00EDculos");
		btnListarVeculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tblVeiculoVIEW objtblveiculoview = new tblVeiculoVIEW();
				objtblveiculoview.setVisible(true);
				dispose();
			}
		});
		btnListarVeculos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnListarVeculos.setBounds(250, 131, 151, 23);
		contentPane.add(btnListarVeculos);
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFuncionarioVIEW objfrmfuncionarioview = new frmFuncionarioVIEW();
				objfrmfuncionarioview.setVisible(true);
				dispose();
			}
		});
		btnCadastrarFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCadastrarFuncionario.setBounds(27, 47, 151, 23);
		contentPane.add(btnCadastrarFuncionario);
	}
	

}
