package br.com.zup.estrelas.delorean.programa;

import java.util.Scanner;

import br.com.zup.estrelas.delorean.dao.CarroDao;
import br.com.zup.estrelas.delorean.pojo.Carro;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		CarroDao carroDao = new CarroDao();
		
		System.out.println("Seja bem vindo ao cadastro de carro!");
		
		Scanner input = new Scanner(System.in);
		
		Carro carro = new Carro();

		System.out.println("Digite a placa do carro");
		carro.setPlaca(input.nextLine());
		
		carro.setCor("Prata");
		carro.setNome("Polo");
		carro.setFabricante("Volks");
		carro.setVelMax(200F);
		carro.setPeso(1000F);
		
		
		carroDao.insereCarro(carro);
		
		input.close();
	}

}
