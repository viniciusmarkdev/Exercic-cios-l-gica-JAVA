package Introdu��o;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
int dia, meses , anos , idadedias , idademeses, idadetotal;
		
		
		System.out.println("Digite sua idade em anos exatos : ");
		Scanner ler = new Scanner(System.in);
		anos = 	ler.nextInt();
		System.out.println("Digite quantos meses exatos de 30 dias voc� tem desde seu ultimo anivers�rio : ");
		Scanner leia = new Scanner(System.in);
		meses= 	leia.nextInt();
		System.out.println("Digite quantos dias exatos voc� tem ap�s a contagem dos meses exatos :  ");
		Scanner escreva = new Scanner(System.in);
		dia= escreva.nextInt();
		
		idadedias = anos*365;
		idademeses= meses*30;
		idadetotal = idadedias+ idademeses+dia;
		System.out.println("A sua idade em dias � igual a : ");
		System.out.println(idadetotal);

	}

}
