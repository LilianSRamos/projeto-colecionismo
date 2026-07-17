package colecionismo;
import java.util.ArrayList;

public class Item {
	public String nomeItem;
	private String descricaoItem;
	private String queridinho = "✨";
	public ArrayList <Categorias> categorias = new ArrayList<Categorias>();
		
	public String getNomeItem() {
		return nomeItem;
	}
	 
	public void setAdicionarNome(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public void setAdicionarDescricao(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	
	public void setCadastrarCategorias(Categorias categorias) {
		this.categorias.add(categorias);
	}
	
}
