package br.com.estudo.java.sistemas;

/*
 * Classe controladora de sistema
 */
public class ControladorDeSistema {

	public static void main(String[] args) {

		/*
		 * Classe Sistema implementada no arquivo Sistema.java
		 */
		Sistema sistema = new Sistema();
		sistema.setVersao(1.0);

		/*
		 * M�todo pra mostrar qual � a vers�o do sistema Implementado logo
		 * abaixo do m�todo Main
		 */
		MensagemDaVersaoDoSistema(sistema);

		/*
		 * Fazendo upgrade de vers�o com while
		 */
		while (sistema.getVersao() < 10) {
			double versao = sistema.getVersao();
			System.out.println(versao);
			sistema.setVersao(versao + 1);
		}

		/*
		 * M�todo pra mostrar qual � a vers�o do sistema Implementado logo
		 * abaixo do m�todo Main
		 */
		MensagemDaVersaoDoSistema(sistema);
	}

	/*
	 * M�todo pra mostrar qual � a vers�o do sistema Recebe por par�metro um
	 * Sistema
	 */
	public static void MensagemDaVersaoDoSistema(Sistema sistema) {
		if (sistema.isVersaoDesenvolvimento()) {
			System.out.println("ATEN��O : Vers�o do sitema � de desenvolvimento");

		} else if (sistema.isVersaoBeta()) {
			System.out.println("ATEN��O : Vers�o do sitema � beta");

		} else if (sistema.isVersaoFinal()) {
			System.out.println("ATEN��O : Vers�o do sitema � a Final");

		}
	}
}
