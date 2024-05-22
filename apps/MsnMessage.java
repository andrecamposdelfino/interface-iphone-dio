package apps;

public class MsnMessage extends ServicoMensagemInstantania {
	
	

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConexao();
		System.out.println("Enviando mensagem pelo Msn");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Msn");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
