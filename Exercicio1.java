package ficha2;

public class Exercicio1 {
//atributos..................................................................................................
	private String conteudo;
	private int numCarateres;
	private int numPalavras;		
//construtores.................................................................................................
	Exercicio1(String aConteudo){
		setConteudo(aConteudo);
		
	}
	
	
Exercicio1(){
	this("Sem conteudo");
	
}
//metodos....................................................................................................
	/**
	 * 
	 * @return
	 */	
    private int contaCarateres(){
		/*StringTokenizer str= new StringTokenizer(conteudo);
		int cont=0;
		
		while(str.hasMoreElements()){
			str.nextElement();
			cont++;
		}
		return cont;*/
    	String[]elementos=conteudo.split(" ");
    	return elementos.length;
	}
	/**
	 * 
	 * @return
	 */
	private int contaPalavras(){
	
		return conteudo.length();
		
	}
	/**
	 * 
	 * @param anovoConteudo
	 */
	private void setConteudo(String conteudo){
		this.conteudo = conteudo;
		numPalavras=contaPalavras();
		numCarateres=contaCarateres();
		
	}
	/**
	 * 
	 * @return
	 */

public String toString(){
	String mensagem = "a frase: "+conteudo + " tem "+ numCarateres+" carateres "+numPalavras+" palavras";
	return mensagem;
}


	public String getConteudo() {
		return conteudo;
	}
	

}
