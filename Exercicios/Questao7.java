package aulas;

import java.util.Scanner;

public class Questao7 

{
	public static void main(String[] args)
	{
		int a, b, c, d, t, f, x, y;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = leitor.nextInt();
		System.out.println("Digite o valor de b:  ");
		b = leitor.nextInt();
		System.out.println("Digite o valor de c: ");
		c = leitor.nextInt();
		System.out.println("Digite o valor de d: ");
		d = leitor.nextInt();
		System.out.println("Digite o valor de t: ");
		t = leitor.nextInt();
		System.out.println("Digite o valor de f: ");
		f = leitor.nextInt();
		
		x = (((c*t)-(b*f)) / ((a*t)-(b*d)));
		y = (((a*f)-(c*d)) / ((a*t)-(b*d)));
		
		System.out.println("O  valor de x é : " + x + "O valor de y é : " +y);
	}

}
