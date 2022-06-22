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

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;

public class tblFuncionarioVIEW extends JFrame {

	private JPanel contentPane;
	private JTable tblFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tblFuncionarioVIEW frame = new tblFuncionarioVIEW();
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
	public tblFuncionarioVIEW() {
		setTitle("Funcion\u00E1rios");
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
		
		tblFuncionario = new JTable();
		tblFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		tblFuncionario.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Endere\u00E7o", "Nome", "Id"
			}
		));
		scrollPane.setViewportView(tblFuncionario);
		listarFuncionario();
		
	}
	
	private void listarFuncionario() {
		try {
			FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
			DefaultTableModel model = (DefaultTableModel) tblFuncionario.getModel();
			model.setNumRows(0);
			
			ArrayList<FuncionarioDTO> lista = objfuncionariodao.PesquisarFuncionario();
			
			for(int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getId_funcionario(),
						lista.get(num).getNome_funcionario(),
						lista.get(num).getEndereco_funcionario()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"ListarFuncionarios" + erro);
		}
	}
}
