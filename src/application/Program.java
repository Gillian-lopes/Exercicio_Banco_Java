package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Extrato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Extrato saldo;

		System.out.println("Preencha o formulario!");
		System.out.print("usuario : ");
		String user = sc.nextLine();
				System.out.print("Conta : ");
		int conta = sc.nextInt();

		System.out.print("Sera realizado algum deposito (y/n) : ");
		char resposta = sc.next().charAt(0);

		if (resposta == 'y') {
			System.out.print("Qual o valor da entrada : ");
			double depositoInicial = sc.nextDouble();

			saldo = new Extrato(user, conta, depositoInicial);
		} else {
			saldo = new Extrato(user, conta);
		}
		
	    System.out.println("Extrato de " + saldo);	
	    System.out.println();
	    
	    System.out.print("Valor depositado : ");
	    double quantia = sc.nextDouble();
	    saldo.deposito(quantia);
	    System.out.println("Extrato de : " + saldo);	
	    System.out.println();
	    
	    System.out.print("Valor sacado : ");
	    quantia = sc.nextDouble();
	    saldo.saque(quantia);
	    System.out.print("Extrato de " + saldo);	
	      
	    
		sc.close();

	}

}
