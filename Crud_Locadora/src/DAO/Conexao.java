package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
	public Connection conectaBD() {//metodo do tipo conection nome conectabd
		Connection conn = null;//o conection recebe valor null por enquanto
		
		try {//vai tentar executar
			String url = "jdbc:mysql://localhost:3306/crud_locadora?user=root&password=";
			conn = DriverManager.getConnection(url);//fazer a conexao do java com o banco
			
		} catch (SQLException erro) {//se der erro da essa mensagem
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}
		
		return conn;//por n ser void retorna o conn que faz a conexão
	}
}
