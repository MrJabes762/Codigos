import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaMapDeObjetos {
    private Map <String,Integer> mapDosObjetos;
    
    
    public ListaMapDeObjetos() {
        setMapDosObjetos();
    }
    public void adicionarItensNaLista(String chave, Integer obj) {
       getMapDosObjetos().put(chave, obj);
    }

    public Map<String, Integer> getMapDosObjetos() {
        return mapDosObjetos;
    }

    public void setMapDosObjetos() {
        this.mapDosObjetos = new HashMap<>();
    }

    public List<Map.Entry<String, Integer>> ListadeObjetos() {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(getMapDosObjetos().entrySet());
            for (int i = 0; i < entries.size(); i++) {
                Map.Entry<String, Integer> entry = entries.get(i);
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Chave: " + key + ", Valor: " + value);
            }
        return entries;
    }
}
