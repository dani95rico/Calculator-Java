// EXAMPLE OF A FULLY CALCULATOR IN JAVA LENGUAGE BY DANI95RICO

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero1, numero2;
		double resultado=0;
		String signo;
		System.out.println("*****CALCULADORA*****");
		System.out.println("Introduzca dos números: ");
		numero1=sc.nextInt();
		numero2=sc.nextInt();
		System.out.println("¿Qué operación desea realizar?");
		System.out.println("Sumar(+) Restar(-) Multiplicar(x) Dividir(/): ");
		signo=sc.next();
		if(signo.equals("+"))
		{
			resultado=numero1+numero2;
		}
		if(signo.equals("-"))
		{
			resultado=numero1-numero2;
		}
		if(signo.equals("x"))
		{
			resultado=numero1*numero2;
		}
		if(signo.equals("/"))
		{
			resultado=numero1/numero2;
		}
		System.out.println("El resultado de la operación ("+signo+") entre los números "+numero1+" y "+numero2+" es: "+resultado);
}
}
		}
