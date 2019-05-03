package composite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {
	private Processador processador;
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
	}
 
 public final void gerarArquivo(String nome, Map<String,Object> propriedades) throws IOException {
  
 /* if (tipo.equals("PROPRIEDADES_CRIPTOGRAFADO")) {
	  ProcessaPropriedadesCriptografado propCript = new ProcessaPropriedadesCriptografado();
   
   bytes = propCript.processaPropriedadesCriptografado(propriedades);
  } else if (tipo.equals("XML_COMPACTADO")) {
	  ProcessaXmlCompactado xml = new ProcessaXmlCompactado();
   
   bytes = xml.processaXmlCompactado(propriedades);
  } else {
   System.out.println("Desconheço essa opção");
  }*/
  String conteudo = gerarConteudo(propriedades);
  byte[] bytes = processador.processaConteudo(conteudo.getBytes());
  FileOutputStream fileout = new FileOutputStream(nome);
  fileout.write(bytes);
  fileout.close();
 }
 protected abstract String gerarConteudo(Map<String,Object> propriedades);
 
}