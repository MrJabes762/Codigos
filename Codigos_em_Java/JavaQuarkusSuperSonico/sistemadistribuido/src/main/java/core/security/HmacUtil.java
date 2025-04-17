package core.security;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

class HmacUtil {

    private static final String ALGORITHM = "HmacSHA256";

    static String gerarHmac(String mensagem, String chaveSecreta) {
        try {
            Mac mac = Mac.getInstance(ALGORITHM);
            SecretKeySpec chave = new SecretKeySpec(chaveSecreta.getBytes(), ALGORITHM);
            mac.init(chave);
            byte[] hmacBytes = mac.doFinal(mensagem.getBytes());
            return Base64.getEncoder().encodeToString(hmacBytes);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar HMAC", e);
        }
    }

    static boolean verificarHmac(String mensagem, String chaveSecreta, String hmacEsperado) {
        String hmacCalculado = gerarHmac(mensagem, chaveSecreta);
        return hmacCalculado.equals(hmacEsperado);
    }
}
