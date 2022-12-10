package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio_02 {

	/*
	 * Faça um programa que mostre um menu com escolhas entre utilizar pilha ou fila
	 * e após selecionar uma delas, mostre 3 opções de operações, adicionar, remover
	 * (Mostrando qual foi o dado removido) e listar.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int menuPrinc = -1;
		while (menuPrinc  != 0) {
		System.out.println("Escolha uma das opções para trabalharmos com a estrutura de PILHA ou FILA: \n" + 
		"\n[1] - FILA" +
		"\n[2] - PILHA" +
		"\n[0] - ENCERRAR\n");
		menuPrinc = scan.nextInt();
		
		switch (menuPrinc) {
			case 1:
				fila();
				break;
			case 2:
				pilha();
				break;
			case 0:
				break;
			}
		}
	}

	public static void fila() {
		Scanner scanFila = new Scanner(System.in);

		Queue<String> fila = new LinkedList<>();

		int menuFila = -1;
		String item;
		while (menuFila != 0) {
			System.out.println("\n===== FILA =====\n");
			System.out.println("Escolha uma das opções: \n" + 
			"\n[1] - Adicionar" + 
			"\n[2] - Remover " + 
			"\n[3] - Listar" + 
			"\n[0] - Menu Principal\n");
			menuFila = scanFila.nextInt();

			switch (menuFila) {
				case 1: {
					scanFila.nextLine();
					System.out.println("\nInforme o item que deseja adicionar na FILA: \n");
					item = scanFila.nextLine();
					fila.offer(item);
					break;
				}
				case 2: {
					String itemRetirado = fila.poll();
					System.out.println("\nPrimeiro item removido da FILA : " + itemRetirado + "\n");
					break;
				}
				case 3: {
					System.out.println("\nLista completa da FILA: \n");
					fila.forEach(i -> System.out.println(i));
				}
			}
		}
	}

	public static void pilha() {
		Scanner scp = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();

		int menuPilha = -1;
		String item;
		while (menuPilha != 0) {
			System.out.println("\n===== PILHA =====\n");
			System.out.println("Escolha uma das opções: \n" + 
			"\n[1] - Adicionar" + 
			"\n[2] - Remover " +
			"\n[3] - Listar" + 
			"\n[0] - Menu Principal\n");
			menuPilha = scp.nextInt();

			switch (menuPilha) {
				case 1: {
					scp.nextLine();
					System.out.println("\nInforme o item que deseja adicionar na PILHA: \n");
					item = scp.nextLine();
					pilha.push(item);
					break;
				}
				case 2: {
					String itemRetirado = pilha.pop();
					System.out.println("\nÚltimo item removido da PILHA: " + itemRetirado + "\n");
					break;
				}
				case 3: {
					System.out.println("\nLista completa da PILHA: \n");
					pilha.forEach(i -> System.out.println(i));
				}
			}
		}
	}
}
