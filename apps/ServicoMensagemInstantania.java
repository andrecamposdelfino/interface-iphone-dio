package apps;

public abstract class ServicoMensagemInstantania {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	public abstract void salvarHistoricoMensagem();
	
	protected void validarConexao() {
		System.out.println("Conectado com a internet!!");
	}
	
}
