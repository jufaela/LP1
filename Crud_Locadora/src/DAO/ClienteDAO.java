package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.ClienteDTO;

public class ClienteDAO {
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<ClienteDTO> lista = new ArrayList<>();
	
	public void cadastrarCliente(ClienteDTO objclientedto) {
		String sql = "insert into cliente (nome_cliente, endereco_cliente) values (?,?)";
		
		conn = new Conexao().conectaBD();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objclientedto.getNome_cliente());
			pstm.setString(2, objclientedto.getEndereco_cliente());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ClienteDAO Cadastrar" + erro);
			
		}
		
	}
	
	public ArrayList<ClienteDTO> PesquisarCliente(){
		
		String sql = "select * from cliente";
		conn = new Conexao().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.execute();
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				ClienteDTO objclienteDTO = new ClienteDTO();
				objclienteDTO.setId_cliente(rs.getInt("id_cliente"));
				objclienteDTO.setNome_cliente(rs.getString("nome_cliente"));
				objclienteDTO.setEndereco_cliente(rs.getString("endereco_cliente"));
				
				lista.add(objclienteDTO);
			}
			
		} catch (SQLException erro) {
			JOptionPane.showConfirmDialog(null,"ClienteDAO PESQUISAR: " + erro);
		}
		
		return lista;
		
	}

}
