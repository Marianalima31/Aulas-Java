package loop;

import java.util.Scanner;

public class Questao4

{
	public static void main(String[] args)
	{
		// Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
		//Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		//e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		//o n�mero de pessoas calmas; 
		//o n�mero de mulheres nervosas; 
		//o n�mero de homens agressivos; 
		//o n�mero de outros calmos;
		//o n�mero de pessoas nervosas com mais de 40 anos; 
		//o n�mero de pessoas calmas com menos de 18 anos.
		
		Scanner ler = new Scanner(System.in); 
		int idade = 0, entrevistados = 0, mulherAgressiva =0, homemAgressivo=0,outrosCalmos =0, pessoasCalmas = 0, menorIdade=0 , maiorIdade= 0;
		char sexo, opcoes;
		
		while(entrevistados < 3)
		 {
			System.out.print("\n Informe a idade:  ");
			idade = ler.nextInt();
			System.out.print("\n Digite 1-feminino/2-masculino/3-outros:  ");
			sexo = (char) ler.nextInt();
			System.out.print("\n Informe o humor desta pessoa:[1-Calma/2-Nervosa/3-Agressiva] ");
			opcoes = (char) ler.nextInt();
			
			entrevistados++;
			
			if (opcoes ==1);
			{
			 	pessoasCalmas=pessoasCalmas+1;
			 }
			if (sexo == 1 && opcoes ==2);
			{
			 	mulherAgressiva=mulherAgressiva+1;
			 }
			if (sexo == 2 && opcoes ==3);
			{
			 	homemAgressivo=homemAgressivo+1;
			 	System.out.printf("\n estou aqui");
			 }
			if (sexo == 3 && opcoes ==1);
			{
			 	outrosCalmos=outrosCalmos+1;
			 }
			if (opcoes ==2 && idade > 40);
			{
			 	maiorIdade=maiorIdade+1;
			 }
			if (opcoes ==1 && idade < 18);
			{
			 	menorIdade=menorIdade+1;
			 }
			
			
		 }
		
		System.out.printf("\n O total de pessoas calmas � de %d ",pessoasCalmas);
		System.out.printf("\n O total de mulheres nervosas � de %d",mulherAgressiva);
		System.out.printf("\n O total de homens agressivos � de %d",homemAgressivo);
		System.out.printf("\n O total de outros calmos � de %d",outrosCalmos);
		System.out.printf("\n O total de pessoas nervosas com mais de 40 anos � de %d ",maiorIdade);
		System.out.printf("\n O total de pessoas calmas com menos de 18 anos � de %d ",menorIdade);

	}
}
