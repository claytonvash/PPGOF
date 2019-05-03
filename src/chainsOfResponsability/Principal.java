package chainsOfResponsability;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
 
 public static void main(String[] args) throws IOException {
  Map<String, Object> mapa = new HashMap<>();
  mapa.put("nome", "Clayton");
  mapa.put("idade", 39);
  
  Processador processaCompactado = new ProcessaCompactado();
  Processador processaCriptografado = new ProcessaCriptografado(processaCompactado);
  
    
  GeradorArquivo gerador = new GeradorArquivoPropriedades(processaCriptografado);
  gerador.gerarArquivo("c:\\Gerador\\Prop1.zip", mapa);
  
 
 }

}
