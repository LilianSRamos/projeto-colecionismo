package colecionismo;
import java.util.ArrayList;

public class Usuario {
	
	private String nomeUsuario;
	private String email;
	private String dataNascimento;
	private int telefone;
	private String areaInteresse;
	public ArrayList <Colecao> colecao = new ArrayList<Colecao>();
	public FotoPerfil fotoPerfil;
	public ArrayList <Amigo> amigo = new ArrayList<Amigo>();
	public Premium premium;
	
	public void setCriarColecao (Colecao colecao) {
		
	}
	public void setAdicionarFotoPerfil (FotoPerfil fotoPerfil) {	
		
	}
	
	public void setAdicionarAmigo (Amigo amigo) {
		
	}
	public void setVirarPremium (Premium premium) {
		
	}
}
