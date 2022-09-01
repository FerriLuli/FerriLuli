package Livraria;

import javax.swing.JOptionPane;

public class Livro implements Produto, Desconto{
	protected String nome;
	protected String descricao;
	protected double valor;
	protected double valorDesconto;
	
	
	public Livro (String nome, String descricao, double valor, float txDesconto) {
		this.nome = getNome(nome);
		this.descricao = getDescricao(descricao);
		this.valor = getValor(valor);
		this.valorDesconto = getDesconto(valor, txDesconto);
	}

	@Override
	public void Escreve() {
		JOptionPane.showMessageDialog(null, toString());
	}

	@Override
	public String getNome(String nome) {
		return nome;
	}

	@Override
	public String getDescricao(String descricao) {
		return descricao;
	}

	@Override
	public double getValor(double valor) {
		return valor;
	}
	
	@Override
	public double getDesconto(double valor, float txDesconto) {
		double desconto = (valor-(valor*(txDesconto/100)));
		return desconto;
	}



	
	
	
	

}
