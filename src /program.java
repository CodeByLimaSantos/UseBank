package Application;

import java.util.Scanner;

import Main.UserBank;


public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
				System.out.println("Login :");
				System.out.println("Escreva o número da sua conta : ");
				int numConta = input.nextInt();
				
							   input.nextLine(); 
		
				System.out.println("Escreva o seu nome  : ");
				String donoConta = input.nextLine();
		
		UserBank userbank = new UserBank();
	    userbank.setDonoConta(donoConta);
	    userbank.setNumConta(numConta);
						
	        System.out.println(donoConta + ", " + numConta);
		
	        System.out.println("Você deseja fazer um depósito inicial ? (s/n) ");
	        char resposta = input.next().charAt(0);
		
			if (resposta == 's') { 
				System.out.println("Quanto você deseja depositar? ");
				double quantidade = input.nextDouble();
				userbank.novoDeposito(quantidade);
				System.out.println("Usuário : " 
								  + donoConta 
								  + ", Número da conta : " 
								  + numConta + ", você realizou um novo depósito e seu saldo agora é de : "
								  + userbank.getSaldo()); 
			    								
			} 
	
			 System.out.println("Usuário: " + userbank.getDonoConta()
             + ", Número da conta: " + userbank.getNumConta()
             + ", Saldo: " + userbank.getSaldo());

			 
			 System.out.println("Para realizar um novo depósito, digite o valor :");
			 double quantidade = input.nextDouble();
			 userbank.novoDeposito(quantidade);
			 
			 System.out.println("Usuário : " 
								  + donoConta 
								  + ", Número da conta : " 
								  + numConta + ", você realizou um novo depósito e seu saldo agora é de : "
								  + userbank.getSaldo());
			
			 
			 System.out.println("Para realizar uma transferência , digite o valor :");
			 double quantidade2 = input.nextDouble();
			 userbank.pagamento(quantidade2);
		
			 System.out.println("Usuário : " 
					  + donoConta 
					  + ", Número da conta : " 
					  + numConta + ", você realizou uma transferência e seu saldo agora é de : "
					  + userbank.getSaldo());
			 int opcao;

			 do {

			     System.out.println("---");
			     System.out.println("===== MENU =====");
			     System.out.println("1 - Fazer depósito");
			     System.out.println("2 - Transferência");
			     System.out.println("3 - Suporte técnico");
			     System.out.println("4 - Encerrar sessão");
			     System.out.print("Escolha uma opção: ");

			     opcao = input.nextInt();

			     switch (opcao) {

			         case 1:
			             System.out.println("Digite o valor do depósito:");
			             double quantidade3 = input.nextDouble();
			             userbank.novoDeposito(quantidade3);
			             System.out.println("Saldo atual: " + userbank.getSaldo());
			             break;

			         case 2:
			             System.out.println("Digite o valor da transferência:");
			             double quantidade4 = input.nextDouble();
			             userbank.pagamento(quantidade4);
			             System.out.println("Saldo atual: " + userbank.getSaldo());
			             break;

			         case 3:
			             System.out.println("Entre em contato com o suporte: SAC 3224-5532");
			             break;

			         case 4:
			             System.out.println("Sessão encerrada.");
			             break;

			         default:
			             System.out.println("Opção inválida.");
			     			} 
	         } while (opcao != 4);

			 input.close();
			 
			 }
	}
