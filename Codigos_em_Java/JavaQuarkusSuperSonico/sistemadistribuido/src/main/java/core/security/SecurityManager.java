package core.security;

import java.util.HashMap;
import java.util.Map;

class SecurityManager {

    private static  Map<String, String> usuarios;

    SecurityManager() {
       usuarios = new HashMap<>();
    }
    
    static {
        // Usuários simulados: username -> chave secreta
        usuarios.put("sensor01", "segredo01");
        usuarios.put("admin", "admin123");
    }

    static boolean autenticar(String usuario, String hmac, String mensagem) {
        if (!usuarios.containsKey(usuario)) return false;
        String chave = usuarios.get(usuario);
        return HmacUtil.verificarHmac(mensagem, chave, hmac);
    }

    static String getChaveSecreta(String usuario) {
        return usuarios.get(usuario);
    }
}