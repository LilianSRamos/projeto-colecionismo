package colecionismo;
import java.util.ArrayList;
import java.util.List;

public class Colecao {

    private String nomeColecao;
    private String descricaoColecao;
    private List<Item> itens = new ArrayList<>();
    private List<Forum> foruns = new ArrayList<>();

    public Colecao() {
        this.nomeColecao = "";
        this.descricaoColecao = "";
    }

    public Colecao(String nomeColecao, String descricaoColecao) {
        this.nomeColecao = nomeColecao;
        this.descricaoColecao = descricaoColecao;
    }

    public void cadastrarItem(Item item) {
        this.itens.add(item);
        System.out.println("Item " + item.getNomeItem() + " cadastrado na coleção " + nomeColecao);
    }

    public void adicionarForum(Forum forum) {
        this.foruns.add(forum);
        System.out.println("Fórum adicionado à coleção " + nomeColecao);
    }

    public String getNomeColecao() {
        return nomeColecao;
    }

    public void setNomeColecao(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    public String getDescricaoColecao() {
        return descricaoColecao;
    }

    public void setDescricaoColecao(String descricaoColecao) {
        this.descricaoColecao = descricaoColecao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Forum> getForuns() {
        return foruns;
    }

    public void setForuns(List<Forum> foruns) {
        this.foruns = foruns;
    }
}