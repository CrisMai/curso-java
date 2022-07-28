package br.com.cris.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {

		System.out.println("Inicio Postgresql");
		String sql = "select codigo, nome, sexo, email from pessoa";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		
		try {
			Connection conexao = DriverManager.getConnection(url, "postgres", "teste");
			PreparedStatement pstm = conexao.prepareStatement(sql);

			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println("Nome: " + rs.getString("nome") + " \nEmail: " + rs.getString("email"));
			}
			rs.close();
			pstm.close();
			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim Postgresql");
	}

}
