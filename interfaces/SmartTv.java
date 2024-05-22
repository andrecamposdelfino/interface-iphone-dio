package interfaces;

public class SmartTv implements Televisao {

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("[SMART TV ] : LIGANDO");
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("[SMART TV ] : DESLIGANDO");
		
	}

	@Override
	public void alterarVolume() {
		// TODO Auto-generated method stub
		System.out.println("[SMART TV ] : ALTERANDO O VOLUME");
		
	}

	@Override
	public void alterarCanal() {
		// TODO Auto-generated method stub
		System.out.println("[SMART TV ] : ALTERANDO O CANAL");
		
	}

}
