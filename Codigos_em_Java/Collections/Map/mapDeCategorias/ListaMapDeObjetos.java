import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaMapDeObjetos {
    private Map<String, Object> mapDosObjetos;

    public ListaMapDeObjetos() {
        setMapDosObjetos();
    }

    public void adicionarItensNaLista(String chave, Object obj) {
        getMapDosObjetos().put(chave, obj);
    }

    public Map<String, Object> getMapDosObjetos() {
        return mapDosObjetos;
    }

    public void setMapDosObjetos() {
        this.mapDosObjetos = new HashMap<>();
    }

    public Map<String, Object> obterMapaDeObjetos() {
        return new HashMap<>(getMapDosObjetos());
    }

    public List<Map.Entry<String, Object>> obterListaDeObjetos() {
        List<Map.Entry<String, Object>> entries = new ArrayList<>(getMapDosObjetos().entrySet());
        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<String, Object> entry = entries.get(i);
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Chave: " + key + ", Valor: " + value);
        }
        return entries;
    }
}