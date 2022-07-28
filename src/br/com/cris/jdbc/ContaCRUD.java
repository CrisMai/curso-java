package br.com.cris.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContaCRUD {

	public void criar(Connection conexao, Conta conta) throws SQLException {
		String sql = "insert into conta values (?, ?, ?)";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);
			pstm.setInt(1, conta.numero);
			pstm.setString(2, conta.cliente);
			pstm.setDouble(3, conta.saldo);
			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alterar(Connection conexao, Conta conta) throws SQLException {
		String sql = "update conta set cliente=?, saldo=? where numero=?";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);
			pstm.setString(1, conta.cliente);
			pstm.setDouble(2, conta.saldo);
			pstm.setInt(3, conta.numero);
			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletar(Connection conexao, Conta conta) throws SQLException {
		String sql = "delete conta where numero=?";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);
			pstm.setInt(1, conta.numero);
			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Conta> ler(Connection conexao) {
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero, cliente, saldo from conta";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			rs.close();
			pstm.close();
			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		try (Connection conexao = DriverManager.getConnection(url, "postgres", "teste")) {
			ContaCRUD crud = new ContaCRUD();

			Conta conta1 = new Conta(1, "Cris", 10000.10);
			conta1.saldo = 9000.10;
			crud.alterar(conexao, conta1);

			Conta conta2 = new Conta(2, "Rafael", 8000.20);
			crud.deletar(conexao, conta2);
			Conta conta3 = new Conta(3, "Rafaela", 6000.30);

			crud.criar(conexao, conta1);
			crud.criar(conexao, conta2);
			crud.criar(conexao, conta3);

			List<Conta> contas = crud.ler(conexao);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		}
	}

}
