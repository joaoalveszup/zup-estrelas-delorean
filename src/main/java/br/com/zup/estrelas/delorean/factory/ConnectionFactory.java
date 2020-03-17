package br.com.zup.estrelas.delorean.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/estrelas?user=root&password=root&useTimezone=true&serverTimezone=UTC");
		} catch (SQLException e) {
			System.out.println("Falha ao estabelecer conexão com o DB.");
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
}
