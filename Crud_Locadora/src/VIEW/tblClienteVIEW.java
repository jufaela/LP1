package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.ClienteDAO;
import DTO.ClienteDTO;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;

public class tblClienteVIEW extends JFrame {

	private JPanel contentPane;
	private JTable tblCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tblClienteVIEW frame = new tblClienteVIEW();
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
	public tblClienteVIEW() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
				objfrmprincipalview.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(176, 222, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 198);
		contentPane.add(scrollPane);
		
		tblCliente = new JTable();
		tblCliente.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		tblCliente.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Endere\u00E7o"
			}
		));
		scrollPane.setViewportView(tblCliente);
		listarCliente();
		
	}
	
	private void listarCliente() {
		try {
			ClienteDAO objclientedao = new ClienteDAO();
			DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
			model.setNumRows(0);
			
			ArrayList<ClienteDTO> lista = objclientedao.PesquisarCliente();
			
			for(int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getId_cliente(),
						lista.get(num).getNome_cliente(),
						lista.get(num).getEndereco_cliente()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"ListarClientes" + erro);
		}
	}
}
