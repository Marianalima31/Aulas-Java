package Deseafios;

import java.util.Scanner;

public class Banco 
{
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		char opcao;
		String resposta;
		int conta;
		double valorDepositar = 0.00, valorSacar = 0.00, valorConta = 1000.00, saldoConta = 0.00;
		String descricao;
		char  continua, correcao = 0, talao, limiteEspecial, emprestimo, limiteEstudante;
		double limite, valorEmprestimo;
		boolean reiniciar = true;
		String [] vetorString = new String[3];
		double [] vetorStatus = new double [3];
		
		
		do 
		{
			
		System.out.println("===================================================");
		System.out.println("Ol�, seja bem vindo ao Sistema Banc�rio Laranjinha ");
		System.out.println("---------------------------------------------------");
		System.out.println("            o laranjinha tem tudo pra voc�         ");
		System.out.println("\n");
		 
		
			System.out.print(" 1 - CONTA POUPAN�A"
							  + "\n 2 - CONTA CORRENTE" 
							  + "\n 3 - CONTA ESPECIAL" 
							  + "\n 4 - CONTA EMPRESA"
							  + "\n 5 - CONTA ESTUDANTIL"
							  + "\n 6 - SAIR "
							  + "\n"
							  + "\n"
							  + "SELECIONE O TIPO DE CONTA: ");
			
			System.out.print("\n");
			
			opcao = (char) leia.nextInt();
			
			if(opcao==6)
			{
				break;
			}
						
			System.out.print("\n  Informe o n�mero da conta [xxxxx]:  ");
			conta = leia.nextInt();
			
			System.out.print("\n  Deseja depositar ou sacar [D/S]:  ");
			resposta = leia.next();
		
			if ( resposta.equals("D")) 
			{
				System.out.print("\n  Quanto voc� desejar depositar: ?  ");
				valorDepositar =  leia.nextDouble();
				System.out.print("\n  Informe a descri��o:  ");
				descricao = leia.next();
				System.out.printf("\n  Saldo Atual: %.2f", valorConta);
				System.out.print("\n");
				System.out.print("\n  Continua [1-SIM][2-N�O]: ");
				continua = (char)leia.nextInt();
				
				if(continua == 1) 
				{
				   valorConta=valorDepositar+valorConta;
				   
				   if (opcao == 1) 
				   {
					   System.out.print("\n  Deseja realizar corre��o monet�ria: ? [1-SIM][2-N�O] : ");
					   correcao = (char) leia.nextInt();
					   
					   if(correcao == 1) 
					   
					   {				   
						  valorConta= valorConta+ 0.005*valorConta;
						  System.out.printf("\n Saldo Atual com corre��o monetaria %.2f:",valorConta);
					   }
					   else 
					   {
						   System.out.printf("\n  Saldo Atual � %.2f",valorConta);
					   }
				   } 
				   if (opcao == 2) 
				   {
					   System.out.print("\n  Deseja emitir tal�o [1-SIM][2-N�O] : ");
					   talao = (char) leia.nextInt();
					   
					   if(talao == 1) 
					   
					   {				   
						  valorConta= valorConta/3;
						  System.out.printf("\n  Tal�o emito %.2f:",valorConta);
					   }
					   else 
					   {
						   System.out.printf("\n Saldo Atual � %.2f",valorConta);
					   }
				   }  
				   
				   else if (continua == 2)
					{
					   break;
				    }
				  
				 }
			  }
			if ( resposta.equals("S")) 
			{
				System.out.print("\n  Quanto voc� desejar sacar: ?  ");
				valorSacar =  leia.nextDouble();
				System.out.print("\n  Informe a descri��o:  ");
				descricao = leia.next();
				System.out.printf("\n  Saldo Atual: %.2f", valorConta);
				System.out.print("\n");
				System.out.print("\n  Continua [1-SIM][2-N�O]: ");
				continua = (char)leia.nextInt();
				
				if(continua == 1) 
				{
					if(valorSacar < valorConta) 
				{
						valorConta=valorConta-valorSacar;
						
					 if (opcao == 1) 
					   {
						 System.out.print("\n  Deseja realizar corre��o monet�ria: ? [1-SIM][2-N�O] : ");
						 correcao = (char) leia.nextInt();
							   
					 		if(correcao == 1) 
							   
					 		{				   
					 			valorConta= valorConta+ 0.005*valorConta;
					 			System.out.printf("\n Saldo Atual com corre��o monetaria %.2f:",valorConta);
					 		}
					 		else 
					 		{
					 			System.out.printf("\n Saldo Atual � %.2f",valorConta);
					 		}
					    } 
					 if (opcao == 2) 
					   {
						   System.out.print("\n  Deseja emitir tal�o [1-SIM][2-N�O] : ");
						   talao = (char) leia.nextInt();
						   
						   if(talao == 1) 
						   
						   {				   
							  valorConta= valorConta/3;
							  System.out.printf("\n  Tal�o emito %.2f:",valorConta);
						   }
						   else 
						   {
							   System.out.printf("\n Saldo Atual � %.2f",valorConta);
						   }
					   }  
					
				   if (opcao == 3) 
				   {
					   System.out.print("\n  Deseja usar limite especial: ? [1-SIM][2-N�O] : ");
					   limiteEspecial = (char) leia.nextInt();
					   
					   if(limiteEspecial == 1) 
					   
					   {
						  System.out.print("\n Quanto [1000]:  ");
						  limite = leia.nextDouble();
						  
						  valorConta= valorConta-limite;
						  
						  System.out.printf("\n Saldo Atual � %.2f:",valorConta);
					   }
					   else 
					   {
						   System.out.printf("\n Saldo Atual � %.2f",valorConta);
					   }
				   } 
				   if (opcao == 4) 
				   {
					   System.out.print("\n  Deseja fazer um empr�stimo [1-SIM][2-N�O] : ");
					   emprestimo = (char) leia.nextInt();
					   
					   if(emprestimo == 1) 
					   
					   {
						  System.out.print("\n  Quando deseja usar, o limite dispoivel � 10.000:  ");
						  valorEmprestimo = leia.nextDouble();
						  
						  valorConta= valorConta+valorEmprestimo;
						  System.out.printf("\n Saldo Atual %.2f: ",valorConta);
					   }
					   else 
					   {
						   System.out.printf("\n Saldo Atual  %.2f ",valorConta);
					   }
					   
				     } 
				   if (opcao == 5) 
				   {
					   System.out.print("\n  Deseja usar o limite de estudante [1-SIM][2-N�O] : ");
					   limiteEstudante = (char) leia.nextInt();
					   
					   if(limiteEstudante == 1) 
					   
					   {
						  System.out.print("\n Quando deseja usar, o limite dispoivel � 5.000:  ");
						  valorEmprestimo = leia.nextDouble();
						  
						  valorConta= valorConta+valorEmprestimo;
						  System.out.printf("\n Saldo Atual %.2f: ",valorConta);
					   }
					   else 
					   {
						   System.out.printf("\n Saldo Atual  %.2f ",valorConta);
					   }
					   
				     }  
				 }  
				   if(valorSacar>valorConta)
				   {
					   System.out.print("\n N�o � possivel continuar esta opera��o! Seu saldo ficar� negativo");
				   }
				   if (continua == 2)
					{
					   reiniciar = true;
				    }
				   else 
				   {
					   reiniciar = false;
				   }
				   System.out.print("\n");
				 }
			  }
				
		} 
		while (reiniciar ==true);
		
		System.out.print ("***********************************");
		System.out.println ("          EXTRATO BANC�RIO         ");
		
		
		
	}
	    
}
