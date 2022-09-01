package Livraria;

import java.text.DecimalFormat;

public class LivroFisico extends Livro implements Fisico{
	private double taxa;
	
	public LivroFisico(String nome, String descricao, double valor, double taxa, float txDesconto) {
		super(nome, descricao, valor, txDesconto);
		this.setTaxa(getTaxaImpressao(taxa));
		
	}

	@Override
	public double getTaxaImpressao(double taxa) {
		return taxa;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Livro escolhido \nNome: "+nome+"\ndescricao: "+descricao+"\nvalor: R$"+valor+"\nTaxa de impressão: R$"+taxa+"\nValor com desconto: R$"+df.format(valorDesconto);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
