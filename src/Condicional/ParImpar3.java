package Condicional;

import java.util.Scanner;

import java.lang.Math;

public class ParImpar3{
	
	public static void main (String[]args){
		
		float a ;
		System.out.println("Digite sua idade : ");
		Scanner numero = new Scanner(System.in);
		a = numero.nextInt();
		
		if(a%2 == 0) {
			
			System.out.println("O numero "+a+"� par e sua raiz quadrada � "+Math.sqrt(a));
			
			
		}
		
		else {
			
			System.out.println("O numero "+a+"� impar e seu quadrado � "+(a*a));
			
		}
	}

}
