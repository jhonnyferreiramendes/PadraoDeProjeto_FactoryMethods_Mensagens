package br.com.fafic.Mensagem;

import javax.swing.JOptionPane;

public class MensagemEmail implements Mensagem {

	@Override
	public void enviarMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, "E-mail: " + mensagem);

	}

}
