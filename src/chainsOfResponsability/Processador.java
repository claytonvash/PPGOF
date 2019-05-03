package chainsOfResponsability;

import java.io.IOException;

public abstract class Processador {
	
	private Processador proximoProcessador;
	
	public Processador (Processador proximoProcessador) {
		this.proximoProcessador = proximoProcessador;
	}
	public Processador() {
		this.proximoProcessador = new ProcessaDefault();
		
	}
	public byte[] processarCadeia(byte[] bytes) throws IOException{
		bytes = processaConteudo(bytes);
		return proximoProcessador.processarCadeia(bytes);
	}
	protected abstract byte[] processaConteudo(byte[] bytes) throws IOException;

}
