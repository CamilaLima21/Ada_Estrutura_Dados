package aula_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aula_01 {

	public static void main(String[] args) {

		// Array primitivo -> temos um tamanho fixo definido na sua declara��o e
		// trabalhamos com indices que trazem a posi��o

		String[] nomesArray = new String[3];

		nomesArray[0] = "Camila";
		nomesArray[1] = "S�mila";
		nomesArray[2] = "Isadora";

		System.out.println("Nomes inclu�dos atrav�s de um array[3]: \n");
		System.out.println(nomesArray[0]);
		System.out.println(nomesArray[1]);
		System.out.println(nomesArray[2]);
		System.out.println();
		// ArrayList -> n�o temos um tamanho pr�-definido e trabalhamos com indices que
		// trazem a posi��o

		List<String> nomes = new ArrayList<>();

		nomes.add("Maria");
		nomes.add("Jo�o");
		nomes.add("Jose");

		System.out.println("Nomes inclu�dos atrav�s de uma lista e retornados por sua posi��o: \n");
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println();

		nomes.remove(0);

		System.out.println("Impress�o da lista ap�s a remo��o do nome na posi��o 0: " + nomes);
		System.out.println();

		// LinkedList -> n�o � feito com array primitivo, � feito com encadeamento de
		// objetos, lista encadeada e trabalhamos com indices que trazem a posi��o

		List<String> nomes1 = new LinkedList<>();

		nomes1.add("Joana");
		nomes1.add("Igor");
		nomes1.add("Pedro");

		System.out.println("Nomes inclu�dos atrav�s de um linkedList e retornados por sua posi��o: \n" + nomes1);
		System.out.println();

		// Set -> n�o tem posi��o e o �ltimo adicionado ser� o primeiro na impress�o

		Set<String> set = new HashSet<String>();

		set.add("Caio");
		set.add("Rodrigo");
		set.add("Emilie");

		System.out.println("Nomes inclu�dos atrav�s de um set: \n" + set);
		System.out.println();

		// percorrendo um set com for (n�o tem posi��o)

		System.out.println("Impress�o do set atrav�s de uma estrutura FOR: ");
		System.out.println();
		
		for (String item : set) {
			System.out.println(item);
		}
		// percorrendo um set com forEach (n�o tem posi��o) com lambda

		System.out.println();
		System.out.println("Impress�o do set atrav�s de uma estrutura FOR EACH: ");
		System.out.println();
		
		set.forEach(item -> System.out.println(item));

		set.remove("Caio");

		System.out.println();
		System.out.println("Impress�o do set ap�s a remo��o do elemento informado (Caio): " + set);
		System.out.println();

		// tudo que usa <> � uma interface

		// list, consegue adicionar, consegue localzar e remover pela posi��o
		// set, n�o tem duplicidade, adiciona e remove o item informando o item que voc�
		// deseja excluir
	}

}
