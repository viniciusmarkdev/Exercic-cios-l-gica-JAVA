package POOintrodu��o;

public class Avi�o {
	
	private String Cor;
	private String modelo;
	private double VelocidadeAtual;
	private double Gasolina;
	private double Abastecimento;
	 
	
	public Avi�o(String cor,String modelo,double quantidadeAbastecida) {
	
		
		this.Cor = cor;
		this.modelo = modelo;
		Gasolina = 50;
		this.Abastecimento = quantidadeAbastecida;
		
	}

	public void ligar() {
		
		System.out.println("O avi�o est� ligado");
		
	}
	
	public void abastecer () {

		if(Gasolina <51) {
		 double ValorAbastecido = Gasolina+getAbastecimento();
		 this.Gasolina = ValorAbastecido ;
			
		}
	
			
	}	
		
		
	public void decolagem() {
		
		for(VelocidadeAtual = 0 ;VelocidadeAtual <=280;VelocidadeAtual++) {
			if(VelocidadeAtual== 280) {
				
				System.out.println("O avi�o chegou a velocidade de decolagem m�xima e j� est� no ar");
			}
		}
		      
		
		}
  public void status() {
	  
	
	  
	System.out.println("A quantidade abastecida � de :"+getGasolina());
	System.out.println("A velocidade atual � igual a :"+getVelocidadeAtual());
	  
  }
		
	
		
		

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return VelocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		VelocidadeAtual = velocidadeAtual;
	}

	public double getGasolina() {
		return Gasolina;
	}

	public void setGasolina(double gasolina) {
		Gasolina = gasolina;
	}

	public double getAbastecimento() {
		return Abastecimento;
	}

	public void setAbastecimento(double abastecimento) {
		Abastecimento = abastecimento;

}
}