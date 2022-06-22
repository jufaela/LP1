package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.FuncionarioDTO;
import DTO.VeiculoDTO;

public class VeiculoDAO {
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<VeiculoDTO> lista = new ArrayList<>();
	
	public void cadastrarVeiculo(VeiculoDTO objveiculodto) {
		String sql = "insert into carro (marca_carro, modelo_carro, ano_carro, cor_carro, preco_carro) values (?,?,?,?,?)";
		
		conn = new Conexao().conectaBD();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objveiculodto.getMarca_veiculo());
			pstm.setString(2, objveiculodto.getModelo_veiculo());
			pstm.setInt(3, objveiculodto.getAno_veiculo());
			pstm.setString(4, objveiculodto.getCor_veiculo());
			pstm.setFloat(5, objveiculodto.getPreco_veiculo());
			
			pstm.execute();
			pstm.close();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"VeiculoDAO" + erro);
		}
	}
	
public ArrayList<VeiculoDTO> PesquisarVeiculo(){
		
		String sql = "select * from carro";
		conn = new Conexao().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.execute();
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				VeiculoDTO objveiculoDTO = new VeiculoDTO();
				objveiculoDTO.setId_veiculo(rs.getInt("id_carro"));
				objveiculoDTO.setMarca_veiculo(rs.getString("marca_carro"));
				objveiculoDTO.setModelo_veiculo(rs.getString("modelo_carro"));
				objveiculoDTO.setAno_veiculo(rs.getInt("ano_carro"));
				objveiculoDTO.setCor_veiculo(rs.getString("cor_carro"));
				objveiculoDTO.setPreco_veiculo(rs.getFloat("preco_carro"));
				
				lista.add(objveiculoDTO);
			}
			
		} catch (SQLException erro) {
			JOptionPane.showConfirmDialog(null,"VeiculoDAO PESQUISAR: " + erro);
		}
		
		return lista;
		
	}

}
