package Heran�a;

public class Preguica extends Animal {
	
	private boolean Descansar;
	
	

	public Preguica(String nome, int idade, boolean som, boolean medo,boolean Descansar) {
		super(nome, idade, som, medo);
		this.Descansar = Descansar;
	}

	
public boolean isDescansar() {
		return Descansar;
	}

	
	public void setDescansar(boolean descansar) {
		Descansar = descansar;
	}


public void Subir() {
	
	if(Descansar = true)
		System.out.println("A pregui�a subiu na arvore : ");
		else {
			System.out.println("A pregui�a n�o subiu arvore : ");
		}
	
}
}
