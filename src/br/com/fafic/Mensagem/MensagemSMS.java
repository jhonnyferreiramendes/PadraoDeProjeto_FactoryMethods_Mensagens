package br.com.fafic.Mensagem;

import javax.swing.JOptionPane;

public class MensagemSMS implements Mensagem {

	
	public void enviarMensagem(String mensagem) {
	JOptionPane.showMessageDialog(null, "SMS: " + mensagem);
		
	}

}
