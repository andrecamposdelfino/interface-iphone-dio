package interfaceiphone;

public class Iphone implements ReprodutorMusical, Aparelhotelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("[NAVEGADOR ] : EXIBINDO PAGINA");
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("[NAVEGADOR ] : ADICIONANDO NOVA ABA");
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("[NAVEGADOR ] : ATALIZANDO A PAGINA");
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("[IPHONE ] : EXIBINDO FAZENDO LIGACAO");
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("[IPHONE ] : ATENDENDO UMA LIGACAO");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("[IPHONE ] : INICIANDO CORREIO DE VOZ");
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("[REPRODUTOR ] : TOCAND");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("[REPRODUTOR ] : PAUSANDO A MUSICA");
		
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("[REPRODUTOR ] : SELECIONANDO MUSICA");
		
	}

}
