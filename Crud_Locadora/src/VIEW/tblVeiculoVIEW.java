package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.ClienteDAO;
import DAO.VeiculoDAO;
import DTO.ClienteDTO;
import DTO.VeiculoDTO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class tblVeiculoVIEW extends JFrame {

	private JPanel contentPane;
	private JTable tblVeiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tblVeiculoVIEW frame = new tblVeiculoVIEW();
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
	public tblVeiculoVIEW() {
		setTitle("Ve\u00EDculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 203);
		contentPane.add(scrollPane);
		
		tblVeiculo = new JTable();
		tblVeiculo.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Marca", "Modelo", "Ano", "Cor", "Pre\u00E7o"
			}
		));
		scrollPane.setViewportView(tblVeiculo);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
				objfrmprincipalview.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(168, 225, 89, 23);
		contentPane.add(btnNewButton);
		listarVeiculo();
	}
	
	private void listarVeiculo() {
		try {
			VeiculoDAO objveiculodao = new VeiculoDAO();
			DefaultTableModel model = (DefaultTableModel) tblVeiculo.getModel();
			model.setNumRows(0);
			
			ArrayList<VeiculoDTO> lista = objveiculodao.PesquisarVeiculo();
			
			for(int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getId_veiculo(),
						lista.get(num).getMarca_veiculo(),
						lista.get(num).getModelo_veiculo(),
						lista.get(num).getAno_veiculo(),
						lista.get(num).getCor_veiculo(),
						lista.get(num).getPreco_veiculo()
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"ListarVeiculos" + erro);
		}
	}

}
