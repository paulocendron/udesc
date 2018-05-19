package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//CHAMADA DE METODO
		
//-----------------------------------DECLARAÇÃO DAS VARIAVEIS-----------------------------//
		
		Integer idadeA[] = new Integer[100];
		String nomeproc = "";
		String nome[] = new String[100];
		String idade[] = new String[100];
		Double nota[] = new Double[100];
		int op = 0, cont = 0, r = 0, qtd_alunos_maiores = 0, media = 0;
		double maior_nota = 0, notas_alunos_dezeseis = 0, media_alunos_dezeseis, porcent;
		int l = 0;
		String nome_maior_nota = "", nome_maior_idade = "", nome_alunos_menor_nota = "";
		
		
//--------------------------------------------------------------------------------------//
		

		for (int a = 0; a < 100; a++) {
			if (r == 0) {
				System.out.println("Digite: \n 1-Adicionar \n 2-Concluir ");
				op = scanner.nextInt();
			}

			if (op == 1) {
				System.out.println("Digite o nemo do aluno");
				nome[a] = scanner.next();

				System.out.println("Digite a idade do aluno");
				idade[a] = scanner.next();

				System.out.println("Digite a media final");
				nota[a] = scanner.nextDouble();

				cont++;
			} else {
				r = 1;
				nome[a] = null;
				idade[a] = null;
				nota[a] = null;

			}

		}

//----------------------------PROCESSA INFORMAÇÕES REQUERIDAS ------------------------//
		//transforma idade em inteiro
		for (int a = 0; a < cont; a++) {
			idadeA[a] = Integer.parseInt(String.valueOf(idade[a]));
		}
		
		
		for (int a = 0; a < cont; a++) {
			
			// a maior nota final && nome do aluno com a maior nota final
			if (nota[a] >= maior_nota) {
				maior_nota = nota[a];
				nome_maior_nota = nome[a];
			}
			//o nome do aluno mais velho
			if (idadeA[a] >= l) {
				l = idadeA[a];
				nome_maior_idade = nome[a];
			}
			
			//a quantidade de alunos maiores de 16 anos && soma das notas dos alunos maiores de 16 anos
			if (idadeA[a] > 16) {
				qtd_alunos_maiores++;
				notas_alunos_dezeseis = notas_alunos_dezeseis + nota[a];
			}

			//o nome dos alunos com nota inferior a 7
			if (nota[a] < 7) {
				nome_alunos_menor_nota = nome_alunos_menor_nota + " " + nome[a];
			}
			
			//contador de alunos com  média > 7
			if (nota[a] >= 7) {
				media++;
			}
			//O nome completo dos alunos que iniciam com a letra “a”;
			if(nome[a].startsWith("a") || nome[a].startsWith("A")) {
				nomeproc = nomeproc  + nome[a]  +  ",";
			}
			

			
		}
		//a média das notas dos alunos maiores de 16 anos;
		media_alunos_dezeseis = notas_alunos_dezeseis / qtd_alunos_maiores;
		//o percentual de alunos aprovados considerando média 7 para aprovação;
		porcent = (media * 100) / cont;
		
//----------------------------FIM PROCESSA -------------------------------------------//

		System.out.println("Maior nota final:" + maior_nota);
		System.out.println("Nome do aluno com a maior nota final: " + nome_maior_nota + " com nota: " + maior_nota);
		System.out.println("Nome do aluno mais velho: " + nome_maior_idade);
		System.out.println("Quantidade de alunos maiores de 16 anos: " + qtd_alunos_maiores);
		System.out.println("Media de notas dos alunos maiores de 16 anos: " + media_alunos_dezeseis);
		System.out.println("Nome dos alunos com nota abaixo de 7: " + nome_alunos_menor_nota);
		System.out.println("Percentual de alunos aprovados: " + porcent + "%");
		System.out.println("Nomes iniciados em A: " + nomeproc);

	}
}
