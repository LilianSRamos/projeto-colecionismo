package colecionismo;
import java.util.ArrayList;

public class Colecao {
	
	private String nomeColecao;
	private String descricaoColecao;
	public ArrayList <Item> item = new ArrayList<Item>();
	public ArrayList <Forum> forum = new ArrayList<Forum>();
	
	public void setNomeColecao(String nomeColecao) {
		this.nomeColecao = nomeColecao;
	}
	public void setDescricaoColecao(String descricaoColecao) {
		this.descricaoColecao = descricaoColecao;
	}
	public void setCadastrarItem(Item item) {
		this.item.add(item);
	}
	public void adicionarForum(Forum forum) {
		this.forum.add(forum);
	}
}
