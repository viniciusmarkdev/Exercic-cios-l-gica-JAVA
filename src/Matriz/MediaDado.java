package Matriz;

import java.util.Scanner;

public class MediaDado {
	
	public static void main (String[]args){
		
		
		int vet[]= new int[10],soma_pont=0,media, maior = 0,s = 0,vezes = 0,x;
		for(x=0;x<10;x++) {
			
			System.out.println("Digite a pontua��o de cada dado lan�ado : ");
			Scanner receber = new Scanner(System.in);
			
			vet[x]= receber.nextInt();
		}
		for(x=0;x<10;x++) { 
			
			System.out.println("O  vetor do dado lan�ado �	: "+vet[x]);
			
			soma_pont = soma_pont + vet[x];
			
			if(vet[x]>maior) {
				
				maior = vet[x];
			}
			
			
			if(vet[x]== maior) {
				
				vezes = vezes + 1;
			}
			
				
				
			}
		
		System.out.println("A soma das dez pontua��o de cada rodada �   : "+soma_pont);
		media = soma_pont/10;
		System.out.println("A media das 10 rodadas �    : "+media);
		System.out.println("A maior pontua��o ocorreu : "+vezes+  "vezes");
		
		
			
			
		}
	}



	

