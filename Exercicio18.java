package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * Tabuada: Peça ao usuário para inserir um número e, em seguida, exiba a
		 * tabuada desse número usando um loop do-while
		 */

		int entradaDoUsuario = 0;

		do {

			try {
				entradaDoUsuario = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro positivo"));

				if (entradaDoUsuario < 0) {
					JOptionPane.showMessageDialog(null, "Digite apenas números positivos \n ERRO!!");
					break;

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Você não digitou um número \n ERRO!!!");
				break;
			}

			for (int i = 1; i <= 10; i++) {
				System.out.println(entradaDoUsuario + " X " + i + " = " + entradaDoUsuario * i);
				System.out.println();
			}

		}

		while (entradaDoUsuario != 0);
	}

}
