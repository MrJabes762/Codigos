package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> idadePorNome = new HashMap<>();
        idadePorNome.put("Alice", 25);
        idadePorNome.put("Bob", 30);
        idadePorNome.put("Eva", 22);


        int idadeDoBob = idadePorNome.get("Bob");
        System.out.println("A idade do Bob é: " + idadeDoBob);

        if (idadePorNome.containsKey("Alice")) {
            System.out.println("A Alice está presente no HashMap.");
        }

        for (String nome : idadePorNome.keySet()) {
            int idade = idadePorNome.get(nome);
            System.out.println(nome + " tem " + idade + " anos.");
        }

        idadePorNome.remove("Eva");

        if (idadePorNome.isEmpty()) {
            System.out.println("O HashMap está vazio.");
        }
    }
}
