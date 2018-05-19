package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome[] = new String[3];
		int opc, a = 0;
		double sal;
		while(a!=1) {
		System.out.println("Digite a opção desejada \r\n" + "        1. Imposto\r\n" + "	2. Novo Salário\r\n"
				+ "	3. Classificação\r\n" + "	4. Finalizar");
		opc = scanner.nextInt();
		switch (opc) {
		case 1:
			System.out.println("Digite o salario");
			sal = scanner.nextDouble();

			if (sal < 500) {
				sal = sal * 0.05;
			} else if (sal >= 500 && sal < 850) {
				sal = sal * 0.1;
			} else {
				sal = sal * 0.15;
			}

			System.out.println("Valor do imposto: " + sal +"\n\n");
			break;

		case 2:
			System.out.println("Digite o salario");
			sal = scanner.nextDouble();
			

			break;
		case 3:

			break;
		case 4:
			a = 1;
			break;

		default:
			break;
		}

	}
	}
}