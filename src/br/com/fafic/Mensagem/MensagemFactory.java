package br.com.fafic.Mensagem;

public class MensagemFactory {

	public static Mensagem getMensagem(String mensagem) {
		if (mensagem.equalsIgnoreCase("SMS")) {
			return new MensagemSMS();
		} else if (mensagem.equalsIgnoreCase("Email")) {
			return new MensagemEmail();
		} else {
			return null;
		}

	}

}
