package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class LojaEstoque {
	
	
	public static void main(String[] args) {
		
		int Tenis = -10;
		int Relogio = -2;
		int Camisa = -3;
		int Calca = -4;
		int Chapeu = -4;
		int Luva = -4;
		int total = Tenis+Relogio +Camisa +Calca+Luva+Chapeu;
		Collection <String> produtos= new ArrayList();
		
		
		
		produtos.add("Tenis");
		produtos.add("Camisa");
		produtos.add("Cal�a");
		produtos.add("Rel�gio");
		produtos.add("Chap�u");
		produtos.add("Luva");
		if(Tenis== -10); {
			
		produtos.remove("Tenis");
			
		}
		if(total == -27) 
		{Collection <String> novosProdutos= Arrays.asList("Tenis novos","Camisa sportiva","Cal�a lag","Relogio Cassio","Chap�u novo","Luva esportiva");
		produtos.addAll(novosProdutos);
		}
		System.out.println("Os produtos dispon�veis no estoque s�o : "+ produtos);
	}

}
