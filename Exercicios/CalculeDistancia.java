package aulas;

import java.util.Scanner;

public class CalculeDistancia 
{
	public static void main(String[] args)
	{
		float x1, x2, y1, y2, d, valor;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de x do primeiro ponto: ");
		x1 = leitor.nextInt();
		System.out.println("Digite o valor de y do primeiro ponto:  ");
		y1 = leitor.nextInt();
		System.out.println("Digite o valor de x do segundo ponto: ");
		x2 = leitor.nextInt();
		System.out.println("Digite o valor de y do segundo ponto: ");
		y2 = leitor.nextInt();
		
		d =  (float) (Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
				
		valor = (float) (Math.sqrt(d));
		System.out.println("  A distância entre eles é:  " +  valor);
	}
}
