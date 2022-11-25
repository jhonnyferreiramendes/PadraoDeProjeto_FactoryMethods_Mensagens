import javax.swing.JOptionPane;

import br.com.fafic.Mensagem.Mensagem;
import br.com.fafic.Mensagem.MensagemFactory;

public class Main {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Informe a mensagem");

		Mensagem mensagem = MensagemFactory.getMensagem("sms");
		mensagem.enviarMensagem(texto);

	}

}
