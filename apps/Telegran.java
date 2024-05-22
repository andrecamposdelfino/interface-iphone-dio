package apps;

public class Telegran extends ServicoMensagemInstantania {
	
	
	

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConexao();
		System.out.println("Enviando mensagem pelo Telegram");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Telegram");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
