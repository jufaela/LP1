package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.FuncionarioDTO;

public class FuncionarioDAO {//dao e o metodo de organização do codigo
	
	Connection conn;//atributos da classe
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<FuncionarioDTO> lista = new ArrayList<>();//declara a lista
	
	public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) {
		String sql = "insert into funcionario (nome_funcionario, endereco_funcionario) values (?,?)";
		
		conn = new Conexao().conectaBD();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objfuncionariodto.getNome_funcionario());
			pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "FuncionarioDAO Cadastrar" + erro);
			
		}
		
	}
	
	public ArrayList<FuncionarioDTO> PesquisarFuncionario(){
		
		String sql = "select * from funcionario";
		conn = new Conexao().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.execute();
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
				objfuncionarioDTO.setId_funcionario(rs.getInt("id_funcionario"));
				objfuncionarioDTO.setNome_funcionario(rs.getString("nome_funcionario"));
				objfuncionarioDTO.setEndereco_funcionario(rs.getString("endereco_funcionario"));
				
				lista.add(objfuncionarioDTO);
			}
			
		} catch (SQLException erro) {
			JOptionPane.showConfirmDialog(null,"FuncionarioDAO PESQUISAR: " + erro);
		}
		
		return lista;
		
	}

}
