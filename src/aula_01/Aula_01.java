package aula_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aula_01 {

	public static void main(String[] args) {

		// Array primitivo -> temos um tamanho fixo definido na sua declaração e
		// trabalhamos com indices que trazem a posição

		String[] nomesArray = new String[3];

		nomesArray[0] = "Camila";
		nomesArray[1] = "Sâmila";
		nomesArray[2] = "Isadora";

		System.out.println("Nomes incluídos através de um array[3]: \n");
		System.out.println(nomesArray[0]);
		System.out.println(nomesArray[1]);
		System.out.println(nomesArray[2]);
		System.out.println();
		// ArrayList -> não temos um tamanho pré-definido e trabalhamos com indices que
		// trazem a posição

		List<String> nomes = new ArrayList<>();

		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Jose");

		System.out.println("Nomes incluídos através de uma lista e retornados por sua posição: \n");
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println();

		nomes.remove(0);

		System.out.println("Impressão da lista após a remoção do nome na posição 0: " + nomes);
		System.out.println();

		// LinkedList -> não é feito com array primitivo, é feito com encadeamento de
		// objetos, lista encadeada e trabalhamos com indices que trazem a posição

		List<String> nomes1 = new LinkedList<>();

		nomes1.add("Joana");
		nomes1.add("Igor");
		nomes1.add("Pedro");

		System.out.println("Nomes incluídos através de um linkedList e retornados por sua posição: \n" + nomes1);
		System.out.println();

		// Set -> não tem posição e o último adicionado será o primeiro na impressão

		Set<String> set = new HashSet<String>();

		set.add("Caio");
		set.add("Rodrigo");
		set.add("Emilie");

		System.out.println("Nomes incluídos através de um set: \n" + set);
		System.out.println();

		// percorrendo um set com for (não tem posição)

		System.out.println("Impressão do set através de uma estrutura FOR: ");
		System.out.println();
		
		for (String item : set) {
			System.out.println(item);
		}
		// percorrendo um set com forEach (não tem posição) com lambda

		System.out.println();
		System.out.println("Impressão do set através de uma estrutura FOR EACH: ");
		System.out.println();
		
		set.forEach(item -> System.out.println(item));

		set.remove("Caio");

		System.out.println();
		System.out.println("Impressão do set após a remoção do elemento informado (Caio): " + set);
		System.out.println();

		// tudo que usa <> é uma interface

		// list, consegue adicionar, consegue localzar e remover pela posição
		// set, não tem duplicidade, adiciona e remove o item informando o item que você
		// deseja excluir
	}

}
