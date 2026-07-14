package colecionismo;

public class Usuario {

	private String nomeUsuario;
	private String email;
	private int dataNascimento;
	private int telefone;
	private String areaInteresse;
	private ArrayList<Colecao> colecoes; 
	private FotoPerfil;
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void new criarColecao() {
		var colecao = new Colecao();
		this.colecoes.add(colecao);
	}
	public void new adicionarFotoPerfil() {
		FotoPerfil fotoPerfil = new FotoPerfil();
		this.fotoPerfil.add(fotoPerfil);
	}
	

}
