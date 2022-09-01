package Livraria;

import java.text.DecimalFormat;

public class Ebook extends Livro{

	public Ebook(String nome, String descricao, double valor, float txDesconto) {
		super(nome, descricao, valor, txDesconto);
		
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Livro escolhido \nNome: "+nome+"\ndescricao: "+descricao+"\nvalor: R$"+valor+"\nValor com desconto: R$"+df.format(valorDesconto);
	}

}
