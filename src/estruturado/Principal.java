package estruturado;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
 
 public static void main(String[] args) throws IOException {
  Map<String, Object> mapa = new HashMap<>();
  mapa.put("nome", "Leonam");
  mapa.put("idade", 32);
  
  GeradorArquivo gerador = new ProcessaPropriedadesCriptografado();
  gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
  
  GeradorArquivo gerador1 = new ProcessaXmlCompactado();
  gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);  
 }

}
