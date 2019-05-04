package observer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
 
 public static void main(String[] args) throws IOException {
  Map<String, Object> mapa = new HashMap<>();
  mapa.put("nome", "Clayton");
  mapa.put("idade", 39);
  List<Processador> processadores = new ArrayList<Processador>();
     processadores.add(new ProcessaCriptografado());
     processadores.add(new ProcessaCompactado()); 
     
  List<Processador> processadores1 = new ArrayList<Processador>();
     processadores1.add(new ProcessaCompactado());
     processadores1.add(new ProcessaCriptografado()); 
     
  List<Processador> processadores2 = new ArrayList<Processador>();
     processadores2.add(new ProcessaDefault());
     processadores2.add(new ProcessaCompactado());
  
  
  GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores));
  gerador.gerarArquivo("c:\\Gerador\\Prop1.zip", mapa);
  
  GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessadorComposto(processadores1));
  gerador1.gerarArquivo("c:\\Gerador\\Xml1.txt", mapa);  
  
  GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores2));
  gerador2.gerarArquivo("c:\\Gerador\\Default.zip", mapa);
 }

}
