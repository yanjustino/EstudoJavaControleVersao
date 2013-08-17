package br.com.estudo.java.sistemas;

public class Sistema {

	/*
	 * vari�vel privada : visto apenas na classe
	 * recebe e guarda o valor da vers�o
	 */
	private double versao;

	/*
	 * M�todo get recupera da vari�vel privada
	 * o n�mero da vers�o
	 */
	public double getVersao() {
		return versao;
	}

	/*
	 * M�todo set guarda na vari�vel privada
	 * o n�mero da vers�o
	 */	
	public void setVersao(double versao) {
		this.versao = versao;
	}
	
	/*
	 * Verifica se a vers�o � desenvolvimento.
	 * A vers�o � desenvolvimento se seu valor for menor que 1.0
	 */
	public boolean isVersaoDesenvolvimento()
	{
		return this.versao < 1.0;	
	}
	
	/*
	 * Verifica se a vers�o � beta.
	 * A vers�o � beta se seu valor for menor ou igual a 2.0
	 */
	public boolean isVersaoBeta()
	{
		return this.versao <= 2.0;	
	}	
	
	/*
	 * Verifica se a vers�o Final.
	 * A vers�o � final se seu valor for maior que 2.0
	 */
	public boolean isVersaoFinal()
	{
		return this.versao > 2.0;	
	}			
	
}
