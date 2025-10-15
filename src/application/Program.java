package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	//teste do commit
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		List<Contribuintes> lista = new ArrayList<>();
		
		System.out.print("Insira o número dos contribuintes: ");
		int contribuintes = teclado.nextInt();
		
		for (int i = 0; i < contribuintes; i++) {
			System.out.println("Dados do contribuinte #" + (i + 1));
			System.out.print("Pessoa jurídica ou física? (j/f): ");
			char ch = teclado.next().charAt(0);
			if (ch == 'j') {
				System.out.print("Name: ");
				teclado.nextLine();
				String name = teclado.nextLine();

				System.out.print("Renda anual: ");
				Double rendaAnual = teclado.nextDouble();
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = teclado.nextInt();
				
				lista.add(new PessoaJuridica(numeroFuncionarios, name, rendaAnual));
			}
			else if (ch == 'f'){
				System.out.print("Name: ");
				teclado.nextLine();
				String name = teclado.nextLine();
				System.out.print("Renda anual: ");
				Double rendaAnual = teclado.nextDouble();
				System.out.print("Gastos de saúde: ");
				Double gastosSaude = teclado.nextDouble();
				
				lista.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}
		}
		
		System.out.println("IMPOSTOS PAGOS: ");
		for (Contribuintes cont : lista) {
			System.out.println(cont.getName() + " $ " + String.format("%.2f", cont.calculoImposto()));
		}
		
		teclado.close();

	}

}
