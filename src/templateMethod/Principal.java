package templateMethod;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
 
 public static void main(String[] args) throws IOException {
  Map<String, Object> mapa = new HashMap<>();
  mapa.put("nome", "Clayton");
  mapa.put("idade", 39);
  
  GeradorArquivo gerador = new GeradorArquivoPropriedades();
  gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
  
  GeradorArquivo gerador1 = new GeradorArquivoXml();
  gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);  
  
  GeradorArquivo gerador2 = new GeradorPropriedadesDefault();
  gerador2.gerarArquivo("c:\\Gerador\\Default.txt", mapa);
 }

}
