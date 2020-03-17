package br.com.zup.estrelas.delorean.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.zup.estrelas.delorean.factory.ConnectionFactory;
import br.com.zup.estrelas.delorean.pojo.Carro;

public class CarroDao {
	
	Connection conexao;
	
	public CarroDao() {
		conexao = new ConnectionFactory().getConnection();
	}

	public void insereCarro(Carro carro) {
		
		String sql = "insert into carro values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, carro.getPlaca());
			stmt.setString(2, carro.getCor());
			stmt.setString(3, carro.getNome());
			stmt.setString(4, carro.getFabricante());
			stmt.setFloat(5, carro.getVelMax());
			stmt.setFloat(6, carro.getPeso());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			
			System.out.println("Erro ao inserir o carro");
			System.out.println(e.getMessage());
		}
		
		
	}
}
