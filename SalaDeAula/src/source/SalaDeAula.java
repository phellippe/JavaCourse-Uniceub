package source;

import java.util.ArrayList;

/**
 * Representa uma sala de aula com estudantes cada sala de aula tem uma lusta de
 * estudantes e um array que representa os lugares na sala
 * 
 * @author felip
 *
 */

public class SalaDeAula {

	String nomePredio;
	String nomeSala;
	ArrayList<Estudante> estudantes;
	Assento[][] assentos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaDeAula cursoJava = new SalaDeAula("Biblioteca", "Reuni�es",5,5);
		Estudante ana = new Estudante("Ana", "31213");
		Estudante caio = new Estudante("Caio", "123");
		
		cursoJava.AddEstudante(ana);
		cursoJava.AddEstudante(caio);
		
		cursoJava.designaEstudanteACadeira(ana);
		cursoJava.designaEstudanteACadeira(caio);
		
		cursoJava.printEstudantes();
		System.out.println(cursoJava);
	}

	public SalaDeAula(String nomePredio, String nomeSala, int linhas, int colunas) {
		this.nomePredio = nomePredio;
		this.nomeSala = nomeSala;
		this.assentos = new Assento[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++)
				assentos[i][j] = new Assento(i, j);
		}
		this.estudantes = new ArrayList<Estudante>();

	}

	public void AddEstudante(Estudante estudante) {
		this.estudantes.add(estudante);
	}

	/**
	 * Encontra um assento dispon�vel e designa para um aluno
	 * 
	 * @param estudante que receber� o assento
	 */
	public void designaEstudanteACadeira(Estudante estudante) {
		int linhas = this.assentos.length; // pega o numero de linha dos assentos
		int colunas = this.assentos[0].length; // pega o numero de colunas dos assentos
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (this.assentos[i][j].estudanteNaCadeira == null) {
					this.assentos[i][j].poeEstudanteNaCadeira(estudante);
					return;
				}
			}
		}
	}

	public void printEstudantes() {
		System.out.println("Estudantes na sala: ");

		for (Estudante estudante : this.estudantes) {
			System.out.println(estudante); // chama o m�todo toString
		}
	}
	public String toString() {
		int linhas = this.assentos.length; // pega o numero de linha dos assentos
		int colunas = this.assentos[0].length; // pega o numero de colunas dos assentos
		String s = "\n"; // \n pula uma linha
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				s += this.assentos[i][j] + "\t"; // \t � tab
			}
			s += "\n";
		}
		return s;
	}
	
}
