package com.messagem;

import apps.FacebookMessage;
import apps.MsnMessage;
import apps.ServicoMensagemInstantania;
import apps.Telegran;

public class Computador {
	
	public static void main(String[] args) {
		ServicoMensagemInstantania smi = null;
		
		String appEscolhido = "Msn";
		
		if(appEscolhido.equals("Msn")) {
			smi = new MsnMessage();
		}else if(appEscolhido.equals("Fbm")) {
			smi = new FacebookMessage();
		}else if(appEscolhido.equals("tlg")) {
			smi = new Telegran();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		

	}

}
