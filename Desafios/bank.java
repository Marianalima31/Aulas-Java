package Deseafios;

import java.util.Scanner;

public class bank

{ //inicio
		public static void main (String args[])
		{
			Scanner leia=new Scanner(System.in);
			char opcao;
			
			do 
			{
			System.out.println("\t\t\t LIMA BANK\n");
			System.out.println("\t~~~~~ Fa�a do seu dinheiro uma limonada ~~~~~\n");
			System.out.println("1- CONTA POUPAN�A \r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA ESPECIAL \r\n"
					+ "4 - CONTA EMPRESA\r\n"
					+ "5 - CONTA ESTUDANTIL\r\n"
					+ "6 - SAIR\r\n"
					+"");
			
			System.out.println("Digite o n�mero da sua op��o: ");
			opcao = leia.next(). charAt(0);
			if(opcao=='6')
			{
				break;
			}
			else if (opcao == '1') 
			{
				contaPoupanca();
			}
			//else if (opcao == '2') 
			//{
			//	contaCorrente();
			//}
			//else if (opcao == '3') 
			//{
			//	contaEspecial();
		//	}
			else if (opcao == '4') 
			{
				contaEmpresa();
			}
			else if (opcao == '5') 
			{
				contaEstudantil();
			}
			else if (opcao<0 || opcao>5)
			{
				System.out.println("Digite uma op��o v�lida: ");
				opcao = leia.next(). charAt(0);
			}
			
			
		} while(true || opcao=='N');
		System.out.println("Obrigado, volte sempre!");
	   }
         public static void contaPoupanca()
         {
        	 Scanner tec = new Scanner(System.in);
        	 double saldo=0.00, saldoPoupanca = 0.00, credito=0.00, debito=0.00;
        	 char opcaoDC;
     		 char opcaoSN;
     		 String descricao;
     		 
        	 System.out.println("CONTA POUPAN�A");
        	 linha(40);
        	 //processos
        	 for(int giro=1; giro<=10; giro++)
        	 {
        		 System.out.printf("Lan�amento %d: [D-d�bito/C-cr�dito]: ",giro);
        		 opcaoDC=tec.next().toUpperCase().charAt(0);//charAt cpega o que digitaa na primeira posicao e transforma em caracter toupper transforma em letra grande
        		 if(opcaoDC =='D')
        		 {
        			 System.out.println("\nDigite o valor para d�bito: ");
        			 debito=tec.nextDouble();
        			 if(saldo>0)
        			 {
        			  while(saldo<debito)
        			  {
        				 System.out.printf("N�o � poss�vel realizar a transa��o, tente de novo!\n ",saldo);
        				 System.out.println("Digite o valor para d�bito: ");
        				 debito=tec.nextDouble();
        				 
        			  }
        			  tec.nextLine();
        			  System.out.println("Digite a descri��o do d�bito: ");
        			  descricao=tec.nextLine();		
        			  saldo=saldo-debito;
        			  System.out.printf("Saldo atual � R$ %d",saldo);
        			 }
        			 else if(saldo==0)
        			 {
        				 System.out.println("Voc� est� sem saldo no momento, fa�a um cr�dito primeiro!");
        			 }
        		 }
        		 else if(opcaoDC=='C')
        		 {
        			 System.out.println("\nDigite o valor do cr�dito: ");
        			 credito=tec.nextDouble();
        			 while(credito<=0)
        			 {
        				 System.out.println("Valor informado negativo ou zero, tente de novo");
        				 System.out.print("Digite o valor do cr�dito: ");
     					 credito = tec.nextDouble();
        			 }
        			 tec.nextLine();
        			 System.out.println("Digite a descri��o do cr�dito: ");
        			 descricao=tec.nextLine();
        			 saldo=saldo+credito;
        			 System.out.printf("Saldo atual � R$ %.2f ",saldo);
        		 }
        		 else
        		 {
        			 System.out.println("Voc� n�o escolheu nenhuma das op��es");
        		 }
        		 System.out.print("Continua S/N: ");
        		 opcaoSN=tec.next().toUpperCase().charAt(0);
        		 if(opcaoSN=='N')
        		 {
        			 break;
        		 }
        	 }
        	 //corre��o monetaria
        	 System.out.println("Deseja fazer a corre��o hoje? S/N ");
        	 opcaoSN=tec.next().toUpperCase().charAt(0);
        	 if(opcaoSN=='S')
        	 {
        		 saldo+=(saldo*0.0005);
        	 }
        	 System.out.printf("SALDO FINAL DA CONTA POUPAN�A %.2f",saldo);
        	 System.out.println();
        	 linha(40);
        	 
         }
         public static void contaEmpresa()
         {
        	 Scanner tec = new Scanner(System.in);
        	 double emprestimo=0.00, saldo=0.00;
        	 final double limite=10000.0;//corrigir
     		 char opcaoSN;
     		 
     		 System.out.println("Deseja fazer um empr�stimo? S/N");
     		 opcaoSN=tec.next().toUpperCase().charAt(0);
     		 
     		 if(opcaoSN=='S')
     		 {
     			 System.out.printf("Limite dispon�vel: R$ %.2f \n",limite);
     			 System.out.println("\nQual valor do empr�stimo?");
     			 emprestimo=tec.nextInt();
     			 while(emprestimo<0 || emprestimo>limite)
     			 {
     				 System.out.println("Digite um valor v�lido: ");
     				 emprestimo=tec.nextInt();
     			 }
     		 }
 			saldo+= emprestimo;
 			System.out.printf("\nSaldo atual: R$%.2f\n\n", saldo);
 			System.out.println(); 	
 			
 			System.out.println("");
             }
         public static void contaEstudantil()
         {
        	 Scanner tec = new Scanner(System.in);
        	 double emprestimo=0.00, saldo=0.00,saldoPoupanca = 0.00, credito=0.00, debito=0.00;
        	 final double limite=5000.0;//corrigir
     		 char opcaoSN, opcaoDC='D';
     		 String descricao;
    		
     		for (int giro=1; giro<=10; giro++)
    		{ 
     		 
     		 System.out.println("Deseja usar o limite estudantil? S/N");
     		 opcaoSN=tec.next().toUpperCase().charAt(0);
     		 
     		 if(opcaoSN=='S')
     		 {
     			 System.out.printf("Limite dispon�vel: R$ %.2f \n",limite);
     			 for(int i=1; i<=10; i++)
            	 {
            		 System.out.printf("Lan�amento %d: [D-d�bito/C-cr�dito]: ",i);
            		 opcaoDC=tec.next().toUpperCase().charAt(0);
            		 {
            			 System.out.println("\nDigite o valor para d�bito: ");
            			 debito=tec.nextDouble();
            			 if(saldo>0)
            			 {
            			  while(saldo<debito)
            			  {
            				 System.out.printf("N�o � poss�vel realizar a transa��o, tente de novo!\n ",saldo);
            				 System.out.println("Digite o valor para d�bito: ");
            				 debito=tec.nextDouble();
            				 
            			  }tec.nextLine();
            			  while(debito>saldo)
            			  {
            				  System.out.println("Voc� est� utilizando o limite estudantil. Digite o valor a ser debitado: ");
            				  debito=tec.nextDouble();
            			  }
            			  tec.nextLine();
            			  System.out.println("Digite a descri��o do d�bito: ");
            			  descricao=tec.nextLine();		
            			  saldo=saldo-debito;
            			  System.out.printf("Saldo atual � R$ %d",saldo);
            			 }
            	      }
            	 }
     		 }
            		 else if(opcaoDC=='C')
            		 {
            			 System.out.println("\nDigite o valor do cr�dito: ");
            			 credito=tec.nextDouble();
            			 while(credito<=0)
            			 {
            				 System.out.println("Valor informado negativo ou zero, tente de novo");
            				 System.out.print("Digite o valor do cr�dito: ");
         					 credito = tec.nextDouble();
            			 }
            			 if(credito>limite)
            			 tec.nextLine();
            			 System.out.println("Digite a descri��o do cr�dito: ");
            			 descricao=tec.nextLine();
            			 saldo=saldo+credito;
            			 System.out.printf("Saldo atual � R$ %.2f ",saldo);
            		 }
            		 else
            		 {
            			 System.out.println("Voc� n�o escolheu nenhuma das op��es");
            		 }
     		 
            		 System.out.print("Continua S/N: ");
            		 opcaoSN=tec.next().toUpperCase().charAt(0);
            		 tec.nextLine();
            		 
            		 if(opcaoSN=='N')
            		 {
            			 break;
            		 }
    		} 		 
     			 while(emprestimo<0 || emprestimo>limite)
     			 {
     				 System.out.println("Digite um valor v�lido: ");
     				 emprestimo=tec.nextInt();
     			 }
     		 
 			saldo+= emprestimo;
 			System.out.printf("\nSaldo atual: R$%.2f\n\n", saldo);
 			System.out.println(); 	
 			
 			System.out.println("");
     		 
             }
         
      
         public static void linha (int tamanho)
         {
        	 for (int x=1; x<tamanho;x++)
        	 {
        		 System.out.print("=");
        	 }
        	 System.out.println();
         }
	}
