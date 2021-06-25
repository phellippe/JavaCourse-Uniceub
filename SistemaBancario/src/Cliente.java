/**
 * 
 * @author felipe
 *	Essa classe representa um cliente de um banco
 */
public class Cliente {
	String nome;
	String endereco;
	
	//m�todo construtor
	public Cliente (String nome) {
		this.nome = nome;
	}
	// m�todos
	public void armazenaEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String pegaNome() {
		return this.nome;
	}
	
	public String pegaEndereco() {
		return this.endereco;
	}
}
