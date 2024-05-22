package apps;

public class FacebookMessage extends ServicoMensagemInstantania {
	
	

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Facebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
