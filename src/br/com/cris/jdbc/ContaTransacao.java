package br.com.cris.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContaTransacao {

	public void transferir(Connection conexao, Conta origem, Conta destino, double valor) throws SQLException {
		if (origem.saldo >= valor) {
			
			try {
				conexao.setAutoCommit(false);
				
				/* Saque */
				origem.saldo -= valor;
				alterar(conexao, origem);
				
				/* Depósito */
				destino.saldo += valor;
				alterar(conexao, destino);
				
				conexao.commit();
			} catch (Exception e) {
				conexao.rollback();
			}
		}
	}

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

			
			List<Conta> contas = crud.ler(conexao);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
			
			Conta origem = contas.get(0);
			Conta destino = contas.get(1);
			crud.transferir(conexao, origem, destino, 500);
			
			contas = crud.ler(conexao);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		}
	}

}
