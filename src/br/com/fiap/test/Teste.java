package br.com.fiap.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.model.Acessorio;
import br.com.fiap.model.Veiculo;

public class Teste {
	
	private static List<Veiculo> veiculos = new ArrayList<>();
	private static double valorTotal = 0;
	private static List<Double> valores = new ArrayList<>();
	
	
	public static void cadastraVeiculo(Veiculo v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ano de fabricação do veículo: ");
		v.setAnoFabricacao(sc.nextInt());
			
		System.out.println("Modelo de veiculo: ");
		v.setModelo(sc.next());
			
		System.out.println("Valor do veículo: ");
		v.setValor(sc.nextFloat());
			
		System.out.println("Montadora do veículo: ");
		v.setMontadora(sc.next());
		
		armazenaVeiculo(v);
		valorTotal = valorTotal +  v.getValor();
		valores.add(v.getValor());
	
	}
	
	public static void armazenaVeiculo(Veiculo v) {
		veiculos.add(v);
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public double getMediaValorTotal() {
		return (valorTotal/valores.size());
	}
	
	public Veiculo getMaiorValor() {
		double maisCaro = Collections.max(valores);
		int i = valores.indexOf(maisCaro);
		return veiculos.get(i);
	}
	
	public static void main(String[] args) {
	
		Teste teste = new Teste();
		
		List<Veiculo> veiculos = new ArrayList<>();
		
		Acessorio a1 = new Acessorio("Ar Condicionado", 450.00);
		Acessorio a2 = new Acessorio("Central Multimídia", 1200.00);
		Acessorio a3 = new Acessorio("Banco de Couro", 1850.00);
	
		
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		Veiculo v4 = new Veiculo();
		Veiculo v5 = new Veiculo();
		
		cadastraVeiculo(v1);
		cadastraVeiculo(v2);
		cadastraVeiculo(v3);
		cadastraVeiculo(v4);
		cadastraVeiculo(v5);
		
		
		System.out.println("Valor total dos veículos: " + teste.getValorTotal());
		System.out.println("A média dos valores dos carros é: " + teste.getMediaValorTotal());
		System.out.println("O carro de maior valor: " + teste.getMaiorValor());
		

	

		
	}
}


