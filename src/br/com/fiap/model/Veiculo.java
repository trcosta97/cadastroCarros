package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	private int anoFabricacao;
	private String modelo;
	private float valor;
	private String montadora;
	List<Acessorio> acessorios = new ArrayList<Acessorio>(3);
	
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public List<Acessorio> getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}
	
	public void addAcessorios(Acessorio a) {
		this.acessorios.add(a);
		
		
	}
	@Override
	public String toString() {
		return "[Ano de Fabricação: " + this.anoFabricacao + " - Modelo: " + this.modelo + " - Valor: " + this.valor + " - Montadora: " + this.montadora + " - Acessórios: " + this.acessorios + "]"; 
	}


}
