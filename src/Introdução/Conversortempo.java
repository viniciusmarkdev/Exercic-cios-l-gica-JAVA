package Introdu��o;

import java.util.Scanner;

public class Conversortempo {
	public static void main (String[]args) {
	int segundos, horas, minutos,segundos_restantes;
	Scanner receber = new Scanner(System.in);
    System.out.println("Digite o tempo de dura��o de um evento em uma f�brica expressa em segundos :");
    segundos = receber.nextInt();
    horas = segundos/3600;
    minutos = (segundos% 3600)/60;
    segundos_restantes = (segundos % 3600)%60;
    System.out.println("O tempo de dura��o do evento em horas , minutos e segundos � igual a : "+horas+  "hora(s)" + minutos+  "minuto(s)"   +segundos_restantes+   "segundo(s)");
    
}
}