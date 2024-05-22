package interfaces;

public class OldTv implements Televisao{

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("[OLD TV ] : LIGANDO");
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("[OLD TV ] : DESLIGANDO");
		
	}

	@Override
	public void alterarVolume() {
		// TODO Auto-generated method stub
		System.out.println("[OLD TV ] : ALTERANDO O VOLUME");
		
	}

	@Override
	public void alterarCanal() {
		// TODO Auto-generated method stub
		System.out.println("[OLD TV ] : ALTERANDO O CANAL");
		
	}

}
