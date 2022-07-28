package br.com.cris.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String sql = "insert into pessoa values (?, ?, ?, ?)";
		String[] pessoas = {"Vera", "Dani", "Carol", "Paula"};
		
		try {
			Connection conexao = DriverManager.getConnection(url, "postgres", "teste");
			PreparedStatement pstm = conexao.prepareStatement(sql);
			
			for (int i = 0; i < pessoas.length; i++) {
				pstm.setInt(1, i+9);
				pstm.setString(2, pessoas[i]);
				pstm.setString(3, "F");
				pstm.setString(4, pessoas[i].toLowerCase() + "@teste.com");
				pstm.addBatch();
			}
			
			pstm.executeBatch();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Ok");	
		
	}

}
