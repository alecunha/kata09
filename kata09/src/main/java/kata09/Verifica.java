package kata09;

import java.util.List;

public class Verifica {
	
	public double soma(List<Item> itens) {
		
		double soma = 0;
		
		for (Item item : Item.values()) {
			
			int quantidade = 0;
			
			for(Item itemList : itens) {
				
				if (item.equals(itemList)) {
					quantidade+=1;
				}
				
			}
			
			if ((quantidade > 0) && (item.getQuantidadeDesconto() != null) && (quantidade >= item.getQuantidadeDesconto())){
				
				int resto = quantidade % item.getQuantidadeDesconto();
				double custoDesconto = item.getPrecoDesconto() * (quantidade/item.getQuantidadeDesconto());
				double custoUnitario = item.getPrecoUnitario()*resto;
				soma+= custoDesconto + custoUnitario;
				
			} else {
				
				soma+=item.getPrecoUnitario() * quantidade;
				
			}
			
		}
		
		
		
		return soma;
	}

}
