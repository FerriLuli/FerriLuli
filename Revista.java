package Livraria;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Revista implements Produto, Fisico, Desconto{
	private double taxa;
	private String nome;
	private String descricao;
	private double valor;
	private double valorDesconto;
	
	public Revista (String nome, String descricao, double valor, double taxa, float txDesconto){
		this.nome = getNome(nome);
		this.descricao = getDescricao(descricao);
		this.valor = getValor(valor);
		this.setTaxa(getTaxaImpressao(taxa));
		this.valorDesconto = getDesconto(valor, txDesconto);
	}

	@Override
	public double getTaxaImpressao(double taxa) {
		
		return taxa;
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

	@Override
	public void Escreve() {
		JOptionPane.showMessageDialog(null, toString());
		
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Revista selecionada \ntaxa de impressão:"+taxa+"\nnome: "+nome+"\ndescricao: "+descricao+"\nvalor: R$"+valor+"\nValor com desconto: R$"+df.format(valorDesconto);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	

}
