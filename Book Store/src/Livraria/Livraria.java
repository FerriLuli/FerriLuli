package Livraria;

import javax.swing.JOptionPane;

public class Livraria {

	public static void main(String[] args) {
		int opt = 0;
		while(opt==0) {
			opt = JOptionPane.showConfirmDialog(null, "Você gostaria de adicionar um produto ao catálogo?");
			if (opt == 0) {
				int opt_2 = Integer.parseInt(JOptionPane.showInputDialog("Qual dos produtos quer adicionar?"+"\n1 - Livro Físico"+"\n2 - Ebook"+"\n3 - Revista"));
				switch (opt_2) {
				case 1:
					var nome = JOptionPane.showInputDialog("Digite o nome do item:");
					var descricao = JOptionPane.showInputDialog("Digite a descrição do item:");
					var valor  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do item:"));
					var taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de impressão do item:"));
					var txDesconto = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de desconto do item:"));
					LivroFisico lf = new LivroFisico(nome, descricao, valor, taxa, txDesconto);
					JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso, confira as informações na próxima janela");
					lf.Escreve();
				break;
				case 2:
					var nomeE = JOptionPane.showInputDialog("Digite o nome do item:");
					var descricaoE = JOptionPane.showInputDialog("Digite a descrição do item:");
					var valorE  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do item:"));
					var txDescontoE = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de desconto do item:"));
					Ebook e = new Ebook(nomeE, descricaoE, valorE, txDescontoE);
					JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso, confira as informações na próxima janela");
					e.Escreve();
				break;
				case 3:
					var nomeR = JOptionPane.showInputDialog("Digite o nome do item:");
					var descricaoR = JOptionPane.showInputDialog("Digite a descrição do item:");
					var valorR  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do item:"));
					var taxaR = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de impressão do item:"));
					var txDescontoR = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de desconto do item:"));
					Revista r = new Revista(nomeR, descricaoR, valorR, taxaR, txDescontoR);
					JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso, confira as informações na próxima janela");
					r.Escreve();
				break;
				default:
					continue;	
				}
			}else if(opt==1) {
				continue;
			}else {
				System.exit(0);
			}

		}
		
	}

}
