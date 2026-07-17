package colecionismo;
import java.util.ArrayList;

public class Colecao {
	
	private String nomeColecao;
	private String descricaoColecao;
	public ArrayList <Item> item = new ArrayList<Item>();
	
	public void setCadastrarItem(Item item) {
		this.item.add(item);
	}
	public void adicionarForum() {
		
	}
}
