	package POOintrodu��o;

public class Cliente {
	
	private	String ClienteNome;
	private	String SobreNome;
	private String UltimoNome;
	private Long Valida��o;
	int idade ;
		
	public String sexo;
	private long CPFcadastrado;
		


	 

	public Cliente (String primeiro,String segundo,String Ultimo) {
		
		ClienteNome = primeiro;
	    SobreNome = segundo;
	    UltimoNome = Ultimo;
		
	}
	public String getNomeCompleto() {
		String NomeCompleto = ClienteNome +" "+ SobreNome +" "+UltimoNome ;
		return NomeCompleto;
	}

	public long getCPFcadastrado() {
		
		
		return CPFcadastrado;
		
	}
	public void setCPFcadastrado(long cPFcadastrado ) {
		CPFcadastrado = cPFcadastrado;
		
	}

		public Long getValida��o() {
			return Valida��o;
		}
		public void setValida��o(Long valida��o) {
			Valida��o = valida��o;
		}




	public  void confirma��o() {
		
		
	    if(CPFcadastrado == Valida��o ) {
	    System.out.println("O CPF est� validado e cadastrado");
	    }
	    
	    else {
	    	System.out.println("O CPF est� invalido e n�o foi cadastrado");
	    	
	    
		}
		



	}


	public void status() {
		System.out.println("O nome completo do cliente � : "+this.getNomeCompleto());
		System.out.println("A idade do cliente � : "+this.idade);
		System.out.println("O sexo do cliente �  : "+this.sexo );
		System.out.print( "O cpf cadastrado � :"+this.getCPFcadastrado());

	}

		
	}


