package br.com.estudo.java.sistemas;

public class Sistema {

	/*
	 * variável privada : visto apenas na classe
	 * recebe e guarda o valor da versão
	 */
	private double versao;

	/*
	 * Método get recupera da variável privada
	 * o número da versão
	 */
	public double getVersao() {
		return versao;
	}

	/*
	 * Método set guarda na variável privada
	 * o número da versão
	 */	
	public void setVersao(double versao) {
		this.versao = versao;
	}
	
	/*
	 * Verifica se a versão é desenvolvimento.
	 * A versão é desenvolvimento se seu valor for menor que 1.0
	 */
	public boolean isVersaoDesenvolvimento()
	{
		return this.versao < 1.0;	
	}
	
	/*
	 * Verifica se a versão é beta.
	 * A versão é beta se seu valor for menor ou igual a 2.0
	 */
	public boolean isVersaoBeta()
	{
		return this.versao <= 2.0;	
	}	
	
	/*
	 * Verifica se a versão Final.
	 * A versão é final se seu valor for maior que 2.0
	 */
	public boolean isVersaoFinal()
	{
		return this.versao > 2.0;	
	}			
	
}
